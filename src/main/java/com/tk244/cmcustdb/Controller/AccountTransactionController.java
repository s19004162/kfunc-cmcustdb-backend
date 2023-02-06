package com.tk244.cmcustdb.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tk244.cmcustdb.Service.AccountTransactionSearchService;
import com.tk244.cmcustdb.entity.AccountTransaction;

import lombok.extern.slf4j.Slf4j;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@Slf4j
@RequestMapping(value="/accountTransaction")

public class AccountTransactionController {
 
    @Autowired
     AccountTransactionSearchService service;

    @RequestMapping(value="/{custId}", method = RequestMethod.GET)
    public List<AccountTransaction> findAccountTransactions(@PathVariable("custId") String custId) {
        
        log.info("Starting findAccountTransaction method.");
        return service.findAllAccountTransaction(custId);
    }

}

