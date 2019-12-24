package com.example.demo.entity;

public class Item {
    private int item_id;
    private String item_name;
    private String unit;
    private int repo_id;
    private int num;
    private int price;

    public int getItem_id() {
        return item_id;
    }

    public void setItem_id(int item_id) {
        this.item_id = item_id;
    }

    public String getItem_name() {
        return item_name;
    }

    public void setItem_name(String item_name) {
        this.item_name = item_name;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public int getRepo_id() {
        return repo_id;
    }

    public void setRepo_id(int repo_id) {
        this.repo_id = repo_id;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


}
