package com.dobraccon.pain_market;

public class Product {

    private int id;
    private String name;
    private double price;
    private double discount;

    public Product(int id, String name, double price, double discount) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.discount = discount;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        if (price > 0) {
            return price;
        } else {
            return 0; // я не пойму почему я IDEA  не дает мне написать без блока else
        }
    }

    public double getDiscount() {
        if (discount >= 0 && discount <= 100) {
            return discount;
        } else {
            return 0;
        }
    }

    public float finalPrice() {
        float totalPrice = (float) (price - (price / 100 * discount));
        return totalPrice;
    }
}
