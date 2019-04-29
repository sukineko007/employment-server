package com.manage.employ.controller;

import com.manage.employ.module.ResponseBody;
import com.manage.employ.module.StudentRequest;
import com.manage.employ.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@CrossOrigin
@RestController
@RequestMapping("/student")
public class studentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/getStudent")
    public Object getStudent(){
        Map<String,Object> map = new HashMap<>();
        map.put("data",studentService.getStudent());
        return map;
    }

    @GetMapping("/searchStudent")
    public Object searchStudent(Integer data){
        Map<String,Object> map = new HashMap<>();
        map.put("data",studentService.searchStudent(data));
        return map;
    }

    @PostMapping("/addStudent")
    public ResponseBody addStudent(StudentRequest request){
        studentService.addStudent(request);
        return new ResponseBody();
    }

    @PostMapping("/editStudent")
    public ResponseBody editStudent(StudentRequest request){
        studentService.updateStudent(request);
        return new ResponseBody();
    }

    @PostMapping("delStudent")
    public ResponseBody delStudent(Integer id){
        studentService.delStudent(id);
        return new ResponseBody();
    }

    @PostMapping("/bachDelete")
    public ResponseBody bachDel(String data){
        data = data.substring(0,data.length()-1);
        studentService.batchDelete(data);
        return new ResponseBody();
    }
}
