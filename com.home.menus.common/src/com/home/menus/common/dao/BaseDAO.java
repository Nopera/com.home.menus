package com.home.menus.common.dao;

public interface BaseDAO<T> {
	
	T getByID(int id);

	void save(T type);

	T update(T type);

	void delete(T type);
}
