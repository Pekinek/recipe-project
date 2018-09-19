package com.mocek.recipeproject.service;

import com.mocek.recipeproject.domain.Recipe;

import java.util.Set;


public interface RecipeService {

    Set<Recipe> getRecipies();
}
