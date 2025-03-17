package com.example.spring.boot.ecom.Model;

import org.springframework.stereotype.Component;

@Component
public class Category {

    Integer Categoryid;
    String name;

    public Integer getCategoryid() {
        return Categoryid;
    }

    public void setCategoryid(Integer categoryid) {
        Categoryid = categoryid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Category{" +
                "Categoryid=" + Categoryid +
                ", name='" + name + '\'' +
                '}';
    }
}
