package br.fiap.gff.product.infra.data.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.fiap.gff.product.infra.data.models.ProductModel;

@Repository
public interface ProductRepository extends JpaRepository<ProductModel, Long> {

}
