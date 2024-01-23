package br.fiap.gff.product.domain.product;

import br.fiap.gff.product.shared.utils.Coalesce;
import lombok.Builder;

@Builder
public record Product(Long id, String name, String description, Double price, Integer stock, Long categoryId) {

    public Product updateTo(Product product) {
        String name = Coalesce.of(product.name, this.name);
        String description = Coalesce.of(product.description, this.description);
        Double price = Coalesce.of(product.price, this.price);
        Integer stock = Coalesce.of(product.stock, this.stock);
        Long categoryId = Coalesce.of(product.categoryId, this.categoryId);
        return new Product(this.id, name, description, price, stock, categoryId);
    }

}
