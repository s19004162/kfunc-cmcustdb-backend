package com.tk244.cmcustdb.Repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.tk244.cmcustdb.entity.Account;

@Mapper
public interface AccountMapper {

    /**
    * 口座情報リスト検索
    * @param void
    * @return List<Account> 口座情報リスト
    *
    */
    List<Account> findAllAccount();

    /**
    * 口座情報検索
    * @param String custId リクエストデータ
    * @return List<Account> 口座情報リスト
    *
    */
    List<Account> findAccount(String custId);

}
