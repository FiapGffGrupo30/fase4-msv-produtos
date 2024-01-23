package br.fiap.gff.product.domain.category;

import br.fiap.gff.product.shared.utils.Coalesce;
import lombok.Builder;

@Builder
public record Category(Long id, String name, String description) {

    public Category updateTo(Category category) {
        String name = Coalesce.of(category.name, this.name);
        String description = Coalesce.of(category.description, this.description);
        return new Category(this.id, name, description);
    }

}
