package com.example.brandon.register;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class DrinksFragment extends Fragment {

    Button b1, b2, b3, b4, b5, b6;
    Item SmallDrink = new Item("Small Drink", 1.89);
    Item MediumDrink = new Item("Medium Drink", 1.99);
    Item LargeDrink = new Item("Large Drink", 2.19);
    Item HalfGallonStrawberryLemonade = new Item("1/2 Gallon Strawberry Lemonade", 3.99);
    Item HalfGallonIceTea = new Item("1/2 Gallon Ice Tea", 2.29);
    Item OneHalfLiterPepsi = new Item("1.5 Liter Pepsi", 2.49);

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_drinks, container, false);

        b1 = (Button)view.findViewById(R.id.smallDrink);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity)getActivity()).addItem(SmallDrink);
            }
        });

        b2 = (Button)view.findViewById(R.id.mediumDrink);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity)getActivity()).addItem(MediumDrink);
            }
        });

        b3 = (Button)view.findViewById(R.id.largeDrink);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity)getActivity()).addItem(LargeDrink);
            }
        });

        b4 = (Button)view.findViewById(R.id.halfGallonStrawberryLemonade);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity)getActivity()).addItem(HalfGallonStrawberryLemonade);
            }
        });

        b5 = (Button)view.findViewById(R.id.halfGallonIceTea);
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity)getActivity()).addItem(HalfGallonIceTea);
            }
        });

        b6 = (Button)view.findViewById(R.id.oneLiterPepsi);
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity)getActivity()).addItem(OneHalfLiterPepsi);
            }
        });

        return view;
    }

}
