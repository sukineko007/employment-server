package com.manage.employ.service;

import com.manage.employ.beans.*;
import com.manage.employ.mapper.EmployMapper;
import com.manage.employ.mapper.EnterpriseMapper;
import com.manage.employ.mapper.JobWantedMapper;
import com.manage.employ.mapper.RecruitMapper;
import com.manage.employ.module.EmployRequest;
import com.manage.employ.module.EnterpriseRequest;
import com.manage.employ.module.JobWantedRequet;
import com.manage.employ.module.RecruitRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class JobWantedService {

    @Autowired
    private JobWantedMapper jobWantedMapper;
    @Autowired
    private StudentService studentService;
    @Autowired
    private EnterpriseService enterpriseService;

    public List getEnterprise(){
        List<JobWanted> enterprises = jobWantedMapper.selectAll();
        List<Map> mapList = new ArrayList<>();
        for(JobWanted jobWanted : enterprises){
            Map map = new HashMap();
            map.put("id",jobWanted.getId());
            map.put("stuName",studentService.selectByStu(jobWanted.getStuId()).getStuName());
            map.put("intention",jobWanted.getIntention());
            map.put("address",jobWanted.getAddress());
            map.put("salary",jobWanted.getSalary());
            map.put("jianli",jobWanted.getJianliId());
            map.put("phone",jobWanted.getPhone());
            map.put("mailbox",jobWanted.getMailbox());
            mapList.add(map);
        }
        return mapList;
    }

    public List getEnterprise2(Integer id){
        Integer stuId = studentService.selectStuId(id);
        List<JobWanted> enterprises = jobWantedMapper.selectByStuId(stuId);
        List<Map> mapList = new ArrayList<>();
        for(JobWanted jobWanted : enterprises){
            Map map = new HashMap();
            map.put("id",jobWanted.getId());
            map.put("stuName",studentService.selectByStu(jobWanted.getStuId()).getStuName());
            map.put("intention",jobWanted.getIntention());
            map.put("address",jobWanted.getAddress());
            map.put("salary",jobWanted.getSalary());
            map.put("jianli",jobWanted.getJianliId());
            map.put("phone",jobWanted.getPhone());
            map.put("mailbox",jobWanted.getMailbox());
            mapList.add(map);
        }
        return mapList;
    }

    public void addEnterprise(JobWantedRequet requet){
        JobWanted jobWanted = new JobWanted();
        jobWanted.setStuId(studentService.selectById(requet.getId()).getStuId());
        jobWanted.setIntention(requet.getIntention());
        jobWanted.setAddress(requet.getAddress());
        jobWanted.setSalary(requet.getSalary());
        jobWanted.setJianliId(requet.getJianliId());
        jobWanted.setPhone(requet.getPhone());
        jobWanted.setMailbox(requet.getMailbox());

        jobWantedMapper.insert(jobWanted);
    }


    public void delEnterprise(Integer id){
        jobWantedMapper.deleteByPrimaryKey(id);
    }
}

