package com.sanyue.springcloud.service;


import com.sanyue.springcloud.pojo.Dept;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

/**
 * @author BoLin
 * @create 2020-11-09 15:46
 */
@Component
@FeignClient(value = "SPRINGCLOUD-PROVIDER-DEPT")
public interface DeptClientService {

    @GetMapping("/consumer/dept/get/{id}")
    public Dept queryById(@PathVariable("id") Long id);
    @GetMapping("/consumer/dept/list")
    public List<Dept> queryAll();
    @PostMapping("/consumer/dept/add")
    public boolean addDept(Dept dept);

}
