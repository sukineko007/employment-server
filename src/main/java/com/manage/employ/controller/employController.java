package com.manage.employ.controller;

import com.manage.employ.module.EmployRequest;
import com.manage.employ.module.EnterpriseRequest;
import com.manage.employ.module.ResponseBody;
import com.manage.employ.service.EmployService;
import com.manage.employ.service.EnterpriseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@CrossOrigin
@RestController
@RequestMapping("/employ")
public class employController {

    @Autowired
    private EmployService employService;

    @GetMapping("/getEmploy")
    public Object getEnterprise(){
        Map<String,Object> map = new HashMap<>();
        map.put("data",employService.getEnterprise());
        return map;
    }


    @PostMapping("/addEmploy")
    public com.manage.employ.module.ResponseBody addEnterprise(EmployRequest request){
        employService.addEnterprise(request);
        return new com.manage.employ.module.ResponseBody();
    }



    @PostMapping("delEmploy")
    public com.manage.employ.module.ResponseBody delEnterprise(Integer id){
        employService.delEnterprise(id);
        return new com.manage.employ.module.ResponseBody();
    }


}
