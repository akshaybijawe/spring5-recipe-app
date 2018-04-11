package com.akshaybijawe.spring5recipeapp.controllers;

import com.akshaybijawe.spring5recipeapp.domain.Category;
import com.akshaybijawe.spring5recipeapp.domain.UnitOfMeasure;
import com.akshaybijawe.spring5recipeapp.repositories.CategoryRepository;
import com.akshaybijawe.spring5recipeapp.repositories.UnitOfMeasureRespository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

/**
 * @author arbijawe on 3/14/18
 * @project spring5-recipe-app
 */

@Controller
public class IndexController {

    private CategoryRepository categoryRepository;
    private UnitOfMeasureRespository unitOfMeasureRespository;

    public IndexController(CategoryRepository categoryRepository, UnitOfMeasureRespository unitOfMeasureRespository) {
        this.categoryRepository = categoryRepository;
        this.unitOfMeasureRespository = unitOfMeasureRespository;
    }

    @RequestMapping({"", "/", "index"})
    public String getIndexPage(){

        Optional<Category> categoryOptional = categoryRepository.findByDescription("American");
        Optional<UnitOfMeasure> unitOfMeasureOptional = unitOfMeasureRespository.findByDescription("Teaspoon");

        System.out.println("Cat ID is: " + categoryOptional.get().getId());
        System.out.println("UOM ID is: " + unitOfMeasureOptional.get().getId());

        return "index";
    }
}
