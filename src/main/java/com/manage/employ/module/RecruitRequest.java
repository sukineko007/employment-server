package com.manage.employ.module;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class RecruitRequest {

    private Integer id;

    private Integer enterId;

    private String enterName;

    private String enterInfo;

    private String enterMajor;

    private String enterAddress;

    private BigDecimal salary;

    private String hrName;

    private String hrPhone;

    private String hrMailbox;
}
