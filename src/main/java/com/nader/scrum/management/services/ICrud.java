package com.nader.scrum.management.services;

// we use interfaces for low coupling principe
// in this project we use multiple interfaces to apply The SOLID Interface segregation
public interface ICrud<T> {

    T create(T t);
    T get(Long id);
    T update(T t);
    void delete(Long id);
}