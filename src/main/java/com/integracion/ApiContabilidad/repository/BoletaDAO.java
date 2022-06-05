package com.integracion.ApiContabilidad.repository;

import com.integracion.ApiContabilidad.model.BoletaDTO;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BoletaDAO extends MongoRepository<BoletaDTO, String> {
}
