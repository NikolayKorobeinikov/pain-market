package com.dobraccon.pain_market;


public class Customer {
    private Long id;
    private String email;

    public Customer(long id, String email) {
        this.id = id;
        this.email = email;
    }

    public long getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

}
