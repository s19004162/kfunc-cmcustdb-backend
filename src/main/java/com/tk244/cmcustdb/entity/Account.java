package com.tk244.cmcustdb.entity;

import lombok.Data;

@Data
public class Account {
    /**
     * 支店ID
     */
    private String branchId;
    /**
     * 口座種別
     */
    private String accountType;
    /**
     * 顧客ID
     */
    private Long custId;
    /**
     * 預金残高
     */
    private Long balance;
}