package com.sanyue.springcloud.controller;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.sanyue.springcloud.pojo.Dept;
import com.sanyue.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
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

    @Autowired
    private DiscoveryClient client;

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

    //注册进来的微服务，提供一些消息
    @GetMapping("/dept/discover")
    public Object discover(){
        //获取微服务列表的清单
        List<String> services = client.getServices();
        System.out.println("discover => services:"+services);
        //得到一个具体的微服务信息
        List<ServiceInstance> instances = client.getInstances("SPRINGCLOUD-PROVIDER-DEPT");
        for (ServiceInstance instance : instances) {
            System.out.println(instance.getHost()+"\t"+instance.getUri()+"\t"+instance.getScheme());
        }
        return this.client;
    }

}
