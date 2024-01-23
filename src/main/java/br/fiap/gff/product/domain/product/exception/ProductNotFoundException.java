package br.fiap.gff.product.domain.product.exception;

import br.fiap.gff.product.shared.exceptions.BussinessException;

public class ProductNotFoundException extends BussinessException {

    public ProductNotFoundException(String message) {
        super(message);
    }

}
