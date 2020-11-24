package com.company.Homework7.Problem8;

public class Movie {

    private String title;
    private int rating;

    public Movie() {
    }

    public Movie(String title, int rating) {
        this.title = title;
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public int getRating() {
        return rating;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}

