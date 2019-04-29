package com.manage.employ.service;

import com.manage.employ.beans.Enterprise;
import com.manage.employ.mapper.EnterpriseMapper;
import com.manage.employ.module.EnterpriseRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class EnterpriseService {

    @Autowired
    private EnterpriseMapper enterpriseMapper;

    public Enterprise checkLogin(String username,String password){
        Enterprise admin = enterpriseMapper.checkLogin(username,password);
        return admin;
    }

    public List getEnterprise(){
        List<Enterprise> enterprises = enterpriseMapper.selectAll();
        List<Map> mapList = new ArrayList<>();
        for(Enterprise enterprise : enterprises){
            Map map = new HashMap();
            map.put("id",enterprise.getId());
            map.put("account",enterprise.getAccount());
            map.put("password",enterprise.getPassword());
            map.put("enterName",enterprise.getEnterName());
            map.put("major",enterprise.getMajor());
            map.put("address",enterprise.getAddress());
            map.put("owner",enterprise.getOwner());
            map.put("introduction",enterprise.getIntroduction());
            map.put("mailbox",enterprise.getMailbox());
            map.put("telephone",enterprise.getTelephone());
            mapList.add(map);
        }
        return mapList;
    }

    public List searchEnterprise(String data){
        List<Enterprise> enterprises = enterpriseMapper.selectByAccount(data);
        List<Map> mapList = new ArrayList<>();
        for(Enterprise enterprise : enterprises){
            Map map = new HashMap();
            map.put("id",enterprise.getId());
            map.put("account",enterprise.getAccount());
            map.put("password",enterprise.getPassword());
            map.put("enterName",enterprise.getEnterName());
            map.put("major",enterprise.getMajor());
            map.put("address",enterprise.getAddress());
            map.put("owner",enterprise.getOwner());
            map.put("introduction",enterprise.getIntroduction());
            map.put("mailbox",enterprise.getMailbox());
            map.put("telephone",enterprise.getTelephone());
            mapList.add(map);
        }
        return mapList;
    }

    public void addEnterprise(EnterpriseRequest request){
        Enterprise enterprise = new Enterprise();
        enterprise.setAccount(request.getAccount());
        enterprise.setPassword(request.getPassword());
        enterprise.setEnterName(request.getEnterName());
        enterprise.setMajor(request.getMajor());
        enterprise.setOwner(request.getOwner());
        enterprise.setAddress(request.getAddress());
        enterprise.setIntroduction(request.getIntroduction());
        enterprise.setMailbox(request.getMailbox());
        enterprise.setTelephone(request.getTelephone());
        enterpriseMapper.insert(enterprise);
    }

    public void updateEnterprise(EnterpriseRequest request){
        Enterprise enterprise = enterpriseMapper.selectByPrimaryKey(request.getId());
        enterprise.setAccount(request.getAccount());
        enterprise.setPassword(request.getPassword());
        enterprise.setEnterName(request.getEnterName());
        enterprise.setMajor(request.getMajor());
        enterprise.setOwner(request.getOwner());
        enterprise.setAddress(request.getAddress());
        enterprise.setIntroduction(request.getIntroduction());
        enterprise.setMailbox(request.getMailbox());
        enterprise.setTelephone(request.getTelephone());
        enterpriseMapper.updateByPrimaryKeySelective(enterprise);
    }

    public void batchDelete(String str) {
        String[] ids = str.split(",");
        for (int i = 0; i < ids.length; i++) {
            enterpriseMapper.deleteByPrimaryKey(Integer.parseInt(ids[i]));
        }
    }

    public Enterprise selectById(Integer id){
        return enterpriseMapper.selectByPrimaryKey(id);
    }

    public void delEnterprise(Integer id){
        enterpriseMapper.deleteByPrimaryKey(id);
    }

    public Enterprise selectByAcc(String account){
        return enterpriseMapper.selectByAcc(account);
    };
}

