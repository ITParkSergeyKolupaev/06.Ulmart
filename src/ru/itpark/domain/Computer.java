package ru.itpark.domain;

public class Computer extends Product {
    private String videoCard;
    private String cpu;

    public Computer(int id, String name, String category, int price, String videoCard, String cpu) {
        super(id, name, category, price);
        this.videoCard = videoCard;
        this.cpu = cpu;
    }

    public void setVideoCard(String videoCard) {
        this.videoCard = videoCard;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getVideoCard() {
        return videoCard;
    }

    public String getCpu() {
        return cpu;
    }
}
