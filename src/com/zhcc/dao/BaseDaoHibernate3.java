package com.zhcc.dao;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import java.io.Serializable;
import java.sql.SQLException;
import java.util.List;

/**
 * Create by ZHCC on 2018/10/15
 */

public class BaseDaoHibernate3<T> extends HibernateDaoSupport implements BaseDao<T> {
    @Override
    public T get(Class<T> entityClazz, Serializable id) {
        return getHibernateTemplate().get(entityClazz,id);
    }

    @Override
    public Serializable save(T entity) {
        return getHibernateTemplate().save(entity);
    }

    @Override
    public void update(T entity) {
        getHibernateTemplate().saveOrUpdate(entity);
    }

    @Override
    public void delete(Class<T> entityClazz) {
        getHibernateTemplate().delete(entityClazz);
    }

    @Override
    public void delete(Class<T> entityClazz, Serializable id) {
        getHibernateTemplate().delete(get(entityClazz, id));
    }

    @Override
    public List<T> findAll(Class entityClazz) {
        return  (List<T>)getHibernateTemplate().find("select en from "+ entityClazz.getSimpleName()+" en");
    }

    @Override
    public long findCount(Class entityClazz) {
        List<Long>list=(List<Long>)getHibernateTemplate().find("select count(*) from "+entityClazz.getSimpleName()+" en");
        return list.get(0);
    }

    protected List<T> findByPage(final String hql, final int pageNo, final int pageSize) {
        List<T> list=getHibernateTemplate().execute(new HibernateCallback<List<T>>() {
            @Override
            public List<T> doInHibernate(Session session) throws HibernateException, SQLException {
                //执行分页查询
                List<T> result = session.createQuery(hql).setFirstResult((pageNo-1)*pageSize).setMaxResults(pageSize).list();
                return result;
            }
        });
        return list;
    }

    protected List<T> findByPage(final String hql, final int pageNo, final int pageSize, Object... params) {
        List<T> list=getHibernateTemplate().execute(new HibernateCallback<List<T>>() {
            @Override
            public List<T> doInHibernate(Session session) throws HibernateException, SQLException {
                Query query = session.createQuery(hql);
                for(int i=0,len=params.length;i<len;i++) {
                    query.setParameter(i + "", params[i]);
                }
                List<T> result=query.setFirstResult((pageNo-1)*pageSize).setMaxResults(pageSize).list();
                return result;
            }
        });
        return list;
    }
}
