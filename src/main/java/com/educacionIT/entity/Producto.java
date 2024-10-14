package com.educacionIT.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import java.time.LocalDateTime;
import java.util.List;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;


@Data
@Entity
@Table(name = "Producto")
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "prod_cod")
    private Integer codigo;
    @Column(name="prod_nombre", nullable= false, length = 100)
    private String nombre;
    @Column(name="prod_descripcion", nullable=false,length=100)
    private String descripcion;
    @CreationTimestamp
    @Column(name="prod_fechaIngreso", updatable=false)
    private LocalDateTime fechaIngreso;
    @Column(name="prod_precio", nullable=false)
    private Double precio;
    @Column(name="prod_cant", nullable=false)
    private Integer cantidad;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="prod_img_id", referencedColumnName ="img_id")
    private ImagenProducto imagenProducto;
    
    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.DETACH)
    @JoinTable(name="prod_Cat",
            joinColumns = {@JoinColumn(name = "producto_prod_cod")},
            inverseJoinColumns = {@JoinColumn(name="categoria_cat_cod")})
    private List<Categoria> categorias;
}
