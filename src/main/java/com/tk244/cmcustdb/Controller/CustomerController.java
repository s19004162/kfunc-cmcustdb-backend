package com.tk244.cmcustdb.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tk244.cmcustdb.Service.CustomerSearchService;
import com.tk244.cmcustdb.entity.Customer;

import lombok.extern.slf4j.Slf4j;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@Slf4j
@RequestMapping(value="/customer")
public class CustomerController {
    
    @Autowired
     CustomerSearchService service;

     @RequestMapping(value="/", method = RequestMethod.GET)
     public List<Customer> findAllCustomer() {
         
        log.info("Starting findAllCustomer method.");
        return service.findAllCustomer();

     }

    @RequestMapping(value="/{custId}", method = RequestMethod.GET)
    public Customer findOneCustomer(@PathVariable("custId") String custId) {
        
        log.info("Starting findOneCustomer method.");
        return service.findOneCustomer(custId);
    }



}
