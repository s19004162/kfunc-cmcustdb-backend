package com.tk244.cmcustdb.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tk244.cmcustdb.Repository.AccountMapper;
import com.tk244.cmcustdb.entity.Account;

@Service
public class AccountSearchService {
    
    @Autowired
    private AccountMapper accountMapper;

    /**
    * 口座情報リスト検索
    * @param void
    * @return List<Account> 口座情報リスト
    *
    */
    public List<Account> findAllAccount() {
        return accountMapper.findAllAccount();
    }

    /**
    * 口座情報検索
    * @param String custId リクエストデータ
    * @return List<Account> 口座情報リスト
    *
    */
    public List<Account> findAccount(String custId) {
        return accountMapper.findAccount(custId);
    }

}
