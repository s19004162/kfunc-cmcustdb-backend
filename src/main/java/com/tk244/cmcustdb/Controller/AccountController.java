package com.tk244.cmcustdb.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tk244.cmcustdb.Service.AccountSearchService;
import com.tk244.cmcustdb.entity.Account;

import lombok.extern.slf4j.Slf4j;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@Slf4j
@RequestMapping(value="/account")

public class AccountController {
 
    @Autowired
     AccountSearchService service;

     @RequestMapping(value="/", method = RequestMethod.GET)
     public List<Account> findAllAccount() {
         
        log.info("Starting findAllAccount method.");
        return service.findAllAccount();

     }

    @RequestMapping(value="/{custId}", method = RequestMethod.GET)
    public List<Account> findAccount(@PathVariable("custId") String custId) {
        
        log.info("Starting findAccount method.");
        return service.findAccount(custId);
    }



}
