package com.manage.employ.controller;

import com.manage.employ.module.EmployRequest;
import com.manage.employ.module.EnterpriseRequest;
import com.manage.employ.module.RecruitRequest;
import com.manage.employ.module.ResponseBody;
import com.manage.employ.service.EmployService;
import com.manage.employ.service.EnterpriseService;
import com.manage.employ.service.RecruitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@CrossOrigin
@RestController
@RequestMapping("/recruit")
public class recruitController {

    @Autowired
    private RecruitService recruitService;

    @GetMapping("/getRecruit")
    public Object getEnterprise(){
        Map<String,Object> map = new HashMap<>();
        map.put("data",recruitService.getEnterprise());
        return map;
    }

    @GetMapping("/getRecruit2")
    public Object getEnterprise2(Integer enterId){
        Map<String,Object> map = new HashMap<>();
        map.put("data",recruitService.getEnterprise2(enterId));
        return map;
    }
    @GetMapping("/getRecommend")
    public Object getRecommend(Integer id){
        Map<String,Object> map = new HashMap<>();
        map.put("data",recruitService.getRecommend(id));
        return map;
    }


    @PostMapping("/addRecruit")
    public com.manage.employ.module.ResponseBody addEnterprise(RecruitRequest request){
        recruitService.addEnterprise(request);
        return new com.manage.employ.module.ResponseBody();
    }



    @PostMapping("delRecruit")
    public com.manage.employ.module.ResponseBody delEnterprise(Integer id){
        recruitService.delEnterprise(id);
        return new com.manage.employ.module.ResponseBody();
    }


}
