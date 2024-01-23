package br.fiap.gff.product.infra.data.repositories.daos;

import org.springframework.stereotype.Component;

import br.fiap.gff.product.domain.product.Product;
import br.fiap.gff.product.domain.product.ProductDAO;
import br.fiap.gff.product.infra.data.mappers.ProductMapper;
import br.fiap.gff.product.infra.data.models.ProductModel;
import br.fiap.gff.product.infra.data.repositories.ProductRepository;

@Component
public class ProductDaoImpl extends BaseDaoImpl<Product, ProductModel> implements ProductDAO {

    public ProductDaoImpl(ProductRepository repository, ProductMapper mapper) {
        super(repository, mapper);  
    }

}
