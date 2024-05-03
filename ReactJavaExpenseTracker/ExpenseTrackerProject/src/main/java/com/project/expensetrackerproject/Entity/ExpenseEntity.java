package com.project.expensetrackerproject.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import net.bytebuddy.implementation.bind.annotation.Default;
import org.springframework.boot.context.properties.bind.DefaultValue;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name = "expense")
@Data

@AllArgsConstructor
@NoArgsConstructor

@ApiModel(description = "Entidad/Modelo que representa los gastos del usuario")
public class ExpenseEntity {
    @ApiModelProperty(notes = "Nombre del item gastado", example = "Shoes", required = true)
    @NotEmpty(message="El gasto no puede estar vacio, de ser asi no existe.")
    private String name;

    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    @ApiModelProperty(notes = "Los ID de los gastos son generados automaticamente", example = "NA",  allowEmptyValue = true)
    private Long expenseId;

    @ApiModelProperty(notes ="ID de la categoria, use los endpoints de la categoria para encontrar la deseada", example="1", required =true)
    private Long categoryId;

    @PastOrPresent
    @ApiModelProperty(notes="Formato de fecha YYYY-MM-DD", example = "2021-07-31", allowEmptyValue=true)
    private LocalDate creationDate;

    @Min(1)
    @ApiModelProperty(notes = "Cantidad de itemes", example ="45", required = true)
    private Double amount;

    @Size(max = 500)
    @ApiModelProperty(notes="Información adicional del gasto", example="Chocolate amargo", allowEmptyValue = true)
    private String additionalInfo;

}
