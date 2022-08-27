package com.hackathon3.service;

import com.hackathon3.endpoint.mapper.restBook.NewCategory;
import com.hackathon3.model.Category;
import com.hackathon3.endpoint.mapper.restBook.NewBook;
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
    public void deleteBook (Long id){
        boolean exist = categoryRepo.findById(id).isPresent();
        if(exist) categoryRepo.deleteById(id);
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
    public List<Category> getCategories(List<NewCategory> list) {
        List<Category> category = new ArrayList<>();
        for (NewCategory newCategory : list) {
            category.add(categoryRepo.findById(newCategory.getId_category()).get());
        }
        return category;
    }
}
