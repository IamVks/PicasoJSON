package com.example.vikas.picasojson;

/**
 * Created by VIKAS on 2/7/2018.
 */

public class Product {
    private String image;
    private String name;
    private String skills;

    public Product(String image, String name, String price) {
        this.image = image;
        this.name = name;
        this.skills = price;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String price) {
        this.skills = price;
    }
}
