package br.fiap.gff.product.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import br.fiap.gff.product.domain.category.Category;
import br.fiap.gff.product.domain.category.CategoryUseCase;
import br.fiap.gff.product.domain.category.dto.RequestCategoryDTO;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/v1/category")
@RequiredArgsConstructor
public class CategoryController {

    private final CategoryUseCase useCase;

    @GetMapping()
    public ResponseEntity<Iterable<Category>> findAll() {
        return ResponseEntity.ok(useCase.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Category> findById(Long id) {
        return ResponseEntity.ok(useCase.findById(id));
    }

    @PostMapping()
    public ResponseEntity<Category> create(RequestCategoryDTO dto) {
        Category createdCategory = useCase.create(dto);
        return ResponseEntity.created(ServletUriComponentsBuilder.fromCurrentContextPath().path("/{id}")
                .buildAndExpand(createdCategory.id()).toUri()).body(createdCategory);
    }

    @PutMapping()
    public ResponseEntity<Category> update(Long id, RequestCategoryDTO dto) {
        Category updatedCategory = useCase.update(id, dto);
        return ResponseEntity.ok(updatedCategory);
    }

    @DeleteMapping()
    public ResponseEntity<Void> deleteById(Long id) {
        useCase.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
