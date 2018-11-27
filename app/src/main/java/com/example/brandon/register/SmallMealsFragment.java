package com.example.brandon.register;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class SmallMealsFragment extends Fragment {

    Button b1, b2, b3, b4, b5, b6, b7;
    Item OnePieceBreastMeal = new Item("1Pc Breast Meal", 6.61);
    Item TwoPieceLTMeal = new Item("2Pc L/T Meal", 6.49);
    Item TwoPieceBWMeal = new Item("2Pc B/W Meal", 7.19);
    Item ThreePieceLTMeal = new Item("3Pc L/T Meal", 7.39);
    Item ThreePieceBWMeal = new Item("3Pc B/W Meal", 8.89);
    Item FourPieceWingMeal = new Item("4Pc Wing Meal", 5.79);
    Item FourPieceBWLTMeal = new Item("4Pc B/W/L/T Meal", 8.09);

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_small_meals, container, false);
        b1 = (Button)view.findViewById(R.id.onePieceBreastMeal);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity)getActivity()).addItem(OnePieceBreastMeal);
            }
        });

        b2 = (Button)view.findViewById(R.id.twoPieceLTMeal);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity)getActivity()).addItem(TwoPieceLTMeal);
            }
        });

        b3 = (Button)view.findViewById(R.id.twoPieceBWMeal);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity)getActivity()).addItem(TwoPieceBWMeal);
            }
        });

        b4 = (Button)view.findViewById(R.id.threePieceLTMeal);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity)getActivity()).addItem(ThreePieceLTMeal);
            }
        });

        b5 = (Button)view.findViewById(R.id.threePieceBWMeal);
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity)getActivity()).addItem(ThreePieceBWMeal);
            }
        });

        b6 = (Button)view.findViewById(R.id.fourPieceMeal);
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity)getActivity()).addItem(FourPieceBWLTMeal);
            }
        });

        b7 = (Button)view.findViewById(R.id.fourPieceWingMeal);
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity)getActivity()).addItem(FourPieceWingMeal);
            }
        });

        return view;
    }
}
