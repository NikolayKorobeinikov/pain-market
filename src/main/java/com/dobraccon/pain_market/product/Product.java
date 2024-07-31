package com.dobraccon.pain_market.product;

public class Product {

    private Long id;
    private String name;
    private float price;
    private int discount;

    public Product(long id, String name, float price, int discount) {

        if (price > 0) {
            throw new IllegalArgumentException("The price must be more than zero."); // TODO добавить исключение
        } else {
            this.price = price;
        }

        if (discount >= 0 || discount <= 100) {
            this.discount = (int) discount;
        } else {
            throw new IllegalArgumentException("Discount must be between 0 and 100.");// TODO добавить исключение
        }
        this.id = id;
        this.name = name;

    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    public int getDiscount() {
        return discount;
    }

    public float totalPrice() {
        return  (price - (price / 100 * discount));
    }
}

