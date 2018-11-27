package com.example.brandon.register;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class DessertsFragment extends Fragment {

    Button b1, b2, b3, b4, b5, b6;
    Item MiniCake = new Item("Mini Cake", 2.19);
    Item FamilyCake = new Item("Family Cake", 4.99);
    Item OneCookie = new Item("1 Cookie", .59);
    Item TwelveCookie = new Item("12 Cookies", 4.99);
    Item TwoTurnovers = new Item("2 Turnovers", 1.59);
    Item ThreeCookies = new Item("3 Cookies", 1.39);

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_desserts, container, false);

        b1 = (Button)view.findViewById(R.id.miniCake);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity)getActivity()).addItem(MiniCake);
            }
        });

        b2 = (Button)view.findViewById(R.id.familyCake);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity)getActivity()).addItem(FamilyCake);
            }
        });

        b3 = (Button)view.findViewById(R.id.appleTurnovers);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity)getActivity()).addItem(TwoTurnovers);
            }
        });

        b4 = (Button)view.findViewById(R.id.oneCookie);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity)getActivity()).addItem(OneCookie);
            }
        });

        b5 = (Button)view.findViewById(R.id.twelveCookie);
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity)getActivity()).addItem(TwelveCookie);
            }
        });

        b6 = (Button)view.findViewById(R.id.threeCookie);
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity)getActivity()).addItem(ThreeCookies);
            }
        });

        return view;
    }

}
