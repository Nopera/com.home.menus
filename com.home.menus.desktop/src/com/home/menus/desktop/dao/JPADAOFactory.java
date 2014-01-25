package com.home.menus.desktop.dao;

import com.home.menus.common.dao.DAOFactory;
import com.home.menus.common.dao.RecipeDAO;

public class JPADAOFactory implements DAOFactory{

	@Override
	public RecipeDAO getRecipeDAO() {
		return new JPARecipeDAO();
	}
}
