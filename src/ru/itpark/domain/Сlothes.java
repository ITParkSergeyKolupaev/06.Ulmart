package ru.itpark.domain;

public class Сlothes extends Product{
    private String gender;
    private int size;

    public Сlothes(int id, String name, String category, int price, String gender, int size) {
        super(id, name, category, price);
        this.gender = gender;
        this.size = size;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
