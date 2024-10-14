package com.educacionIT.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import java.util.List;
import lombok.Data;


@Data
@Entity
@Table(name = "Categoria")
public class Categoria {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="cat_codigo")
    private Integer codigo;
    @Column(name="cat_nombre", nullable=false, length=30)
    private String nombre;
    @ManyToMany(mappedBy = "categorias")
    private List<Producto> productos;
}
