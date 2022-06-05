package com.integracion.ApiContabilidad.repository;

import com.integracion.ApiContabilidad.model.FacturaDTO;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FacturaDAO extends MongoRepository<FacturaDTO, String> {
}
