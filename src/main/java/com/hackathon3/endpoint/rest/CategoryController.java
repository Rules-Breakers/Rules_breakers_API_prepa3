package com.hackathon3.endpoint.rest;

import com.hackathon3.model.Category;
import com.hackathon3.service.CategoryService;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/category")
@CrossOrigin("*")
@AllArgsConstructor
@Getter
public class CategoryController {
    private final CategoryService categoryService;
    @DeleteMapping("/{id}")
    public @ResponseBody String deleteBook (@PathVariable Long id) {
        categoryService.deleteBook(id);
        return "category deleted successfully";
    }
    @GetMapping
    public List<Category> getCategory(){
        return categoryService.getCategory();
    }
    @PostMapping
    public String addCategory(@RequestBody Category category) {
        return categoryService.addCategory(category);
    }
}
