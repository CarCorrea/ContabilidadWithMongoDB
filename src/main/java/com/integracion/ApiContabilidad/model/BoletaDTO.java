package com.integracion.ApiContabilidad.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.util.List;

@Data
@Document(collection = "boletas")
public class BoletaDTO {

    @Id
    private String NroBoleta;
    private List<ProductoDTO> productos;
    //private String producto;
    private int montoBoleta;
    private String estadoBoleta;
    private LocalDate fechaCreacion;
    private String usuario;
}
