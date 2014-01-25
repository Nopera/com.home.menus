package com.home.menus.desktop.gui;

import java.util.Map.Entry;

import javax.swing.JEditorPane;
import javax.swing.text.html.HTMLEditorKit;

import com.home.menus.common.bean.Recipe;

@SuppressWarnings("serial")
public class BasicRecipeView extends JEditorPane implements RecipeView {
	
	private Recipe recipe;
	
	public BasicRecipeView(Recipe recipe) {
		super();
		setRecipe(recipe);
	}
	
	public BasicRecipeView() {
		super();
	}
	
	@Override
	public void setRecipe(Recipe recipe) {
		this.recipe = recipe;
		update();
	}
	
	@Override
	public void update() {
		setEditable(false);
		setEditorKit(new HTMLEditorKit());
		StringBuffer text = new StringBuffer();
		text.append(String.format("<h3><center> %s </center></h3>", recipe.getName()));
		text.append("<ul>");
		
		for (Entry<String, String> ingredient : recipe.getIngredients().entrySet()) {
			text.append(String.format("<li> %s - %s </li>", ingredient.getKey(), ingredient.getValue()));
		}
		
		text.append("</ul>");
		text.append("<ol>");
		
		for (String instruction : recipe.getInstructions()) {
			text.append(String.format("<li> %s </li>", instruction));
		}
		
		text.append("</ol>");
		setText(text.toString());
	}
}
