package com.example.spring.boot.ecom.Controller;

import com.example.spring.boot.ecom.Model.Category;
import com.example.spring.boot.ecom.Service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public class CategoryController {
    @Autowired
    CategoryService categoryService;


    @GetMapping(/user/getcategories)
    public List<Category> getcategories() {
        List<Category> allCategories=categoryService.getcategories();
    }
}
