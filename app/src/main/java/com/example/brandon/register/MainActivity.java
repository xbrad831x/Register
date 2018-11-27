package com.example.brandon.register;

import android.content.ClipData;
import android.content.DialogInterface;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public static double TAX_RATE = 0.0825;
    public double taxtotal, totalamount, totalbaseamount, changeamount, cashamount = 0;

    Button ClearButton, PayButton;

    Fragment fragment = new Register_Buttons();
    FragmentManager fm = getSupportFragmentManager();
    FragmentTransaction ft = fm.beginTransaction();

    ArrayList<Item> items = new ArrayList<Item>();
    ListView lv;
    TextView tax, total, change;

    ArrayAdapter<Item> arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ClearButton = (Button)findViewById(R.id.clearButton);
        PayButton = (Button)findViewById(R.id.payButton);

        ClearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clearAllItems();
            }
        });
        PayButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Charge();
            }
        });

        ft.replace(R.id.fragment_container, fragment);
        ft.commit();

        arrayAdapter = new ArrayAdapter<Item>(this, R.layout.row_item, items);
        lv = (ListView)findViewById(R.id.listView);

        tax = (TextView)findViewById(R.id.tax_value);
        total = (TextView)findViewById(R.id.total_value);
        change = (TextView)findViewById(R.id.change_value);
    }

    public void addItem(Item i) {
        items.add(i);

        if(totalamount == 0)
        {
            taxtotal = i.getPrice() * TAX_RATE;
            totalbaseamount = i.getPrice();
            totalamount = totalbaseamount * TAX_RATE + totalbaseamount;
            total.setText(String.format("%.2f",totalamount));
            tax.setText(String.format("%.2f",taxtotal));
        }
        else
        {
            totalbaseamount = totalbaseamount + i.getPrice();
            taxtotal = totalbaseamount * TAX_RATE;
            totalamount = totalbaseamount * TAX_RATE + totalbaseamount;
            total.setText(String.format("%.2f",totalamount));
            tax.setText(String.format("%.2f", taxtotal));
        }

        lv.setAdapter(arrayAdapter);
        lv.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener()
        {
            public boolean onItemLongClick(AdapterView<?> arg0, View v, int position, long arg3)
            {
                totalbaseamount -= items.get(position).getPrice();
                taxtotal = totalbaseamount * TAX_RATE;
                totalamount = totalbaseamount * TAX_RATE + totalbaseamount;
                total.setText(String.format("%.2f", totalamount));
                tax.setText(String.format("%.2f", taxtotal));
                items.remove(position);
                arrayAdapter.notifyDataSetChanged();
                return false;
            }
        });
    }

    public void clearAllItems() {
        items.clear();
        totalbaseamount = 0;
        taxtotal = 0;
        totalamount = 0;
        total.setText("0");
        tax.setText("0");
        arrayAdapter.notifyDataSetChanged();
    }

    public void Charge() {
        AlertDialog.Builder ad = new AlertDialog.Builder(MainActivity.this);
        final EditText amount = new EditText(MainActivity.this);
        amount.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_FLAG_DECIMAL);
        ad.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                cashamount = Double.parseDouble(amount.getText().toString());
                changeamount = cashamount - totalamount;
                if(changeamount > 0 && totalamount != 0)
                {
                    change.setText(String.format("%.2f", changeamount));
                }
                else
                {
                    Toast.makeText(MainActivity.this, "Not enough cash.", Toast.LENGTH_SHORT).show();
                }
            }
        });
        ad.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });

        ad.setView(amount);
        ad.create().show();
    }
}
