package com.project.expensetrackerproject.Entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@ApiModel(description = "Entidad/Modelo que representa a la categoria del gasto")
@Table(name="category")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CategoryEntity {
@Id
    @SequenceGenerator(
            name="category_sequence",
            sequenceName="category_sequence",
            allocationSize =1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "category_sequence"
    )
    @ApiModelProperty(notes = "El id se genera automaticamente", example = "4", required = false, allowEmptyValue = true)
    private Long id;
@ApiModelProperty(notes = "Nombre de la categoria", example = "Comida", required = false, allowEmptyValue = true)
    private String name;

@Size(max=500)
@ApiModelProperty(notes = "Descripción de la categoria", example = "Comida china", required = false, allowEmptyValue = true)
    private String description;
}
