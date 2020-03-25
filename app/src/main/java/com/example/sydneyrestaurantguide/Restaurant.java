package com.example.sydneyrestaurantguide;

import androidx.annotation.NonNull;

import java.util.ArrayList;

public class Restaurant {
    private String name;
    private String rank;
    private String location;
    private String rating;
    private String cuisine;
    private String price;
    private String topOrder;
    private String review;

    public Restaurant(String name, String rank, String location, String rating, String cuisine, String price, String topOrder, String review) {
        this.name = name;
        this.rank = rank;
        this.location = location;
        this.rating = rating;
        this.cuisine = cuisine;
        this.price = price;
        this.topOrder = topOrder;
        this.review = review;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getCuisine() {
        return cuisine;
    }

    public void setCuisine(String cuisine) {
        this.cuisine = cuisine;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getTopOrder() {
        return topOrder;
    }

    public void setTopOrder(String topOrder) {
        this.topOrder = topOrder;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public static Restaurant getRestaurant(String id) {
        for(Restaurant restaurant: getRestaurants()) {
            if(restaurant.getRank().equals(id)) {
                return restaurant;
            }
        }
        return null;
    }

    @NonNull
    @Override
    public String toString() {
        return super.toString();
    }

    public static ArrayList<Restaurant> getRestaurants() {
        ArrayList<Restaurant> restaurants = new ArrayList<>();
        restaurants.add(new Restaurant("Bar Luca", "#1", "Sydney CBD", "9.8", "Bitcoin", "Bitcoin", "Bitcoin", "Bitcoin"));
        restaurants.add(new Restaurant("Sokyo", "#2", "Pyrmont", "9.5", "Bitcoin", "Bitcoin", "Bitcoin", "Bitcoin"));
        restaurants.add(new Restaurant("Wings and Things", "#3", "Bankstown", "9.3", "Bitcoin", "Bitcoin", "Bitcoin", "Bitcoin"));
        restaurants.add(new Restaurant("Vapiano", "#4", "Sydney CBD", "9.2", "Bitcoin", "Bitcoin", "Bitcoin", "Bitcoin"));
        restaurants.add(new Restaurant("King Kebab House", "#5", "Campbelltown", "9.1", "Bitcoin", "Bitcoin", "Bitcoin", "Bitcoin"));
        restaurants.add(new Restaurant("Bare Witness", "#6", "Rhodes", "8.9", "Bitcoin", "Bitcoin", "Bitcoin","Bitcoin"));
        restaurants.add(new Restaurant("Time for Thai", "#7", "Kingsford", "8.7", "Bitcoin", "Bitcoin", "Bitcoin", "Bitcoin"));
        restaurants.add(new Restaurant("Ichiban Boshi", "#8", "Sydney CBD", "8.6", "Bitcoin", "Bitcoin", "Bitcoin", "Bitcoin"));
        restaurants.add(new Restaurant("Memory Tongue", "#9", "Sydney CBD", "8.4", "Bitcoin", "Bitcoin", "Bitcoin", "Bitcoin"));
        restaurants.add(new Restaurant("K Style Food", "#10", "Epping", "8.3", "Bitcoin", "Bitcoin", "Bitcoin", "Bitcoin"));
        return restaurants;
    }
}
