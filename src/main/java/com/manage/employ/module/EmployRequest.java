package com.manage.employ.module;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class EmployRequest {
    private Integer id;

    private Integer stuId;

    private String enterAccount;

    private String address;

    private BigDecimal salary;

    private Date createTime;
}
