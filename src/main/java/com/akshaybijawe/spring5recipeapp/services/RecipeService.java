package com.akshaybijawe.spring5recipeapp.services;

import com.akshaybijawe.spring5recipeapp.domain.Recipe;

import java.util.Set;

/**
 * @author arbijawe on 5/10/18
 * @project spring5-recipe-app
 */

public interface RecipeService {

    Set<Recipe> getRecipes();
}