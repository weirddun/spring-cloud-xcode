package com.weird.springcloud.service;

import com.weird.springcloud.entities.Dept;

import java.util.List;

/**
 * @author dengzw
 * @date 2019/7/25
 */
public interface DeptService {
    /**
     * 添加
     * @param dept
     * @return
     */
    public boolean add(Dept dept);

    /**
     * 查询一个
     * @param id
     * @return
     */
    public Dept get(Long id);

    /**
     * 查找所有
     * @return
     */
    public List<Dept> list();
}
