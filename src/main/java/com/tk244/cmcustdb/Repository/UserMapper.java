package com.tk244.cmcustdb.Repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.tk244.cmcustdb.entity.Customer;

@Mapper
public interface UserMapper {
    
    /**
     * 顧客情報検索
     * @param String custId 検索用リクエストデータ
     * @return Customer 顧客情報
     */
    Customer findOneCustomer(String custId);

    /**
     * 顧客情報リスト検索
     * @param void
     * @return List<Customer> 顧客情報リスト
     */
    List<Customer> findAllCustomer();
}
