package com.sanyue.springcloud.controller;

import com.sanyue.springcloud.pojo.Dept;
import com.sanyue.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author BoLin
 * @create 2020-10-26 11:24
 */
@RestController
public class DeptController {

    @Autowired
    private DeptService deptService;

    @PostMapping("/add")
    public boolean addDept(Dept dept){
        boolean flag = deptService.addDept(dept);
        return flag;
    }

    @GetMapping("/get/{id}")
    public Dept getDept(@PathVariable("id") Long id){
        return deptService.queryById(id);
    }

    @GetMapping("/list")
    public List<Dept> getAll(){
        return deptService.queryAll();

    }

}
