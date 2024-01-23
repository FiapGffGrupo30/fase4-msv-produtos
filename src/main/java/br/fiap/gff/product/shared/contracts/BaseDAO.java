package br.fiap.gff.product.shared.contracts;

import java.util.Optional;

public interface BaseDAO<E> {

    /**
     * Busca uma entidade pelo id
     * 
     * @param id
     * @return Optional
     */
    Optional<E> findById(Long id);

    /**
     * Busca todas as entidades
     * 
     * @return Iterable
     */
    Iterable<E> findAll();

    /**
     * Cria uma nova entidade
     * 
     * @param entity
     * @return E
     */
    E save(E entity);

    /**
     * Deleta uma entidade
     * 
     * @param id
     */
    void deleteById(Long id);
}
