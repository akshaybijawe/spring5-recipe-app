package com.akshaybijawe.spring5recipeapp.repositories;

import com.akshaybijawe.spring5recipeapp.domain.UnitOfMeasure;
import org.springframework.data.repository.CrudRepository;

/**
 * @author arbijawe on 4/8/18
 * @project spring5-recipe-app
 */

public interface UnitOfMeasureRespority extends CrudRepository<UnitOfMeasure, Long> {
}