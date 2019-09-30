package com.example.comprehensivedinnerdelivery;


public class Restaurant {
    private String title;
    private String link;
    private String restaurantType;
    private String imgUrl;

    public Restaurant() {

    }

    public Restaurant(String title, String link, String restaurantType, String description, String imgUrl)
    {
        this.imgUrl = imgUrl;
        this.title = title;
        this.link = link;
        this.restaurantType = restaurantType;
    }

    public String getTitle(){
        return title;
    }
    String getRestaurantType(){ return restaurantType; }
    public String getLink(){
        return link;
    }
    public String getImage(){
        return imgUrl;
    }
}