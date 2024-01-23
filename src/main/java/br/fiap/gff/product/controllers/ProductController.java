package br.fiap.gff.product.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import br.fiap.gff.product.domain.product.Product;
import br.fiap.gff.product.domain.product.ProductUseCase;
import br.fiap.gff.product.domain.product.dto.RequestProductDTO;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/v1/products")
@RequiredArgsConstructor
public class ProductController {
    private final ProductUseCase useCase;

    @GetMapping()
    public ResponseEntity<Iterable<Product>> findAll() {
        return ResponseEntity.ok(useCase.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Product> findById(@PathVariable Long id) {
        return ResponseEntity.ok(useCase.findById(id));
    }

    @PostMapping()
    public ResponseEntity<Product> create(RequestProductDTO dto) {
        Product createdProduct = useCase.create(dto);
        return ResponseEntity
                .created(ServletUriComponentsBuilder.fromCurrentContextPath().path("/{id}")
                        .buildAndExpand(createdProduct.id()).toUri())
                .body(createdProduct);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Product> update(@PathVariable Long id, RequestProductDTO dto) {
        Product updatedProduct = useCase.update(id, dto);
        return ResponseEntity.ok(updatedProduct);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable Long id) {
        useCase.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
