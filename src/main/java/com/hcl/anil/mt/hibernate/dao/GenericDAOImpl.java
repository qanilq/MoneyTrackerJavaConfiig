package com.hcl.anil.mt.hibernate.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.io.Serializable;
import java.util.List;

/**
 * Created by M ANIL KUMAR on 03-05-2015.
 */
public class GenericDAOImpl<T, PK extends Serializable>
        implements GenericDAO<T,PK> {

    @Autowired
    SessionFactory sessionFactory;
    Class<T> clazz;

    public void setClazz(Class<T> clazzToSet){
        this.clazz = clazzToSet;
    }

    @Override
    public T get(PK id) {
        return (T) sessionFactory.getCurrentSession().get(clazz,id);
    }

    @Override
    public T save(T entity) {
        return (T) sessionFactory.getCurrentSession().save(entity);
    }

    @Override
    public List<T> getAll() {
        return null;
    }

    @Override
    public void delete(T entity) {

        sessionFactory.getCurrentSession().delete(entity);
    }

    @Override
    public void update(T entity) {
        sessionFactory.getCurrentSession().update(entity);
    }
}
