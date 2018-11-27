package com.example.brandon.register;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class OthersFragment extends Fragment {

    Button b7, b8, b9, b10, b11, b12, b13, b14, b15, b16;
    Item FivePieceHotWings = new Item("5Pc How Wings", 4.19);
    Item TenPieceHotWings = new Item("10Pc How Wings", 7.49);
    Item TwentyPieceHotWings = new Item("20Pc How Wings", 13.99);
    Item GoCup = new Item("Go Cup", 3.19);
    Item PopcornNuggets = new Item("Popcorn Nuggets Only", 4.19);
    Item FamousBowl = new Item("Famous Bowl Only", 4.99);
    Item PotPie = new Item("Pot Pie Only", 4.99);
    Item ChickenLittle = new Item("Chicken Little Only", 1.79);
    Item KidsMeal = new Item("Kids Meal", 3.99);
    Item BBQSandwich = new Item("BBQ Sandwich Only", 2.29);

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_others, container, false);

        b7 = (Button)view.findViewById(R.id.fiveHotWings);
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity)getActivity()).addItem(FivePieceHotWings);
            }
        });

        b8 = (Button)view.findViewById(R.id.tenHotWings);
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity)getActivity()).addItem(TenPieceHotWings);
            }
        });

        b9 = (Button)view.findViewById(R.id.twentyHotWings);
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity)getActivity()).addItem(TwentyPieceHotWings);
            }
        });

        b10 = (Button)view.findViewById(R.id.goCup);
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity)getActivity()).addItem(GoCup);
            }
        });

        b11 = (Button)view.findViewById(R.id.popcornNuggets);
        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity)getActivity()).addItem(PopcornNuggets);
            }
        });

        b12 = (Button)view.findViewById(R.id.famousBowl);
        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity)getActivity()).addItem(FamousBowl);
            }
        });

        b13 = (Button)view.findViewById(R.id.potPie);
        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity)getActivity()).addItem(PotPie);
            }
        });

        b14 = (Button)view.findViewById(R.id.chickenLittle);
        b14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity)getActivity()).addItem(ChickenLittle);
            }
        });

        b15 = (Button)view.findViewById(R.id.kidsMeal);
        b15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity)getActivity()).addItem(KidsMeal);
            }
        });

        b16 = (Button)view.findViewById(R.id.bbqSandwich);
        b16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity)getActivity()).addItem(BBQSandwich);
            }
        });

        return view;
    }

}
