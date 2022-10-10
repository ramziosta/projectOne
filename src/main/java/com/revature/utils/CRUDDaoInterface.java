package com.revature.utils;

import java.util.List;

public interface CRUDDaoInterface<T> {

    int create(T t);

    List<T> getAll();

    T getById(int id);
//    List<T>getAllById();

    T update(T t);

    boolean delete(T t);

}
