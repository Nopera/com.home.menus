package com.home.menus.common.dao;

import java.util.List;

import com.home.menus.common.bean.Recipe;

public interface RecipeDAO extends BaseDAO<Recipe> {

	List<Recipe> getAllRecipes();
}
