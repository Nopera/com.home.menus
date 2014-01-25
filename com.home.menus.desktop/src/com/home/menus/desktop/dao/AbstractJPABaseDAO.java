package com.home.menus.desktop.dao;

import com.home.menus.common.dao.BaseDAO;

public abstract class AbstractJPABaseDAO<T> implements BaseDAO<T> {

//	@PersistenceContext
//	private EntityManager entityManager;
//	private Class<T> entityType;
//
//	public AbstractJPABaseDAO() {
//		entityType = ((Class<T>) ((ParameterizedType) getClass()
//				.getGenericSuperclass()).getActualTypeArguments()[0]);
//	}
//
//	@Override
//	public T getByID(int id) {
//		return entityManager.find(entityType, id);
//	}
//
//	@Override
//	public void save(T type) {
//		entityManager.persist(type);
//	}
//
//	@Override
//	public T update(T type) {
//		return entityManager.merge(type);
//	}
//
//	@Override
//	public void delete(T type) {
//		entityManager.remove(entityManager.contains(type) ? type : entityManager.merge(type));
//	}
}
