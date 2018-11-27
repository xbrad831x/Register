package com.example.brandon.register;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class SpecialsPromotions extends Fragment {

    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16;
    Item MondaySpecial = new Item("Monday Special", 3.99);
    Item WednesdaySpecial = new Item("Wednesday Special", 3.99);
    Item FamilyFillUp = new Item("$20 Family Fill Up", 20.00);
    Item BucketShare = new Item("$10 Bucket Share", 10.00);
    Item TenPieceCoupon = new Item("10Pc Coupon", 13.99);
    Item TwoPieceCoupon = new Item("2Pc Coupon", 2.99);
    Item PopcornCoupon = new Item("Popcorn Coupon", 3.49);
    Item ThreePieceLTCoupon = new Item("3Pc L/T Coupon", 6.49);
    Item ThreePieceBWCoupon = new Item("3Pc B/W Coupon", 7.49);
    Item TwentyHotWingsCoupon = new Item("20 Hot Wings Coupon", 11.99);
    Item SevenPieceCoupon = new Item("7Pc L/T Meal Coupon", 14.99);
    Item TwelvePieceMealCoupon = new Item("12Pc Feast Meal Coupon", 25.99);
    Item SixteenPieceMealCoupon = new Item("16Pc Meal Coupon", 30.99);
    Item BreastSubstitution = new Item("Breast Substitution", 1.09);
    Item NashGoldSubstitution = new Item("Nash/Gold Substitution", 0.25);
    Item NashGoldBasket = new Item("Nash/Gold Basket", 5.49);

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_specials_promotions, container, false);

        b1 = (Button)view.findViewById(R.id.mondaySpecial);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity)getActivity()).addItem(MondaySpecial);
            }
        });

        b2 = (Button)view.findViewById(R.id.wednesdaySpecial);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity)getActivity()).addItem(WednesdaySpecial);
            }
        });

        b3 = (Button)view.findViewById(R.id.familyFillUp);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity)getActivity()).addItem(FamilyFillUp);
            }
        });

        b4 = (Button)view.findViewById(R.id.bucketShare);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity)getActivity()).addItem(BucketShare);
            }
        });

        b5 = (Button)view.findViewById(R.id.tenPieceCoupon);
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity)getActivity()).addItem(TenPieceCoupon);
            }
        });

        b6 = (Button)view.findViewById(R.id.twoPieceLTCoupon);
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity)getActivity()).addItem(TwoPieceCoupon);
            }
        });

        b7 = (Button)view.findViewById(R.id.popcornCoupon);
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity)getActivity()).addItem(PopcornCoupon);
            }
        });

        b8 = (Button)view.findViewById(R.id.threePieceLTCoupon);
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity)getActivity()).addItem(ThreePieceLTCoupon);
            }
        });

        b9 = (Button)view.findViewById(R.id.threePieceBWCoupon);
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity)getActivity()).addItem(ThreePieceBWCoupon);
            }
        });

        b10 = (Button)view.findViewById(R.id.twentyHotWingsCoupon);
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity)getActivity()).addItem(TwentyHotWingsCoupon);
            }
        });

        b11 = (Button)view.findViewById(R.id.sevenPieceLTMealCoupon);
        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity)getActivity()).addItem(SevenPieceCoupon);
            }
        });

        b12 = (Button)view.findViewById(R.id.twelvePieceFeastCoupon);
        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity)getActivity()).addItem(TwelvePieceMealCoupon);
            }
        });

        b13 = (Button)view.findViewById(R.id.sixteenPieceFeastCoupon);
        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity)getActivity()).addItem(SixteenPieceMealCoupon);
            }
        });

        b14 = (Button)view.findViewById(R.id.breastSubstitution);
        b14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity)getActivity()).addItem(BreastSubstitution);
            }
        });

        b15 = (Button)view.findViewById(R.id.nashGoldSubstitution);
        b15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity)getActivity()).addItem(NashGoldSubstitution);
            }
        });

        b16 = (Button)view.findViewById(R.id.nashGoldBasket);
        b16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity)getActivity()).addItem(NashGoldBasket);
            }
        });

        return view;
    }

}
