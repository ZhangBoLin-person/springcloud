package com.sanyue.springcloud.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author BoLin
 * @create 2020-10-26 10:28
 */
@Data
@NoArgsConstructor
@Accessors(chain = true)//链式写法
public class Dept implements Serializable {

    private Long deptno;//主键
    private String dname;

    private String db_source;//这个数据存在哪个数据库的字段

    public Dept(String dname) {
        this.dname = dname;
    }


}
