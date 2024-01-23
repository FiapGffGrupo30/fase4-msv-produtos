package br.fiap.gff.product.infra.data.repositories.daos;

import org.springframework.stereotype.Component;

import br.fiap.gff.product.domain.category.Category;
import br.fiap.gff.product.domain.category.CategoryDAO;
import br.fiap.gff.product.infra.data.mappers.CategoryMapper;
import br.fiap.gff.product.infra.data.models.CategoryModel;
import br.fiap.gff.product.infra.data.repositories.CategoryRepository;

@Component
public class CategoryDaoImpl extends BaseDaoImpl<Category, CategoryModel> implements CategoryDAO {

    public CategoryDaoImpl(CategoryRepository repository, CategoryMapper mapper) {
        super(repository, mapper);
    }

}
