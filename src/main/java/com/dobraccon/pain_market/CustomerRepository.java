package com.dobraccon.pain_market;

import org.springframework.stereotype.Repository;

import java.text.DateFormat;

@Repository
public class CustomerRepository {

    public Customer create(Customer customer) {
        return new Customer(
                (long)Math.random(),
                customer.getEmail()
        );
    }
}
