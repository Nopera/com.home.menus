package com.home.menus.common.bean;

import java.util.List;
import java.util.Map;

public interface Recipe {

	int getId();
	
	void setId(int id);
	
	String getName();
	
	void setName(String name);
	
	Map<String, String> getIngredients();
	
	List<String> getInstructions();
}
