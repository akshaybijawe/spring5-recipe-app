package com.akshaybijawe.spring5recipeapp.repositories;

import com.akshaybijawe.spring5recipeapp.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

/**
 * @author arbijawe on 4/8/18
 * @project spring5-recipe-app
 */

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
