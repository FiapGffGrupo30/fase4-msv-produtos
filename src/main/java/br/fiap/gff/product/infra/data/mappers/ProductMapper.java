package br.fiap.gff.product.infra.data.mappers;

import org.mapstruct.Mapper;

import br.fiap.gff.product.domain.product.Product;
import br.fiap.gff.product.infra.data.models.ProductModel;

@Mapper(componentModel = "spring")
public interface ProductMapper extends MapperFactory<Product, ProductModel> {

}
