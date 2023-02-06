package com.tk244.cmcustdb.entity;

import lombok.Data;

@Data
public class Customer {
    /**
     * 顧客ID
     */
    private Long custId;
    /**
     * 名前
     */
    private String custName;
    /**
     * 年齢
     */
    private Integer custAge;
    /**
     * 性別
     */
    private Integer custGender;
    /**
     * 郵便番号
     */
    private String custAddressNo;
    /**
     * 住所
     */
    private String custAddress;
    /**
     * 電話番号
     */
    private String custTel;
    /**
     * Emailアドレス
     */
    private String custEmail;
}
