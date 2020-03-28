package com.example.sydneyrestaurantguide;

import androidx.annotation.NonNull;

import java.util.ArrayList;

public class Restaurant {
    private String name;
    private int rank;
    private String location;
    private String rating;
    private String cuisine;
    private int price;
    private String topOrder;
    private String review;
    private String suburb;

    public Restaurant(String name, int rank, String location, String rating, String cuisine, int price, String topOrder, String review, String suburb) {
        this.name = name;
        this.rank = rank;
        this.location = location;
        this.rating = rating;
        this.cuisine = cuisine;
        this.price = price;
        this.topOrder = topOrder;
        this.review = review;
        this.suburb = suburb;
    }

    public String getSuburb() {
        return suburb;
    }

    public void setSuburb(String suburb) {
        this.suburb = suburb;
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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
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
        restaurants.add(new Restaurant("Bar Luca", 1, "52 Phillip St, Sydney CBD", "9.8", "Modern Australian, Burgers, Casual Dining", 20, "Blame Canada", "Arguably Sydney’s most famous burger place, Bar Luca serves delicious guilty pleasures in the form of their signature ‘Blame Canada’ burgers. If you are visiting Sydney and you love burgers, this place is a must visit.", "CBD"));
        restaurants.add(new Restaurant("Sokyo", 2, "Level G, The Darling The Star/80 Pyrmont Street, Pyrmont", "9.5", "Japanese, , Seafood, Fine Dining", 150, "Sashimi Platter", "A staple in Sydney, Sokyo serves Japanese cuisine that is unrivalled to none in Sydney. Looking for somewhere fancy for a special occasion, and don't mind a higher price point? Look no further.", "Pyrmont"));
        restaurants.add(new Restaurant("Sydney's Wings and Things", 3, "151 Canterbury Rd, Bankstown ", "9.3", "Middle-Eastern, BBQ, Chicken, Fast Food", 15, "Chicken Ribs/Wings Plate", "This place serves some of the juiciest chicken wings in Sydney. Definitely come here for a big feed with a group of people, the Chicken Ribs/Wings pack will provide you great value for your money.", "Bankstown"));
        restaurants.add(new Restaurant("Vapiano", 4, "77-79 Corner King And York Street, Sydney CBD", "9.2", "Italian, Pizza, Pasta, Casual Dining", 25, "Bruschetta Pizza", "This Italian restaurant uses a very unique canteen system where you can watch chefs make your pasta. There is also a bar on both the top and bottom floor. The pizzas and pasta here are amazing.", "CBD"));
        restaurants.add(new Restaurant("King Kebab House", 5, "2/171-179 Queen St, Campbelltown", "9.1", "Turkish, Kebab, Fast Food", 15, "Mixed Snack Pack", "King Kebab House is the best place in Sydney for Halal Snack Packs, with even a unique lamb option. If you are in Campbelltown and are craving a dirty feed consisting of meat, chips and sauce, this place will meet your needs.", "Campbelltown"));
        restaurants.add(new Restaurant("Bare Witness", 6, "30 Shoreline Dr, Rhodes", "8.9", "Modern Australian, Cafe, Casual Dining", 28, "Chicken & Waffles","This place is for the brunch enthusiasts. Bare Witness offers a stunning river view in Rhodes, and some of the most aesthetically appealing (for you Instagram foodies out there) and best tasting brunch food in Sydney. ", "Rhodes"));
        restaurants.add(new Restaurant("It's Time for Thai", 7, "2/309 Anzac Parade, Kingsford ", "8.7", "Thai, Malaysian, Casual Dining", 15, "Thai Seafood Laksa", "This Thai restaurant provides great value for money, it's no wonder why it's so popular among students attending UNSW. You will find a great variety in meal choices, and not a single one disappoints. ", "Kingsford"));
        restaurants.add(new Restaurant("Ichi-ban Boshi", 8, "2 The Galeries, 500 George St, Sydney CBD", "8.6", "Japanese, Ramen, Casual Dining", 18, "Negimiso Ramen", "This is a bustling Japanese restaurant in the Galeries, Sydney CBD, with a large menu. This place offers a diverse range of delicious ramen options, most notably its 'Negimiso Ramen'. ", "CBD"));
        restaurants.add(new Restaurant("Memory Tongue", 9, "Level 1/88 Liverpool St, Sydney CBD", "8.4", "Chinese, Hotpot, Casual Dining", 35, "Barbie Australian Wagyu Beef", "For a Chinese hotpot restaurant, this place has it all. Affordable price range, delicious food and sauce options. The Barbie Australian Wagyu Beef is an interesting order - as the name suggest, its a Barbie Doll wrapped in premium Australian Wagyu beef. ", "CBD"));
        restaurants.add(new Restaurant("Jenny's Asian Kitchen", 10, "11-13 Chester Hill Rd, Chester Hill ", "8.3", "Chinese, Fusion, Casual Dining", 20, "Hot Wok Special", "For a modest price range of $15-25 per person, this Chinese restaurant in Chester Hill offers incredible portion sizes and premium Chinese food. The service is also great - the owner, waiters and waitresses are very delightful people.", "Chester Hill"));
        return restaurants;
    }
}
