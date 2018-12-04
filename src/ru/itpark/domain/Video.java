package ru.itpark.domain;

public class Video extends Product{
    private String peculiarProperties;
    private String color;

    public Video(int id, String name, String category, int price, String peculiarProperties, String color) {
        super(id, name, category, price);
        this.peculiarProperties = peculiarProperties;
        this.color = color;
    }

    public String getPeculiarProperties() {
        return peculiarProperties;
    }

    public void setPeculiarProperties(String peculiarProperties) {
        this.peculiarProperties = peculiarProperties;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
