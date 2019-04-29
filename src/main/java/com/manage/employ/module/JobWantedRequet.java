package com.manage.employ.module;

import lombok.Data;

import java.math.BigDecimal;


@Data
public class JobWantedRequet {

    private Integer id;

    private Integer stuId;

    private String intention;

    private BigDecimal salary;

    private String address;

    private Integer jianliId;

    private String phone;

    private String mailbox;
}
