package com.educacionIT.entity;

import java.time.LocalDate;
import java.util.List;
import lombok.Data;


@Data
public class Producto {
    private Integer codigo;
    private String nombre;
    private String descripcion;
    private LocalDate fechaIngreso;
    private Double precio;
    private Integer cantidad;
    private ImagenProducto imagenProducto;
    private List<Categoria> categorias;
}
