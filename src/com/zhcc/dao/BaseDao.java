package com.zhcc.dao;

import java.io.Serializable;
import java.util.List;

/**
 * Create by ZHCC on 2018/10/13
 */

public interface BaseDao<T> {
    //根据ID加载实体
    T get(Class<T> entityClazz, Serializable id);

    //保存实体
    Serializable save(T entity);

    //更新实体
    void update(T entity);

    void delete(Class<T> entityClazz);

    //根据id删除实体
    void delete(Class<T> entityClazz, Serializable id);

    //获取所有实体
    List<T> findAll(Class<T> entityClazz);

    //获取实体总数
    long findCount(Class<T> entityClazz);
}
