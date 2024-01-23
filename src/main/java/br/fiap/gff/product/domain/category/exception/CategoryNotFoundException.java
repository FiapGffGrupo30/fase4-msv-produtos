package br.fiap.gff.product.domain.category.exception;

import br.fiap.gff.product.shared.exceptions.BussinessException;

public class CategoryNotFoundException extends BussinessException {

    public CategoryNotFoundException(String message) {
        super(message);
    }

}
