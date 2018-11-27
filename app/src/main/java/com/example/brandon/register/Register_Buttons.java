package com.example.brandon.register;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class Register_Buttons extends Fragment {

    Button smallMealsButton, largeMealsButton, combosButton, drinksButton, sidesButton, dessertsButton,
            stripsButton, chickenButton, othersButton, specialsCouponsButton;
    Fragment smallMealFrag = new SmallMealsFragment();
    Fragment largeMealFrag = new LargeMealsFragment();
    Fragment combosFrag = new CombosFragment();
    Fragment drinksFrag = new DrinksFragment();
    Fragment sidesFrag = new SidesFragment();
    Fragment dessertFrag = new DessertsFragment();
    Fragment chickenFrag = new ChickenFragment();
    Fragment stripsFrag = new StripsFragment();
    Fragment othersFrag = new OthersFragment();
    Fragment specialsCouponsFrag = new SpecialsPromotions();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_register__buttons, container, false);
        smallMealsButton = (Button)view.findViewById(R.id.smallMealsButton);
        largeMealsButton = (Button)view.findViewById(R.id.largeMealsButton);
        combosButton = (Button)view.findViewById(R.id.combosButton);
        drinksButton = (Button)view.findViewById(R.id.drinksButton);
        sidesButton = (Button)view.findViewById(R.id.sidesButton);
        dessertsButton = (Button)view.findViewById(R.id.dessertsButton);
        chickenButton = (Button)view.findViewById(R.id.chickenButton);
        stripsButton = (Button) view.findViewById(R.id.stripsButton);
        othersButton = (Button)view.findViewById(R.id.othersButton);
        specialsCouponsButton = (Button)view.findViewById(R.id.specialsCouponsButton);

        smallMealsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                displaySmall();
            }
        });
        largeMealsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                displayLarge();
            }
        });
        combosButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                displayCombos();
            }
        });
        drinksButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                displayDrinks();
            }
        });
        sidesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                displaySides();
            }
        });
        dessertsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                displayDessert();
            }
        });
        chickenButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                displayChicken();
            }
        });
        stripsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                displayStrips();
            }
        });
        othersButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                displayOthers();
            }
        });
        specialsCouponsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                displaySpecialsCoupons();
            }
        });

        return view;
    }

    public void displaySmall() {
        FragmentManager fm = getFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.fragment_container, smallMealFrag);
        ft.addToBackStack("");
        ft.commit();
    }

    public void displayLarge() {
        FragmentManager fm = getFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.fragment_container, largeMealFrag);
        ft.addToBackStack("");
        ft.commit();
    }

    public void displayCombos() {
        FragmentManager fm = getFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.fragment_container, combosFrag);
        ft.addToBackStack("");
        ft.commit();
    }

    public void displayDrinks() {
        FragmentManager fm = getFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.fragment_container, drinksFrag);
        ft.addToBackStack("");
        ft.commit();
    }

    public void displaySides() {
        FragmentManager fm = getFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.fragment_container, sidesFrag);
        ft.addToBackStack("");
        ft.commit();
    }

    public void displayDessert() {
        FragmentManager fm = getFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.fragment_container, dessertFrag);
        ft.addToBackStack("");
        ft.commit();
    }

    public void displayChicken() {
        FragmentManager fm = getFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.fragment_container, chickenFrag);
        ft.addToBackStack("");
        ft.commit();
    }

    public void displayStrips() {
        FragmentManager fm = getFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.add(R.id.fragment_container, stripsFrag);
        ft.addToBackStack("");
        ft.commit();
    }

    public void displayOthers() {
        FragmentManager fm = getFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.fragment_container, othersFrag);
        ft.addToBackStack("");
        ft.commit();
    }

    public void displaySpecialsCoupons() {
        FragmentManager fm = getFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.fragment_container, specialsCouponsFrag);
        ft.addToBackStack("");
        ft.commit();
    }

}
