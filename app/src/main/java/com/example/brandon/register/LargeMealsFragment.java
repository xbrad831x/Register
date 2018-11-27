package com.example.brandon.register;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class LargeMealsFragment extends Fragment {

    Button b1, b2, b3, b4, b5;
    Item EightPieceMeal = new Item("8Pc Meal", 22.49);
    Item TenPieceMeal = new Item("10Pc Meal", 25.99);
    Item TwelvePieceMeal = new Item("12Pc Meal", 30.99);
    Item SixteenPieceMeal = new Item("16Pc Meal", 39.99);
    Item TwentyPieceMeal = new Item("20Pc Meal", 45.99);

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_large_meals, container, false);

        b1 = (Button)view.findViewById(R.id.eightPieceMeal);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity)getActivity()).addItem(EightPieceMeal);
            }
        });

        b2 = (Button)view.findViewById(R.id.tenPieceMeal);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity)getActivity()).addItem(TenPieceMeal);
            }
        });

        b3 = (Button)view.findViewById(R.id.twelvePieceMeal);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity)getActivity()).addItem(TwelvePieceMeal);
            }
        });

        b4 = (Button)view.findViewById(R.id.sixteenPieceMeal);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity)getActivity()).addItem(SixteenPieceMeal);
            }
        });

        b5 = (Button)view.findViewById(R.id.twentyPieceMeal);
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity)getActivity()).addItem(TwentyPieceMeal);
            }
        });

        return view;
    }
}
