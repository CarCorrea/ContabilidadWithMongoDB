package com.integracion.ApiContabilidad.controller;

import com.integracion.ApiContabilidad.model.BoletaDTO;
import com.integracion.ApiContabilidad.repository.BoletaDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.POST, RequestMethod.GET, RequestMethod.PUT, RequestMethod.DELETE})
@RequestMapping("/boletas")
public class BoletaController {

    @Autowired
    private BoletaDAO repository;

    public BoletaController(BoletaDAO repository) {
        this.repository = repository;
    }

    @PostMapping("/boleta")
    public BoletaDTO create(@Validated @RequestBody BoletaDTO boleta){
        return repository.save(boleta);
    }

    @GetMapping("/all")
    public List<BoletaDTO> getAll(){
        return repository.findAll();
    }

    @PutMapping("/boleta/{id}")
    public BoletaDTO update(@PathVariable String id, @Validated @RequestBody BoletaDTO boleta){
        return repository.save(boleta);
    }

    @DeleteMapping("/boleta/{id}")
    public void delete(@PathVariable String id){
        repository.deleteById(id);
    }


}
