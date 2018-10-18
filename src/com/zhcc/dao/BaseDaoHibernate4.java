package com.zhcc.dao;

import org.hibernate.Query;
import org.hibernate.SessionFactory;

import java.io.Serializable;
import java.util.List;

/**
 * Create by ZHCC on 2018/10/15
 */

public class BaseDaoHibernate4<T> implements BaseDao<T> {

    //DAO组件进行持久化操作底层依赖的SessionFactory组件
    private SessionFactory sessionFactory;

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public T get(Class<T> entityClazz, Serializable id) {
        return (T) getSessionFactory().getCurrentSession().get(entityClazz, id);
    }

    @Override
    public Serializable save(T entity) {
        return getSessionFactory().getCurrentSession().save(entity);
    }

    @Override
    public void update(T entity) {
        getSessionFactory().getCurrentSession().saveOrUpdate(entity);
    }

    @Override
    public void delete(Class<T> entityClazz) {

    }

    @Override
    public void delete(Class entityClazz, Serializable id) {
        getSessionFactory().getCurrentSession().createQuery("delete "+entityClazz.getSimpleName()+" en where en.id=?0").setParameter("0",id).executeUpdate();
    }

    @Override
    public List findAll(Class entityClazz) {
        return find("select en from " + entityClazz.getSimpleName() + " en");
    }

    @Override
    public long findCount(Class entityClazz) {
        List<?> l = find("select count(*) from " + entityClazz.getSimpleName());
        if (l != null && l.size() == 1) {
            return (Long) l.get(0);
        }
        return 0;
    }

    protected List<T> find(String hql) {
        return (List<T>)getSessionFactory().getCurrentSession().createQuery(hql).list();
    }

    //根据带占位符参数的HQL查询
    protected List<T> find(String hql, Object... params) {
        Query query = getSessionFactory().getCurrentSession().createQuery(hql);
        for(int i=0,len=params.length;i<len;i++) {
            query.setParameter(i + "", params[i]);
        }
        return (List<T>)query.list();
    }

    //HQL分页
    protected List<T> findByPage(String hql,int pageNo,int pageSize) {
        return getSessionFactory().getCurrentSession().createQuery(hql).setFirstResult((pageNo-1)*pageSize).setMaxResults(pageSize).list();
    }

    protected List<T> findByPage(String hql, int pageNo, int pageSize, Object... params) {
        Query query = getSessionFactory().getCurrentSession().createQuery(hql);
        for (int i=0,len=params.length;i<len;i++) {
            query.setParameter(i + "", params[i]);
        }
        return query.setFirstResult((pageNo-1)*pageSize).setMaxResults(pageSize).list();
    }


}
