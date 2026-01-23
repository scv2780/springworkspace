package com.yedam.app;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

    List<Customer> findByLastName(String lastName);
    
    List<Customer> findByFirstNameLike(String name);
    
    @Query("select c from Customer c where is null")
    List<Customer> findAddr(String name);

    Customer findById(long id);
}