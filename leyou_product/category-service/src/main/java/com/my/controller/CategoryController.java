package com.my.controller;

import com.my.pojp.Category;
import com.my.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/category")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;
    @RequestMapping(value = "/list",produces = "application/json")
    public  List <Category> getAllList(){
        List<Category>list =categoryService.getAllCategory();
        return list;
    }
}
