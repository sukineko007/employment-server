package com.manage.employ.service;

import com.manage.employ.beans.Employ;
import com.manage.employ.beans.Enterprise;
import com.manage.employ.mapper.EmployMapper;
import com.manage.employ.mapper.EnterpriseMapper;
import com.manage.employ.module.EmployRequest;
import com.manage.employ.module.EnterpriseRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class EmployService {

    @Autowired
    private EmployMapper employMapper;
    @Autowired
    private StudentService studentService;
    @Autowired
    private EnterpriseService enterpriseService;

    public List getEnterprise(){
        List<Employ> enterprises = employMapper.selectAll();
        List<Map> mapList = new ArrayList<>();
        for(Employ employ : enterprises){
            Map map = new HashMap();
            map.put("id",employ.getId());
            map.put("stuName",studentService.selectByStu(employ.getStuId()).getStuName());
            map.put("enterName",enterpriseService.selectByAcc(employ.getEnterAccount()).getEnterName());
            map.put("address",employ.getAddress());
            map.put("salary",employ.getSalary());
            map.put("contractTime",employ.getCreateTime());
            mapList.add(map);
        }
        return mapList;
    }

    public void addEnterprise(EmployRequest request){
        Employ employ = new Employ();
        employ.setStuId(request.getStuId());
        employ.setEnterAccount(request.getEnterAccount());
        employ.setAddress(request.getAddress());
        employ.setSalary(request.getSalary());
        employ.setCreateTime(request.getCreateTime());
        employMapper.insert(employ);
    }


    public void delEnterprise(Integer id){
       employMapper.deleteByPrimaryKey(id);
    }
}

