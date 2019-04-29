package com.manage.employ.controller;

import com.manage.employ.module.EnterpriseRequest;
import com.manage.employ.module.ResponseBody;
import com.manage.employ.service.EnterpriseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@CrossOrigin
@RestController
@RequestMapping("/enterprise")
public class enterpriseController {

    @Autowired
    private EnterpriseService enterpriseService;

    @GetMapping("/getEnterprise")
    public Object getEnterprise(){
        Map<String,Object> map = new HashMap<>();
        map.put("data",enterpriseService.getEnterprise());
        return map;
    }

    @GetMapping("/searchEnterprise")
    public Object searchEnterprise(String data){
        Map<String,Object> map = new HashMap<>();
        map.put("data",enterpriseService.searchEnterprise(data));
        return map;
    }

    @PostMapping("/addEnterprise")
    public com.manage.employ.module.ResponseBody addEnterprise(EnterpriseRequest request){
        enterpriseService.addEnterprise(request);
        return new com.manage.employ.module.ResponseBody();
    }

    @PostMapping("/updateEnterprise")
    public com.manage.employ.module.ResponseBody editEnterprise(EnterpriseRequest request){
        enterpriseService.updateEnterprise(request);
        return new com.manage.employ.module.ResponseBody();
    }

    @PostMapping("delEnterprise")
    public com.manage.employ.module.ResponseBody delEnterprise(Integer id){
        enterpriseService.delEnterprise(id);
        return new com.manage.employ.module.ResponseBody();
    }

    @PostMapping("/bachDelete")
    public com.manage.employ.module.ResponseBody bachDel(String data){
        data = data.substring(0,data.length()-1);
        enterpriseService.batchDelete(data);
        return new ResponseBody();
    }
}
