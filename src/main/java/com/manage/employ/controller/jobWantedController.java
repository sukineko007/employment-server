package com.manage.employ.controller;

import com.manage.employ.module.*;
import com.manage.employ.module.ResponseBody;
import com.manage.employ.service.EmployService;
import com.manage.employ.service.EnterpriseService;
import com.manage.employ.service.JobWantedService;
import com.manage.employ.service.RecruitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@CrossOrigin
@RestController
@RequestMapping("/wanted")
public class jobWantedController {

    @Autowired
    private JobWantedService jobWantedService;

    @GetMapping("/getWanted")
    public Object getEnterprise(){
        Map<String,Object> map = new HashMap<>();
        map.put("data",jobWantedService.getEnterprise());
        return map;
    }

    @GetMapping("/getWanted2")
    public Object getEnterprise2(Integer id){
        Map<String,Object> map = new HashMap<>();
        map.put("data",jobWantedService.getEnterprise2(id));
        return map;
    }


    @PostMapping("/addWanted")
    public com.manage.employ.module.ResponseBody addEnterprise(JobWantedRequet requet){
        jobWantedService.addEnterprise(requet);
        return new ResponseBody();
    }



    @PostMapping("delWanted")
    public com.manage.employ.module.ResponseBody delEnterprise(Integer id){
        jobWantedService.delEnterprise(id);
        return new ResponseBody();
    }


}
