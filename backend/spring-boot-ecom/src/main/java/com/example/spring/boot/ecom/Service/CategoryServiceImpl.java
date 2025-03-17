package com.example.spring.boot.ecom.Service;

import com.example.spring.boot.ecom.Model.Category;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

public class CategoryServiceImpl implements CategoryService {
    List<Category>Categories=new ArrayList<Category>();

    @Override
    public String addCategory(Category category) {
        Categories.add(category);
        return "category added";
    }

    @Override
    public List<Category> getcategories() {
        return Categories;
    }


}
