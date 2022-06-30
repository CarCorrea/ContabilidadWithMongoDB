package com.integracion.ApiContabilidad.controller;

import com.integracion.ApiContabilidad.model.BoletaDTO;
import com.integracion.ApiContabilidad.model.FacturaDTO;
import com.integracion.ApiContabilidad.repository.FacturaDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.POST, RequestMethod.GET, RequestMethod.PUT, RequestMethod.DELETE})
@RequestMapping("/facturas")
public class FacturaController {

    @Autowired
    private FacturaDAO repository;

    @PostMapping("/factura")
    public FacturaDTO create(@Validated @RequestBody FacturaDTO factura){
        return repository.insert(factura);
    }

    @GetMapping("/all")
    public List<FacturaDTO> getAll(){
        return repository.findAll();
    }

    @PutMapping("/factura/{id}")
    public FacturaDTO update(@PathVariable String id, @Validated @RequestBody FacturaDTO factura){
        return repository.save(factura);
    }

    @DeleteMapping("/factura/{id}")
    public void delete(@PathVariable String id){
        repository.deleteById(id);
    }

}
