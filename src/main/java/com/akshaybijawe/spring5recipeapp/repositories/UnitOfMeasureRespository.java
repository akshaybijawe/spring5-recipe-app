package com.akshaybijawe.spring5recipeapp.repositories;

import com.akshaybijawe.spring5recipeapp.domain.UnitOfMeasure;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

/**
 * @author arbijawe on 4/8/18
 * @project spring5-recipe-app
 */

public interface UnitOfMeasureRespository extends CrudRepository<UnitOfMeasure, Long> {

    Optional<UnitOfMeasure> findByDescription(String description);
}
