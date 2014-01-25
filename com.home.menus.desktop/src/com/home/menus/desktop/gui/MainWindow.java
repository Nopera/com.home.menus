package com.home.menus.desktop.gui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import com.home.menus.common.bean.Recipe;

@SuppressWarnings("serial")
public class MainWindow extends JFrame {
	
	private final List<Recipe> recipes;
	private int currentRecipeIndex = 0;
	private BasicRecipeView recipeView;

	public MainWindow(List<Recipe> recipes) {
		super();
		this.recipes = recipes;
		build();
	}

	private void build() {
		setTitle("Fenêtre qui affiche du texte");
		setSize(500, 600);
		setLocationRelativeTo(null);
		setResizable(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//setContentPane(buildContentPane());
		setContentPane(new BasicRecipeCreationView());
		pack();
	}
	
	private Container buildContentPane() {
		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.PAGE_AXIS));

		JPanel buttonPanel = new JPanel();
		buttonPanel.setLayout(new BorderLayout());
		JButton nextButton = new JButton("-->");
		nextButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (!recipes.isEmpty()) {
					currentRecipeIndex = (currentRecipeIndex + 1) % recipes.size();
					recipeView.setRecipe(recipes.get(currentRecipeIndex));
				}				
			}
		});
		buttonPanel.add(nextButton, BorderLayout.EAST);
		JButton previousButton = new JButton("<--");
		previousButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (!recipes.isEmpty()) {
					currentRecipeIndex = (currentRecipeIndex + 1) % recipes.size();
					recipeView.setRecipe(recipes.get(currentRecipeIndex));
				}				
			}
		});
		buttonPanel.add(previousButton, BorderLayout.WEST);

		JScrollPane viewPanel = new JScrollPane();
		recipeView = new BasicRecipeView();
		
		if (!recipes.isEmpty()) {
			recipeView.setRecipe(recipes.get(currentRecipeIndex));
		}
		
		viewPanel.setViewportView(recipeView);
			
		mainPanel.add(buttonPanel);
		mainPanel.add(viewPanel);
		return mainPanel;
	}
}
