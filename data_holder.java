package com.example.lovet;

public class data_holder {
    String Title, Review;
    public data_holder(String Title, String Review){
        this.Review = Review;
        this.Title = Title;
    }

    public String getTitle(){
        return Title;
    }

    public String getReview(){
        return Review;
    }
}
