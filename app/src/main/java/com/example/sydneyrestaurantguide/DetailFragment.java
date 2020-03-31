package com.example.sydneyrestaurantguide;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
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

    //Setting layout of view
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
            ((TextView) rootView.findViewById(R.id.rating)).setText(mRestaurant.getRating()+"/10");
            ((TextView) rootView.findViewById(R.id.cuisineField)).setText(mRestaurant.getCuisine());
            ((TextView) rootView.findViewById(R.id.priceField)).setText("$" + String.valueOf(mRestaurant.getPrice()) + " per head");
            ((TextView) rootView.findViewById(R.id.topOrderField)).setText(mRestaurant.getTopOrder());
            ((TextView) rootView.findViewById(R.id.addressField)).setText(mRestaurant.getLocation());
            ((TextView) rootView.findViewById(R.id.reviewField)).setText(mRestaurant.getReview());

            //Restaurant food images labelled as pic1, pic2.....pic10 in the drawable folder, and setImageResource() method is called to display the relevant picture below the toolbar, based on the restaurant's rank
            ((ImageView) rootView.findViewById(R.id.restaurantPic)).setImageResource(rootView.getResources().getIdentifier("pic" + mRestaurant.getRank(), "drawable", "com.example.sydneyrestaurantguide"));

            //Similar to above, except with the restaurant banner which displays on the tool bar
            ((ImageView) rootView.findViewById(R.id.restaurantBanner)).setImageResource(rootView.getResources().getIdentifier("banner" + mRestaurant.getRank(), "drawable", "com.example.sydneyrestaurantguide"));

            //Setting an onClickListener on the seeMenu button to call the searchMenu method when clicked
            ((Button) rootView.findViewById(R.id.seeMenu)).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    searchMenu(mRestaurant.getName());
                }
            });

            //Setting an onClickListener on the photoGallery button to call the searchMenu method when clicked
            ((Button) rootView.findViewById(R.id.photoGallery)).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    searchGallery(mRestaurant.getName());
                }
            });

        }

        return rootView;
    }

    //The purpose of this method is to take the user to the restaurant's menu on Zomato. I noticed a pattern in the URL's for restaurant menus on Zomato and made sure the right strings could be parsed into the Uri.parse method.
    private void searchMenu(String name) {
        String restaurantURL = ((mRestaurant.getName()).replace(" ", "-").replace("'","") + "-" +  mRestaurant.getSuburb().replace(" ","-") + "/menu");
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.zomato.com/sydney/" + restaurantURL));
        startActivity(intent);
    }


    //Similarly to the searchMenu() method, this method takes the user to a restaurant's photo gallery on Zomato.
    private void searchGallery(String name) {
        String restaurantURL = ((mRestaurant.getName()).replace(" ", "-") + "-" + mRestaurant.getSuburb().replace(" ","-") + "/photos");

        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.zomato.com/sydney/" + restaurantURL));
        startActivity(intent);
    }


}
