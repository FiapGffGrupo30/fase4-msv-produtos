package br.fiap.gff.product.domain.category;

import br.fiap.gff.product.domain.category.dto.RequestCategoryDTO;

public interface CategoryUseCase {

    /**
     * Cria uma nova categoria
     * 
     * @param dto dados da categoria
     * @return Category
     */
    Category create(RequestCategoryDTO dto);

    /**
     * Atualiza uma categoria
     * 
     * @param id  id da categoria
     * @param dto dados da categoria
     * @return Category
     */
    Category update(Long id, RequestCategoryDTO dto);

    /**
     * Deleta uma categoria
     * 
     * @param id id da categoria
     */
    void deleteById(Long id);

    /**
     * Busca uma categoria pelo id
     * 
     * @param id id da categoria
     * @return Category
     */
    Category findById(Long id);

    /**
     * Busca todas as categorias
     * 
     * @return Iterable
     */
    Iterable<Category> findAll();
}
