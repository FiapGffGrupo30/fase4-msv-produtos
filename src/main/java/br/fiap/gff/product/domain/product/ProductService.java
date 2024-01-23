package br.fiap.gff.product.domain.product;

import org.springframework.stereotype.Service;

import br.fiap.gff.product.domain.product.dto.RequestProductDTO;
import br.fiap.gff.product.domain.product.exception.ProductNotFoundException;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProductService implements ProductUseCase {
    private final ProductDAO dao;

    @Override
    public Product create(RequestProductDTO dto) {
        return dao.save(dto.toEntity());
    }

    @Override
    public Product update(Long id, RequestProductDTO dto) {
        Product p = findById(id);
        return dao.save(p.updateTo(dto.toEntity()));
    }

    @Override
    public void deleteById(Long id) {
        dao.deleteById(id);
    }

    @Override
    public Product findById(Long id) {
        return dao.findById(id).orElseThrow(() -> new ProductNotFoundException("Product not found"));
    }

    @Override
    public Iterable<Product> findAll() {
        return dao.findAll();
    }
}
