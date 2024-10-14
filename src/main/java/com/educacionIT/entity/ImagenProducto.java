package com.educacionIT.entity;

import lombok.Data;

@Data
public class ImagenProducto {
    private Integer id;
    private String nombreArchivo;
    private byte[] imagen;
}
