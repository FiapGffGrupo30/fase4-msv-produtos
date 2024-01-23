package br.fiap.gff.product.infra.data.repositories.daos;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.fiap.gff.product.infra.data.mappers.MapperFactory;
import br.fiap.gff.product.shared.contracts.BaseDAO;

public abstract class BaseDaoImpl<E, M> implements BaseDAO<E> {

    private final JpaRepository<M, Long> repository;
    private final MapperFactory<E, M> mapper;

    public BaseDaoImpl(JpaRepository<M, Long> repository, MapperFactory<E, M> mapper) {
        this.mapper = mapper;
        this.repository = repository;
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    @Override
    public Iterable<E> findAll() {
        return repository.findAll().stream().map(mapper::fromModel).toList();
    }

    @Override
    public Optional<E> findById(Long id) {
        return repository.findById(id).map(mapper::fromModel);
    }

    @Override
    public E save(E entity) {
        M m = mapper.toModel(entity);
        return mapper.fromModel(repository.save(m));
    }

}
