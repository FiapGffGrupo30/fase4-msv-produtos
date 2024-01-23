package br.fiap.gff.product.domain.product.dto;

import br.fiap.gff.product.domain.product.Product;

public record RequestProductDTO(String name, String description, Double price, Integer stock, Long categoryId) {
    public Product toEntity() {
        return new Product(null, name, description, price, stock, categoryId);
    }
}
