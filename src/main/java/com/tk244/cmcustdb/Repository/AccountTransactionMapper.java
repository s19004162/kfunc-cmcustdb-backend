package com.tk244.cmcustdb.Repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.tk244.cmcustdb.entity.AccountTransaction;

@Mapper
public interface AccountTransactionMapper {

    /**
    * 口座取引明細リスト検索
    * @param String custId リクエストデータ
    * @return List<AccountTransaction> 口座情報リスト
    *
    */
    List<AccountTransaction> findAllAccountTransaction(String custId);

}
