package com.manage.employ.service;

import com.manage.employ.beans.Admin;
import com.manage.employ.mapper.AdminMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService {

    @Autowired
    private AdminMapper adminMapper;

    public Admin checkLogin(String username,String password){
        Admin admin = adminMapper.checkLogin(username,password);
        return admin;
    }
}
