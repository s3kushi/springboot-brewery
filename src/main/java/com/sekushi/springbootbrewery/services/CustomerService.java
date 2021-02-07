package com.sekushi.springbootbrewery.services;

import com.sekushi.springbootbrewery.web.model.CustomerDTO;

import java.util.UUID;

public interface CustomerService {

    CustomerDTO getCustomerById(UUID customerId);

    CustomerDTO saveCustomer(CustomerDTO customerDTO);

    void updateCustomer(UUID customerId, CustomerDTO customerDTO);

    void deleteById(UUID customerId);
}
