package br.fiap.gff.product.domain.product;

import br.fiap.gff.product.domain.product.dto.RequestProductDTO;

public interface ProductUseCase {

    /**
     * Cria um novo produto
     * 
     * @param dto dados do produto
     * @return Product
     */
    Product create(RequestProductDTO dto);

    /**
     * Atualiza um produto
     * 
     * @param id  id do produto
     * @param dto dados do produto
     * @return Product
     */
    Product update(Long id, RequestProductDTO dto);

    /**
     * Deleta um produto
     * 
     * @param id id do produto
     */
    void deleteById(Long id);

    /**
     * Busca um produto pelo id
     * 
     * @param id id do produto
     * @return Product
     */
    Product findById(Long id);

    /**
     * Busca todos os produtos
     * 
     * @return Iterable
     */
    Iterable<Product> findAll();
}
