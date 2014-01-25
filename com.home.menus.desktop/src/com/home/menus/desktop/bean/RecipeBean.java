package com.home.menus.desktop.bean;

import java.io.Serializable;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;

import com.home.menus.common.bean.Recipe;

@Entity
public class RecipeBean implements Recipe, Serializable {

	@Id
	@GeneratedValue
	private int id = 0;
	private String name = "";
	@Lob
	@Basic(fetch = FetchType.LAZY)
	private Map<String, String> ingredients = new HashMap<String, String>();
	@Lob
	@Basic(fetch = FetchType.LAZY)
	private List<String> instructions = new LinkedList<String>();
	private static final long serialVersionUID = 1L;

	@Override
	public int getId() {
		return id;
	}

	@Override
	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public Map<String, String> getIngredients() {
		return ingredients;
	}

	@Override
	public List<String> getInstructions() {
		return instructions;
	}
}
