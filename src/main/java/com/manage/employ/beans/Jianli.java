package com.manage.employ.beans;

public class Jianli {
    private Integer id;

    private Integer jobId;

    private String realSrc;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getJobId() {
        return jobId;
    }

    public void setJobId(Integer jobId) {
        this.jobId = jobId;
    }

    public String getRealSrc() {
        return realSrc;
    }

    public void setRealSrc(String realSrc) {
        this.realSrc = realSrc == null ? null : realSrc.trim();
    }
}