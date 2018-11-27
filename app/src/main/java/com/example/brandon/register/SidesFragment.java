package com.example.brandon.register;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class SidesFragment extends Fragment {

    Button b1, b2, b3, b4, b5, b6;
    Item SmallSide = new Item("Small Side", 2.39);
    Item LargeSide = new Item("Large Side", 3.99);
    Item TwoBiscuits = new Item("2 Biscuits", 1.39);
    Item FourBiscuits = new Item("4 Biscuits", 2.29);
    Item Jalapeno = new Item("Jalapeno", .39);

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_sides, container, false);

        b1 = (Button)view.findViewById(R.id.smallSide);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity)getActivity()).addItem(SmallSide);
            }
        });

        b2 = (Button)view.findViewById(R.id.largeSide);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity)getActivity()).addItem(LargeSide);
            }
        });

        b3 = (Button)view.findViewById(R.id.twoBiscuits);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity)getActivity()).addItem(TwoBiscuits);
            }
        });

        b4 = (Button)view.findViewById(R.id.fourBiscuits);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity)getActivity()).addItem(FourBiscuits);
            }
        });

        b5 = (Button)view.findViewById(R.id.jalapeno);
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity)getActivity()).addItem(Jalapeno);
            }
        });

        return view;
    }

}
