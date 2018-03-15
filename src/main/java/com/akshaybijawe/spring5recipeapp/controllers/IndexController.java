package com.akshaybijawe.spring5recipeapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author arbijawe on 3/14/18
 * @project spring5-recipe-app
 */

@Controller
public class IndexController {

    @RequestMapping({"", "/", "index"})
    public String getIndexPage(){
        return "index";
    }
}
