package com.home.menus.desktop.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.home.menus.common.bean.Recipe;

@SuppressWarnings("serial")
public class BasicRecipeCreationView extends JPanel implements
		CreationRecipeView {

	private Recipe recipe = null;
	JPanel ingredientsPanel;

	public BasicRecipeCreationView() {
		super();
		build();
	}

	private void build() {
		setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));

		JLabel nameLabel = new JLabel("Nom : ");
		JTextField nameField = new JTextField();
		JPanel namePanel = new JPanel();
		namePanel.setLayout(new BoxLayout(namePanel, BoxLayout.LINE_AXIS));
		namePanel.add(nameLabel);
		namePanel.add(nameField);

		ingredientsPanel = new JPanel();
		ingredientsPanel.setLayout(new BoxLayout(ingredientsPanel,
				BoxLayout.PAGE_AXIS));
		JLabel ingredientsLabel = new JLabel("Ingredients :");
		JButton addIngredientButton = new JButton("+");
		addIngredientButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO: mettre une limite
				ingredientsPanel.add(createIngredientPanel());
			}
		});
		ingredientsPanel.add(ingredientsLabel);
		ingredientsPanel.add(addIngredientButton);
		ingredientsPanel.add(createIngredientPanel());
		ingredientsPanel.add(createIngredientPanel());
		ingredientsPanel.add(createIngredientPanel());
		
		add(namePanel);
		add(ingredientsPanel);
	}

	private JPanel createIngredientPanel() {
		final JPanel ingredientPanel = new JPanel();
		ingredientPanel.setLayout(new BoxLayout(ingredientPanel,
				BoxLayout.LINE_AXIS));

		JLabel ingredientNameLabel = new JLabel("Nom : ");
		JTextField ingredientNameField = new JTextField();
		JLabel quantityLabel = new JLabel("Quantité : ");
		JTextField quantityField = new JTextField();
		JButton removeButton = new JButton("X");
		removeButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ingredientsPanel.remove(ingredientPanel);
				repaint();
			}
		});
		
		ingredientPanel.add(ingredientNameLabel);
		ingredientPanel.add(ingredientNameField);
		ingredientPanel.add(quantityLabel);
		ingredientPanel.add(quantityField);
		ingredientPanel.add(removeButton);
		return ingredientPanel;
	}

	@Override
	public Recipe getRecipe() {
		return recipe;
	}

	@Override
	public void reset() {
		// TODO Auto-generated method stub
	}
}
