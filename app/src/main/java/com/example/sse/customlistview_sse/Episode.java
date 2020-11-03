package com.example.sse.customlistview_sse;

import java.util.Comparator;

public class Episode {
    private String name;
    private String description;
    private Integer image;
    private float rating;
    private String comment;

    public Episode(String name, String description, Integer image, float rating, String comment) {
        this.name = name;
        this.description = description;
        this.image = image;
        this.rating = rating;
        this.comment = comment;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getImage() {
        return image;
    }

    public void setImage(Integer image) {
        this.image = image;
    }

    public Float getRating() {
        return rating;
    }

    public void setRating(Float rating) {
        this.rating = rating;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public static Comparator<Episode> ratingSort = new Comparator<Episode>() {
        public int compare(Episode s1, Episode s2) {
            if(s1.getRating()>s2.getRating()) {
                return -1;
            }else if(s1.getRating()<s2.getRating()){
                return 1;
            }else{
                return 0;
            }
        }};
}

