package com.rkbapps.recyclerview;

public class ModelClass {
    private String name,massage,time,imageUrl;

    public ModelClass() {
    }

    public ModelClass(String name, String massage, String time, String imageUrl) {
        this.name = name;
        this.massage = massage;
        this.time = time;
        this.imageUrl = imageUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMassage() {
        return massage;
    }

    public void setMassage(String massage) {
        this.massage = massage;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
