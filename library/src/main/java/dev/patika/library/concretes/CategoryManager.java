package dev.patika.library.concretes;

import dev.patika.library.business.ICategoryService;
import dev.patika.library.dao.CategoryRepo;
import dev.patika.library.entities.Category;
import org.springframework.stereotype.Service;

@Service
public class CategoryManager implements ICategoryService {
    private final CategoryRepo categoryRepo;

    private  CategoryManager(CategoryRepo categoryRepo){
        this.categoryRepo = categoryRepo;
    }
     @Override
     public Category save(Category category){
        return this.categoryRepo.save(category);
     }

}
