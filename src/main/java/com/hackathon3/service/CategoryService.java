package com.hackathon3.service;

import com.hackathon3.model.Category;
import com.hackathon3.model.NewBook;
import com.hackathon3.repository.CategoryRepo;
import lombok.AllArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Setter
@Service
@AllArgsConstructor
public class CategoryService {
    private final CategoryRepo categoryRepo;
    public List<Category> getCategory() {
        return categoryRepo.findAll();
    }
    public String addCategory(Category category) throws IllegalArgumentException{
        try{
            categoryRepo.save(category);
            return "Category successfully added to the list";
        }
        catch (IllegalArgumentException e){
            e.printStackTrace();
        }
        return "Category not added to the list";
    }
    public List<Category> getCategories(List<NewBook> list) {
        List<Category> category = new ArrayList<>();
        for (NewBook id : list) {
            category.add(categoryRepo.findById(id.getId_category()).get());
        }
        return category;
    }
}
