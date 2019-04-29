package com.manage.employ.service;

import com.manage.employ.beans.Employ;
import com.manage.employ.beans.Enterprise;
import com.manage.employ.beans.Recruit;
import com.manage.employ.mapper.EmployMapper;
import com.manage.employ.mapper.EnterpriseMapper;
import com.manage.employ.mapper.RecruitMapper;
import com.manage.employ.module.EmployRequest;
import com.manage.employ.module.EnterpriseRequest;
import com.manage.employ.module.RecruitRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class RecruitService {

    @Autowired
    private RecruitMapper recruitMapper;
    @Autowired
    private StudentService studentService;
    @Autowired
    private EnterpriseService enterpriseService;

    public List getEnterprise(){
        List<Recruit> enterprises = recruitMapper.selectAll();
        List<Map> mapList = new ArrayList<>();
        for(Recruit recruit : enterprises){
            Map map = new HashMap();
            map.put("id",recruit.getId());
            map.put("enterName",enterpriseService.selectById(recruit.getEnterId()).getEnterName());
            map.put("recruitName",recruit.getEnterName());
            map.put("introduction",recruit.getEnterInfo());
            map.put("major",recruit.getEnterMajor());
            map.put("address",recruit.getEnterAddress());
            map.put("salary",recruit.getSalary());
            map.put("hrName",recruit.getHrName());
            map.put("hrPhone",recruit.getHrPhone());
            map.put("hrMailbox",recruit.getHrMailbox());
            mapList.add(map);
        }
        return mapList;
    }

    public List getEnterprise2(Integer enterId){
        List<Recruit> enterprises = recruitMapper.selectById(enterId);
        List<Map> mapList = new ArrayList<>();
        for(Recruit recruit : enterprises){
            Map map = new HashMap();
            map.put("id",recruit.getId());
            map.put("enterName",enterpriseService.selectById(recruit.getEnterId()).getEnterName());
            map.put("recruitName",recruit.getEnterName());
            map.put("introduction",recruit.getEnterInfo());
            map.put("major",recruit.getEnterMajor());
            map.put("address",recruit.getEnterAddress());
            map.put("salary",recruit.getSalary());
            map.put("hrName",recruit.getHrName());
            map.put("hrPhone",recruit.getHrPhone());
            map.put("hrMailbox",recruit.getHrMailbox());
            mapList.add(map);
        }
        return mapList;
    }

    public List getRecommend(Integer data){
        String major = studentService.selectById(data).getStuMajor();
        List<Recruit> enterprises = recruitMapper.selectByMajor(major);
        List<Map> mapList = new ArrayList<>();
        for(Recruit recruit : enterprises){
            Map map = new HashMap();
            map.put("id",recruit.getId());
            map.put("enterName",enterpriseService.selectById(recruit.getEnterId()).getEnterName());
            map.put("recruitName",recruit.getEnterName());
            map.put("introduction",recruit.getEnterInfo());
            map.put("major",recruit.getEnterMajor());
            map.put("address",recruit.getEnterAddress());
            map.put("salary",recruit.getSalary());
            map.put("hrName",recruit.getHrName());
            map.put("hrPhone",recruit.getHrPhone());
            map.put("hrMailbox",recruit.getHrMailbox());
            mapList.add(map);
        }
        return mapList;
    }

    public void addEnterprise(RecruitRequest request){
       Recruit recruit = new Recruit();
       recruit.setEnterId(request.getEnterId());
       recruit.setEnterName(request.getEnterName());
       recruit.setEnterInfo(request.getEnterInfo());
       recruit.setEnterMajor(request.getEnterMajor());
       recruit.setEnterAddress(request.getEnterAddress());
       recruit.setSalary(request.getSalary());
       recruit.setHrName(request.getHrName());
       recruit.setHrPhone(request.getHrPhone());
       recruit.setHrMailbox(request.getHrMailbox());
        recruitMapper.insert(recruit);
    }


    public void delEnterprise(Integer id){
        recruitMapper.deleteByPrimaryKey(id);
    }
}

