package com.example.sydneyrestaurantguide;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.text.NumberFormat;
import java.util.ArrayList;

public class RestaurantAdapter extends RecyclerView.Adapter<RestaurantAdapter.RestaurantViewHolder>{

    private MainActivity mParentActivity;
    private ArrayList<Restaurant> mRestaurants;
    private boolean mTwoPane;


    private View.OnClickListener mOnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Restaurant restaurant = (Restaurant) v.getTag();
            if(mTwoPane) {
                Bundle arguments = new Bundle();
                arguments.putString(DetailFragment.ARG_ITEM_ID, String.valueOf(restaurant.getRank()));
                DetailFragment fragment = new DetailFragment();
                fragment.setArguments(arguments);
                mParentActivity.getSupportFragmentManager().beginTransaction().replace(R.id.detail_container, fragment).commit();
            } else {
                Context context = v.getContext();
                Intent intent = new Intent(context, DetailActivity.class);
                intent.putExtra(DetailFragment.ARG_ITEM_ID, String.valueOf(restaurant.getRank()));
                context.startActivity(intent);
            }
        }
    };

    public RestaurantAdapter(MainActivity parent, ArrayList<Restaurant> restaurants, boolean twoPane) {
        mParentActivity = parent;
        mRestaurants = restaurants;
        mTwoPane = twoPane;
    }

    public static class RestaurantViewHolder extends RecyclerView.ViewHolder  {
        public TextView name, rating, rank, location;
        public ImageView iconImage;

        public RestaurantViewHolder(View v) {
            super(v);
            name = v.findViewById(R.id.name);
            rating = v.findViewById(R.id.rating);
            rank = v.findViewById(R.id.rank);
            location = v.findViewById(R.id.location);
            iconImage = v.findViewById(R.id.iconImage);
        }
    }

    @Override
    public RestaurantAdapter.RestaurantViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.restaurant_list_row, parent, false);
        return new RestaurantViewHolder(v);
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(RestaurantViewHolder holder, int position) {

        Restaurant restaurant = mRestaurants.get(position);
        holder.name.setText(restaurant.getName());
        holder.rating.setText(restaurant.getRating());
        holder.rank.setText("#"+ restaurant.getRank());
        holder.location.setText(restaurant.getLocation());
        holder.iconImage.setImageResource(holder.itemView.getResources().getIdentifier("logo"+restaurant.getRank(), "drawable", "com.example.sydneyrestaurantguide"));

        holder.itemView.setTag(restaurant);
        holder.itemView.setOnClickListener(mOnClickListener);

    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return mRestaurants.size();
    }





}
