package com.tk244.cmcustdb.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tk244.cmcustdb.Repository.AccountTransactionMapper;
import com.tk244.cmcustdb.entity.AccountTransaction;

@Service
public class AccountTransactionSearchService {
    
    @Autowired
    private AccountTransactionMapper accountTransactionMapper;

    /**
    * 口座取引明細リスト検索
    * @param String custId リクエストデータ
    * @return List<AccountTransaction> 口座情報リスト
    *
    */
    public List<AccountTransaction> findAllAccountTransaction(String custId) {
        return accountTransactionMapper.findAllAccountTransaction(custId);
    }

}
