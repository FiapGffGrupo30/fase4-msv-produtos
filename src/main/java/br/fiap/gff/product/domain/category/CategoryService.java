package br.fiap.gff.product.domain.category;

import org.springframework.stereotype.Service;

import br.fiap.gff.product.domain.category.dto.RequestCategoryDTO;
import br.fiap.gff.product.domain.category.exception.CategoryNotFoundException;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class CategoryService implements CategoryUseCase {

    private final CategoryDAO dao;

    @Override
    public Category create(RequestCategoryDTO dto) {
        return dao.save(dto.toEntity());
    }

    @Override
    public Category update(Long id, RequestCategoryDTO dto) {
        Category c = findById(id);
        return dao.save(c.updateTo(dto.toEntity()));
    }

    @Override
    public void deleteById(Long id) {
        dao.deleteById(id);
    }

    @Override
    public Category findById(Long id) {
        return dao.findById(id).orElseThrow(() -> new CategoryNotFoundException("Category not found"));
    }

    @Override
    public Iterable<Category> findAll() {
        return dao.findAll();
    }

}
