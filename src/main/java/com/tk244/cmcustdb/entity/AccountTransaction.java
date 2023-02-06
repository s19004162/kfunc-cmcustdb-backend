package com.tk244.cmcustdb.entity;

import java.util.Date;

import lombok.Data;

@Data
public class AccountTransaction {
    /**
     * 取引日付
     */
    private Date transactionDate;
    /**
     * 取引番号
     */
    private String transactionNo;
    /**
     * 取引種別
     */
    private String transactionType;
    /**
     * 支店ID
     */
    private String branchId;
    /**
     * 口座種別
     */
    private String accountType;
    /**
     * 口座番号
     */
    private String accountId;
    /**
     * 金額
     */
    private Long amount;
    /**
     * 目的
     */
    private String purpose;
   /**
     * 取消種別
     */
    private String cancel;

}