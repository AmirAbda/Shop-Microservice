package com.amir.product_microservice.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
@Entity
public class Category {
    @Id
    @GeneratedValue()
    private int id ;

    private String name;

    private String description;
    
    @OneToMany(
        mappedBy = "category"
        ,cascade = CascadeType.REMOVE
    )
    private List<Product> products;
    
    
}
