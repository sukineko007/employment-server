package com.manage.employ.module;

import lombok.Data;

@Data
public class EnterpriseRequest {
    private Integer id;

    private String account;

    private String password;

    private String enterName;

    private String major;

    private String owner;

    private String address;

    private String introduction;

    private String mailbox;

    private String telephone;

    private Integer type;
}
