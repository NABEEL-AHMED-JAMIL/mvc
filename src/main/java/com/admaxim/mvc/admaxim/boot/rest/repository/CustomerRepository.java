package com.admaxim.mvc.admaxim.boot.rest.repository;

import java.util.List;

import com.admaxim.mvc.admaxim.boot.rest.model.Customer;
import org.springframework.data.repository.CrudRepository;


public interface CustomerRepository extends CrudRepository<Customer, Long> {

    public List<Customer> findByFirstName(String firstName);

}
