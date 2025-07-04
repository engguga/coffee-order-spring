package com.starbuzz.exception;

public class InvalidIngredientException extends RuntimeException {
    public InvalidIngredientException(String ingredient) {
        super("Ingrediente inválido: " + ingredient);
    }
}
