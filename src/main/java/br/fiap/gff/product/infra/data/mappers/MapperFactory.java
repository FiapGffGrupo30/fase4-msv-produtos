package br.fiap.gff.product.infra.data.mappers;

/**
 * Interface para criação de mappers
 * 
 * @param <E> entidade
 * @param <M> modelo
 */
public interface MapperFactory<E, M> {
    E fromModel(M model);

    M toModel(E entity);
}
