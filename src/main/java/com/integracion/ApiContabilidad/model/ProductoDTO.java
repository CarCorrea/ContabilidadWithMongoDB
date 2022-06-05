package com.integracion.ApiContabilidad.model;

import lombok.Data;

@Data
public class ProductoDTO {

    private String idProducto;
    private String nombreProducto;
    private int precio;
    private int cantidad;
}
