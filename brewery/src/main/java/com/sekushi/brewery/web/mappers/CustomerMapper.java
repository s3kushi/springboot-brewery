package com.sekushi.brewery.web.mappers;

import com.sekushi.brewery.domain.Customer;
import com.sekushi.brewery.web.model.CustomerDTO;
import org.mapstruct.Mapper;

@Mapper
public interface CustomerMapper {

    CustomerDTO customerToCustomerDTO(Customer customer);

    Customer customerDTOToCustomer(CustomerDTO dto);
}
