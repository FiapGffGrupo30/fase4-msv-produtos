package br.fiap.gff.product.domain.category.dto;

import br.fiap.gff.product.domain.category.Category;

public record RequestCategoryDTO(String name, String description) {
    public Category toEntity() {
        return new Category(null, name, description);
    }
}
