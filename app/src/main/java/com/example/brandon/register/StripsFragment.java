package com.example.brandon.register;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class StripsFragment extends Fragment {

    Button b1, b2, b3, b4, b5, b6, b7;
    Item ThreeStrips = new Item("3Pc Strips only", 4.69);
    Item ThreeStripsMeal = new Item("3Pc Strips Meal", 6.99);
    Item SixStrips = new Item("6Pc Strips only", 8.39);
    Item SixStripsMeal = new Item("6Pc Strips Meal", 9.89);
    Item TwelveStrips = new Item("12Pc Strips only", 15.99);
    Item TwelveStripsMeal = new Item("12Pc Strips Meal", 24.99);
    Item TenderWedgesForTwo = new Item("Tenders and Wedges for 2", 13.99);

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_strips, container, false);

        b1 = (Button)view.findViewById(R.id.threeStrip);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity)getActivity()).addItem(ThreeStrips);
            }
        });

        b2 = (Button)view.findViewById(R.id.threeStripMeal);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity)getActivity()).addItem(ThreeStripsMeal);
            }
        });

        b3 = (Button)view.findViewById(R.id.sixStrip);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity)getActivity()).addItem(SixStrips);
            }
        });

        b4 = (Button)view.findViewById(R.id.sixStripMeal);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity)getActivity()).addItem(SixStripsMeal);
            }
        });

        b5 = (Button)view.findViewById(R.id.twelveStrip);
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity)getActivity()).addItem(TwelveStrips);
            }
        });

        b6 = (Button)view.findViewById(R.id.twelveStripMeal);
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity)getActivity()).addItem(TwelveStripsMeal);
            }
        });

        b7 = (Button)view.findViewById(R.id.tendersWedgesForTwo);
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity)getActivity()).addItem(TenderWedgesForTwo);
            }
        });

        return view;
    }
}
