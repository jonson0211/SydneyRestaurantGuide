package com.example.sydneyrestaurantguide;

import androidx.annotation.NonNull;

import java.util.ArrayList;

public class Restaurant {
    private String name;
    private int rank;
    private String location;
    private String rating;
    private String cuisine;
    private String price;
    private String topOrder;
    private String review;

    public Restaurant(String name, int rank, String location, String rating, String cuisine, String price, String topOrder, String review) {
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

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
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
            if(String.valueOf(restaurant.getRank()).equals(id)) {
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
        restaurants.add(new Restaurant("Bar Luca", 1, "Sydney CBD", "9.8", "Modern Australian, Burgers, Casual Dining", "$20 per head", "Blame Canada", "Arguably Sydney’s most famous burger place, Bar Luca serves delicious guilty pleasures in the form of their signature ‘Blame Canada’ burgers. If you are visiting Sydney and you love burgers, this place is a must visit."));
        restaurants.add(new Restaurant("Sokyo", 2, "Pyrmont", "9.5", "Japanese, Fine Dining", "$150 per head", "Sashimi Platter", "A staple in Sydney, Sokyo serves Japanese cuisine that is unrivalled to none in Sydney. Looking for somewhere fancy for a special occasion, and don't mind a higher price point? Look no further."));
        restaurants.add(new Restaurant("Wings and Things", 3, "Bankstown", "9.3", "Middle-Eastern, BBQ, Chicken, Fast Food", "$15 per head", "Chicken Ribs/Wings Plate", "This place serves some of the juiciest chicken wings in Sydney. Definitely come here for a big feed with a group of people, the Chicken Ribs/Wings pack will provide you great value for your money."));
        restaurants.add(new Restaurant("Vapiano", 4, "Sydney CBD", "9.2", "Italian, Pizza, Pasta, Casual Dining", "$25 per head", "Bruschetta Pizza", "This Italian restaurant uses a very unique canteen system where you can watch chefs make your pasta. There is also a bar on both the top and bottom floor. The pizzas and pasta here are amazing."));
        restaurants.add(new Restaurant("King Kebab House", 5, "Campbelltown", "9.1", "Turkish, Kebab, Fast Food", "$15 per head", "Mixed Snack Pack", "King Kebab House is the best place in Sydney for Halal Snack Packs, with even a unique lamb option. If you are in Campbelltown and are craving a dirty feed consisting of meat, chips and sauce, this place will meet your needs."));
        restaurants.add(new Restaurant("Bare Witness", 6, "Rhodes", "8.9", "Modern Australian, Brunch, Cafe, Casual Dining", "$28 per head", "Chicken & Waffles","This place is for the brunch enthusiasts. Bare Witness offers a stunning river view in Rhodes, and some of the most aesthetically appealing (for you Instagram foodies out there) and best tasting brunch food in Sydney. "));
        restaurants.add(new Restaurant("It's Time for Thai", 7, "Kingsford", "8.7", "Thai, Malaysian, Casual Dining", "$15 per head", "Thai Seafood Laksa", "This Thai restaurant provides great value for money, it's not wonder why it's so popular among students attending UNSW. You will find a great variety in meal choices, and not a single one disappoints. "));
        restaurants.add(new Restaurant("Ichi-ban Boshi", 8, "Sydney CBD", "8.6", "Japanese, Ramen, Casual Dining", "$18 per head", "Negimiso Ramen", "This is a bustling Japanese restaurant in the Galeries, Sydney CBD, with a large menu. This place offers a diverse range of delicious ramen options, most notably its 'Negimiso Ramen'. "));
        restaurants.add(new Restaurant("Memory Tongue", 9, "Sydney CBD", "8.4", "Chinese, Hotpot, Casual Dining", "$35 per head", "Barbie Australian Wagyu Beef", "For a Chinese hotpot restaurant, this place has it all. Affordable price range, delicious food and sauce options. The Barbie Australian Wagyu Beef is an interesting order - as the name suggest, its a Barbie Doll wrapped in premium Australian Wagyu beef. "));
        restaurants.add(new Restaurant("Jenny's Kitchen", 10, "Chester Hill", "8.3", "Chinese, Casual Dining", "$20 per head", "Hot Wok Special", "For a modest price range of $15-25 per person, this Chinese restaurant in Chester Hill offers incredible portion sizes and premium Chinese food. The service is also great - the owner, waiters and waitresses are very delightful people."));
        return restaurants;
    }
}
