package com.hcl.anil.mt.hibernate.dao;

import java.io.Serializable;
import java.util.List;

/**
 * Created by M ANIL KUMAR on 03-05-2015.
 */
public interface GenericDAO<T, PK extends Serializable> {

    T get(PK id);
    T save(T entity);
    List<T> getAll();
    void delete(T entity);
    void update(T entity);

}
