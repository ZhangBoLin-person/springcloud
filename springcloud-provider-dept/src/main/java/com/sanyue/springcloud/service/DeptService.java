package com.sanyue.springcloud.service;

import com.sanyue.springcloud.pojo.Dept;

import java.util.List;

/**
 * @author BoLin
 * @create 2020-10-26 11:20
 */
public interface DeptService {
    public boolean addDept(Dept dept);

    public Dept queryById(Long id);

    public List<Dept> queryAll();
}
