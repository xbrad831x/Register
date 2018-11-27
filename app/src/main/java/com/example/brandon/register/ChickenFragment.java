package com.example.brandon.register;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class ChickenFragment extends Fragment {

    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15;
    Item OneBreast = new Item("1Pc Breast", 2.99);
    Item OneThigh = new Item("1Pc Thigh", 2.19);
    Item OneLeg = new Item("1Pc Leg", 2.19);
    Item OneWing = new Item("1Pc Wing", 1.99);
    Item TwoPieceLT = new Item("2Pc L/T", 4.29);
    Item TwoPieceBW = new Item("2Pc B/W", 4.69);
    Item ThreepieceLT = new Item("3Pc L/T", 4.99);
    Item ThreePieceBW = new Item("3Pc B/W", 6.29);
    Item FourPieceBWLT = new Item("4Pc B/W/L/T", 6.29);
    Item FourPieceWings = new Item("4Pc Wings", 4.79);
    Item EightPiece = new Item("8Pc Only", 16.49);
    Item TenPiece = new Item("10Pc Only", 17.99);
    Item TwelvePiece = new Item("12Pc Only", 21.99);
    Item SixteenPiece = new Item("16Pc Only", 28.99);
    Item TwentyPiece = new Item("20Pc Only", 32.49);


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_chicken, container, false);

        b1 = (Button)view.findViewById(R.id.onePieceBreast);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity)getActivity()).addItem(OneBreast);
            }
        });

        b2 = (Button)view.findViewById(R.id.twoPieceLT);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity)getActivity()).addItem(TwoPieceLT);
            }
        });

        b3 = (Button)view.findViewById(R.id.twoPieceBW);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity)getActivity()).addItem(TwoPieceBW);
            }
        });

        b4 = (Button)view.findViewById(R.id.threePieceLT);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity)getActivity()).addItem(ThreepieceLT);
            }
        });

        b5 = (Button)view.findViewById(R.id.threePieceBW);
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity)getActivity()).addItem(ThreePieceBW);
            }
        });

        b6 = (Button)view.findViewById(R.id.fourPieceBWLT);
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity)getActivity()).addItem(FourPieceBWLT);
            }
        });

        b7 = (Button)view.findViewById(R.id.fourPieceWing);
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity)getActivity()).addItem(FourPieceWings);
            }
        });

        b8 = (Button)view.findViewById(R.id.eightPiece);
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity)getActivity()).addItem(EightPiece);
            }
        });

        b9 = (Button)view.findViewById(R.id.tenPiece);
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity)getActivity()).addItem(TenPiece);
            }
        });

        b10 = (Button)view.findViewById(R.id.twelvePiece);
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity)getActivity()).addItem(TwelvePiece);
            }
        });

        b11 = (Button)view.findViewById(R.id.sixteenPiece);
        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity)getActivity()).addItem(SixteenPiece);
            }
        });

        b12 = (Button)view.findViewById(R.id.twentyPiece);
        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity)getActivity()).addItem(TwentyPiece);
            }
        });

        b13 = (Button)view.findViewById(R.id.onePieceThigh);
        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity)getActivity()).addItem(OneThigh);
            }
        });

        b14 = (Button)view.findViewById(R.id.onePieceLeg);
        b14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity)getActivity()).addItem(OneLeg);
            }
        });

        b15 = (Button)view.findViewById(R.id.onePieceWing);
        b15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity)getActivity()).addItem(OneWing);
            }
        });

        return view;
    }

}
