package com.manage.employ.beans;

import java.math.BigDecimal;

public class Recruit {
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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getEnterId() {
        return enterId;
    }

    public void setEnterId(Integer enterId) {
        this.enterId = enterId;
    }

    public String getEnterName() {
        return enterName;
    }

    public void setEnterName(String enterName) {
        this.enterName = enterName == null ? null : enterName.trim();
    }

    public String getEnterInfo() {
        return enterInfo;
    }

    public void setEnterInfo(String enterInfo) {
        this.enterInfo = enterInfo == null ? null : enterInfo.trim();
    }

    public String getEnterMajor() {
        return enterMajor;
    }

    public void setEnterMajor(String enterMajor) {
        this.enterMajor = enterMajor == null ? null : enterMajor.trim();
    }

    public String getEnterAddress() {
        return enterAddress;
    }

    public void setEnterAddress(String enterAddress) {
        this.enterAddress = enterAddress == null ? null : enterAddress.trim();
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public String getHrName() {
        return hrName;
    }

    public void setHrName(String hrName) {
        this.hrName = hrName == null ? null : hrName.trim();
    }

    public String getHrPhone() {
        return hrPhone;
    }

    public void setHrPhone(String hrPhone) {
        this.hrPhone = hrPhone == null ? null : hrPhone.trim();
    }

    public String getHrMailbox() {
        return hrMailbox;
    }

    public void setHrMailbox(String hrMailbox) {
        this.hrMailbox = hrMailbox == null ? null : hrMailbox.trim();
    }
}