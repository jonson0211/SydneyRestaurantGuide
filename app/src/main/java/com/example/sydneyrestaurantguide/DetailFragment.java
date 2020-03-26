package com.example.sydneyrestaurantguide;

import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.appbar.CollapsingToolbarLayout;


public class DetailFragment extends Fragment {

    public static final String ARG_ITEM_ID = "item_id";



    private Restaurant mRestaurant;

    public DetailFragment() {

    }



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(getArguments().containsKey(ARG_ITEM_ID)) {
            mRestaurant = Restaurant.getRestaurant(getArguments().getString(ARG_ITEM_ID));
            this.getActivity().setTitle(mRestaurant.getName());
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        View rootView = inflater.inflate(R.layout.fragment_detail, container, false);


        if(mRestaurant != null) {
            CollapsingToolbarLayout collapsingToolbarLayout;

            collapsingToolbarLayout = rootView.findViewById(R.id.collapseLayout);
            collapsingToolbarLayout.setTitle(mRestaurant.getName());
            collapsingToolbarLayout.setExpandedTitleColor(Color.WHITE);
            collapsingToolbarLayout.setCollapsedTitleTextColor(Color.WHITE);
            ((TextView) rootView.findViewById(R.id.name)).setText("Rank " + String.valueOf(mRestaurant.getRank()) + ": " + mRestaurant.getName());
            ((TextView) rootView.findViewById(R.id.rating)).setText(mRestaurant.getRating());
            ((TextView) rootView.findViewById(R.id.cuisineField)).setText(mRestaurant.getCuisine());
            ((TextView) rootView.findViewById(R.id.priceField)).setText(mRestaurant.getPrice());
            ((TextView) rootView.findViewById(R.id.topOrderField)).setText(mRestaurant.getTopOrder());
            ((TextView) rootView.findViewById(R.id.reviewField)).setText(mRestaurant.getReview());
            ((ImageView) rootView.findViewById(R.id.logo)).setImageResource(rootView.getResources().getIdentifier("logo" + mRestaurant.getRank(), "drawable", "com.example.sydneyrestaurantguide"));
            ((ImageView) rootView.findViewById(R.id.restaurantBanner)).setImageResource(rootView.getResources().getIdentifier("banner" + mRestaurant.getRank(), "drawable", "com.example.sydneyrestaurantguide"));
        }

        return rootView;
    }
}
