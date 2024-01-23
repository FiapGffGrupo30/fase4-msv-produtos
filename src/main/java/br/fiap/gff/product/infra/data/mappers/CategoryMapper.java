package br.fiap.gff.product.infra.data.mappers;

import org.mapstruct.Mapper;

import br.fiap.gff.product.domain.category.Category;
import br.fiap.gff.product.infra.data.models.CategoryModel;

@Mapper(componentModel = "spring")
public interface CategoryMapper extends MapperFactory<Category, CategoryModel> {
}
