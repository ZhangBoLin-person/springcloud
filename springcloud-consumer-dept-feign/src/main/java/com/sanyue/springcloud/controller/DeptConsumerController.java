package com.sanyue.springcloud.controller;

import com.sanyue.springcloud.pojo.Dept;
import com.sanyue.springcloud.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author BoLin
 * @create 2020-10-26 14:06
 */
@RestController
public class DeptConsumerController {
    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private DeptClientService deptClientService;

    //http://localhost:8081/get/1
    @RequestMapping("/consumer/dept/get/{id}")
    public Dept getDept(@PathVariable("id") Long id){
        return this.deptClientService.queryById(id);
    }

    @RequestMapping("/consumer/dept/add")
    public boolean add(Dept dept){
        return this.deptClientService.addDept(dept);
    }

    //http://localhost:8081/list
    @RequestMapping("/consumer/dept/list")
    public List<Dept> getAll(){
        return this.deptClientService.queryAll();
    }

}
