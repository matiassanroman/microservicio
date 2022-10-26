package com.proyecto.microservicio.serviceCustomer.servicecustomer.repository;

import com.proyecto.microservicio.serviceCustomer.servicecustomer.entity.Customer;
import com.proyecto.microservicio.serviceCustomer.servicecustomer.entity.Region;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long> {

    public Customer findByNumberID(String numberID);
    public List<Customer> findByLastName(String lastName);
    public List<Customer> findByRegion(Region region);

}
