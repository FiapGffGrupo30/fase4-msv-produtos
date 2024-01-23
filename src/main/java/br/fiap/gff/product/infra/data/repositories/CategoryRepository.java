package br.fiap.gff.product.infra.data.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.fiap.gff.product.infra.data.models.CategoryModel;

@Repository
public interface CategoryRepository extends JpaRepository<CategoryModel, Long> {

}
