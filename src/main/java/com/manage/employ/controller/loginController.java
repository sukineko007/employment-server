package com.manage.employ.controller;

import com.manage.employ.beans.Admin;
import com.manage.employ.beans.Enterprise;
import com.manage.employ.beans.Student;
import com.manage.employ.service.AdminService;
import com.manage.employ.service.EnterpriseService;
import com.manage.employ.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/login")
public class loginController {

    @Autowired
    private AdminService adminService;
    @Autowired
    private StudentService studentService;
    @Autowired
    private EnterpriseService enterpriseService;

    @PostMapping("/login1")
    public Admin checkLogin1(String username, String password){
        Admin admin = adminService.checkLogin(username, password);
        return admin;
    }

    @PostMapping("/login2")
    public Student checkLogin2(Integer username, String password){
        Student admin = studentService.checkLogin(username, password);
        return admin;
    }

    @PostMapping("/login3")
    public Enterprise checkLogin3(String username, String password){
        Enterprise admin = enterpriseService.checkLogin(username, password);
        return admin;
    }


}
