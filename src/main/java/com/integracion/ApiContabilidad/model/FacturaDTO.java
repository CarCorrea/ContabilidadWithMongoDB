package com.integracion.ApiContabilidad.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Data
@Document(collection = "facturas")
public class FacturaDTO {

    private String NroFactura;
    private List<ProductoDTO> productos;
    private int montoFactura;
    private String estadoFactura;
    private LocalDate fechaCreacion;
    private String usuario;
}
