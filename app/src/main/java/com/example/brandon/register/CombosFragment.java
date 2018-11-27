package com.example.brandon.register;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class CombosFragment extends Fragment {

    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14;
    Item ComboOne = new Item("#1 Zinger", 5.00);
    Item ComboTwo = new Item("#2 2Pc B/W", 7.19);
    Item ComboThree = new Item("#3 Chicken Littles", 5.99);
    Item ComboFour = new Item("#4 Popcorn", 5.99);
    Item ComboFive = new Item("#5 2Pc L/T", 5.00);
    Item ComboSix = new Item("#6 3 Tenders", 5.00);
    Item ComboSeven = new Item("#7 1Pc Breast", 5.00);
    Item ComboEight = new Item("#8 Famous Bowl", 5.00);
    Item ComboNine = new Item("#9 Pot Pie", 5.00);
    Item ComboTen = new Item("#10 3Pc L/T Big Box", 9.49);
    Item ComboEleven = new Item("#11 3 Tenders Big Box", 8.99);
    Item ComboTwelve = new Item("#12 Zinger Leg Box", 7.99);
    Item ComboThirteen = new Item("#13 5 Hot Wings Combo", 6.49);
    Item ComboFourteen = new Item("#14 BBQ Sandwich Combo", 5.19);

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_combos, container, false);
        b1 = (Button)view.findViewById(R.id.zingerCombo);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity)getActivity()).addItem(ComboOne);
            }
        });

        b2 = (Button)view.findViewById(R.id.breastWingCombo);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity)getActivity()).addItem(ComboTwo);
            }
        });

        b3 = (Button)view.findViewById(R.id.chickenLittleCombo);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity)getActivity()).addItem(ComboThree);
            }
        });

        b4 = (Button)view.findViewById(R.id.popcornCombo);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity)getActivity()).addItem(ComboFour);
            }
        });

        b5 = (Button)view.findViewById(R.id.twoPieceLTCombo);
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity)getActivity()).addItem(ComboFive);
            }
        });

        b6 = (Button)view.findViewById(R.id.stripsCombo);
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity)getActivity()).addItem(ComboSix);
            }
        });

        b7 = (Button)view.findViewById(R.id.breastCombo);
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity)getActivity()).addItem(ComboSeven);
            }
        });

        b8 = (Button)view.findViewById(R.id.bowlCombo);
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity)getActivity()).addItem(ComboEight);
            }
        });

        b9 = (Button)view.findViewById(R.id.potPieCombo);
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity)getActivity()).addItem(ComboNine);
            }
        });

        b10 = (Button)view.findViewById(R.id.threepieceLTCombo);
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity)getActivity()).addItem(ComboTen);
            }
        });

        b11 = (Button)view.findViewById(R.id.stripsBigBoxCombo);
        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity)getActivity()).addItem(ComboEleven);
            }
        });

        b12 = (Button)view.findViewById(R.id.zingerLegBigBoxCombo);
        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity)getActivity()).addItem(ComboTwelve);
            }
        });

        b13 = (Button)view.findViewById(R.id.fiveHotWingsCombo);
        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity)getActivity()).addItem(ComboThirteen);
            }
        });

        b14 = (Button)view.findViewById(R.id.BBQSandwichCombo);
        b14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity)getActivity()).addItem(ComboFourteen);
            }
        });

        return view;
    }

}
