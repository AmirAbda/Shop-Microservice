package com.amir.product_microservice.dto;

import java.math.BigDecimal;

import jakarta.validation.constraints.NotNull;


public record ProductRequest(

    Integer id,
    @NotNull(message = "name should not be empty")
    String name,
    @NotNull(message = "description should not be empty ")
    String description,
    @NotNull(message = "availableQuantity should not be empty")
    Double availableQuantity,
    @NotNull(message = "price should not be empty ")
    BigDecimal price,
    @NotNull(message = "category should not be empty")
    Integer categoryId

) {

}
