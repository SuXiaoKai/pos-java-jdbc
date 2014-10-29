package com.thoughtworks.iamcoach.pos.model;

import java.util.List;

public class Product {

    private String barcode;
    private String name;
    private String unit;
    private double price;
    private Category category;
    private List<Promotion> promotions;

    public Product() {

    }

    public Product(String barcode, String name, String unit, double price, List<Promotion> promotions) {
        this.barcode = barcode;
        this.name = name;
        this.unit = unit;
        this.price = price;
        this.promotions = promotions;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Promotion> getPromotions() {
        return promotions;
    }

    public void setPromotions(List<Promotion> promotions) {
        this.promotions = promotions;
    }
}
