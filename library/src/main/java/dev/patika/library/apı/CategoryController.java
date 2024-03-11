package dev.patika.library.apı;

import dev.patika.library.business.ICategoryService;
import dev.patika.library.core.config.modelMapper.IModelMapperService;
import dev.patika.library.dto.request.category.CategorySaveRequest;
import dev.patika.library.dto.response.category.CategoryReponse;
import dev.patika.library.entities.Category;
import dev.patika.library.core.result.ResultData;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/categories")
public class CategoryController {
    private final ICategoryService categoryService;
    private final IModelMapperService modelMapper;
    public CategoryController(ICategoryService categoryService, IModelMapperService modelMapper){
        this.categoryService = categoryService;
        this.modelMapper = modelMapper;
    }
    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public ResultData <CategoryReponse>save(@Valid @RequestBody CategorySaveRequest CategorySaveRequest) {
        Category saveCategory = this.modelMapper.forRequest().map(CategorySaveRequest, Category.class);
        this.categoryService.save(saveCategory);
        CategoryReponse categoryReponse = this.modelMapper.forRequest().map(saveCategory, CategoryReponse.class);
        return new ResultData<> (true,"Veri Eklendi" ,"201",categoryReponse);
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public ResultData<CategoryReponse> get(@PathVariable("id") int id) {
        Category category = this.categoryService
    }
}
