package com.manage.employ.service;

import com.manage.employ.beans.Student;
import com.manage.employ.mapper.StudentMapper;
import com.manage.employ.module.StudentRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class StudentService {

    @Autowired
    private StudentMapper studentMapper;

    public Student selectById(Integer data){
        return studentMapper.selectByPrimaryKey(data);
    }
    public Integer selectStuId(Integer id){
        return studentMapper.selectStuId(id);
    }

    public Student checkLogin(Integer username,String password){
        Student admin = studentMapper.checkLogin(username,password);
        return admin;
    }

    public List getStudent(){
        List<Student> students = studentMapper.selectAll();
        List<Map> mapList = new ArrayList<>();
        for(Student student : students){
            Map map = new HashMap();
            map.put("id",student.getId());
            map.put("stuId",student.getStuId());
            map.put("password",student.getPassword());
            map.put("stuName",student.getStuName());
            map.put("sex",student.getStuSex());
            map.put("age",student.getStuAge());
            map.put("school",student.getSchool());
            map.put("major",student.getStuMajor());
            map.put("class",student.getClasses());
            map.put("phone",student.getPhone());
            mapList.add(map);
        }
        return mapList;
    }

    public List searchStudent(Integer data){
        List<Student> students = studentMapper.selectByStuId(data);
        List<Map> mapList = new ArrayList<>();
        for(Student student : students){
            Map map = new HashMap();
            map.put("id",student.getId());
            map.put("stuId",student.getStuId());
            map.put("password",student.getPassword());
            map.put("stuName",student.getStuName());
            map.put("sex",student.getStuSex());
            map.put("age",student.getStuAge());
            map.put("school",student.getSchool());
            map.put("major",student.getStuMajor());
            map.put("class",student.getClasses());
            map.put("phone",student.getPhone());
            mapList.add(map);
        }
        return mapList;
    }

    public void addStudent(StudentRequest request){
        Student student = new Student();
        student.setStuId(request.getStuId());
        student.setStuName(request.getStuName());
        student.setPassword(request.getPassword());
        student.setStuSex(request.getStuSex());
        student.setStuAge(request.getStuAge());
        student.setSchool(request.getSchool());
        student.setStuMajor(request.getStuMajor());
        student.setClasses(request.getClasses());
        student.setPhone(request.getPhone());
        studentMapper.insert(student);
    }

    public void updateStudent(StudentRequest request){
        Student student = studentMapper.selectByPrimaryKey(request.getId());
        student.setStuId(request.getStuId());
        student.setStuName(request.getStuName());
        student.setPassword(request.getPassword());
        student.setStuSex(request.getStuSex());
        student.setStuAge(request.getStuAge());
        student.setSchool(request.getSchool());
        student.setStuMajor(request.getStuMajor());
        student.setClasses(request.getClasses());
        student.setPhone(request.getPhone());
        studentMapper.updateByPrimaryKeySelective(student);
    }

    public void batchDelete(String str) {
        String[] ids = str.split(",");
        for (int i = 0; i < ids.length; i++) {
            studentMapper.deleteByPrimaryKey(Integer.parseInt(ids[i]));
        }
    }

    public void delStudent(Integer id){
        studentMapper.deleteByPrimaryKey(id);
    }

    public Student selectByStu(Integer stuId){
        return studentMapper.selectByStu(stuId);
    }
}
