package com.example.spring.boot.ecom.Service;

import com.example.spring.boot.ecom.Model.Category;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface CategoryService
{
    public String addCategory(Category category);
    public List<Category> getcategories();
}
