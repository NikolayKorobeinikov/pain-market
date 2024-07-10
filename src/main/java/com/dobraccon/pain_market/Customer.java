package com.dobraccon.pain_market;


public class Customer {
    private long idL;
    private String email;

    public Customer(long id, String email) {
        this.idL = id;
        this.email = email;
    }

    public long getId() {
        return idL;
    }

    public String getEmail() {
        return email;
    }

}
