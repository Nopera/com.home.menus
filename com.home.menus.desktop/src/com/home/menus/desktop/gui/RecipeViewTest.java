package com.home.menus.desktop.gui;

import java.util.ArrayList;
import java.util.List;

import javax.swing.SwingUtilities;

import com.home.menus.common.bean.Recipe;
import com.home.menus.desktop.bean.RecipeBean;

public class RecipeViewTest {

	public static void main(String[] args) {
		Recipe recipe1 = new RecipeBean();
		recipe1.setName("Tarte aux pommes");
		recipe1.getIngredients().put("Pommes", "4 kg");
		recipe1.getIngredients().put("Sucre", "200 g");
		recipe1.getIngredients().put("Jus de citron", "");
		recipe1.getInstructions()
				.add("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed mi ipsum, dignissim aliquam diam ut, sagittis tincidunt risus. Nam mattis sapien turpis, ac venenatis tellus egestas sit amet. Ut urna lorem, dictum a dapibus et, lacinia vel enim. Phasellus suscipit nisi eget libero scelerisque porttitor. Phasellus tempus tortor vel elementum euismod. Phasellus eget mattis justo. Donec gravida odio orci, in varius urna eleifend et. Sed eu sodales urna. Phasellus auctor cursus est vitae gravida. Suspendisse a felis enim. Suspendisse auctor mauris eu dapibus sodales.");
		recipe1.getInstructions()
				.add("Etiam varius condimentum massa a cursus. Nam iaculis lorem nec ante posuere, ut fermentum libero malesuada. Nullam nec magna a nulla scelerisque consequat vel nec velit. Fusce dignissim vestibulum est, in fermentum nibh viverra non. Fusce suscipit sapien eget urna sodales, eu lobortis ipsum faucibus. Integer vitae vehicula lectus, id fermentum justo. Ut orci nunc, aliquet ultrices bibendum vitae, egestas sed neque. In nulla sem, sodales vel iaculis eget, rhoncus ut elit. Quisque cursus erat eget venenatis ullamcorper. Ut adipiscing dictum tortor ut commodo. Proin fermentum augue non scelerisque sodales. Quisque ac metus vitae felis iaculis vehicula. Donec at consectetur ante. Sed luctus nec nisl et ullamcorper. Proin at bibendum tortor, sed consectetur enim. Nam vitae.");
		Recipe recipe2 = new RecipeBean();
		recipe2.setName("Tarte à la merde");
		recipe2.getIngredients().put("Pommes", "4 kg");
		recipe2.getIngredients().put("Sucre", "200 g");
		recipe2.getIngredients().put("Jus de citron", "");
		
		final List<Recipe> recipes = new ArrayList<Recipe>();
		recipes.add(recipe1);
		recipes.add(recipe2);

		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				MainWindow window = new MainWindow(recipes);
				window.setVisible(true);
			}
		});
	}
}
