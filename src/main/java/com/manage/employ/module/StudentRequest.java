package com.manage.employ.module;


import lombok.Data;

@Data
public class StudentRequest {

    private Integer id;

    private Integer stuId;

    private String password;

    private String stuName;

    private String stuSex;

    private Integer stuAge;

    private String school;

    private String stuMajor;

    private String classes;

    private String phone;

    private Integer type;
}
