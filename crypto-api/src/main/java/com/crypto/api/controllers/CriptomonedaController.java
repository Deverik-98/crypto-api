package com.crypto.api.controllers;

import com.crypto.api.models.entity.Criptomoneda;
import com.crypto.api.models.services.CriptomonedaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/criptomoneda")
@CrossOrigin(origins = "*")
public class CriptomonedaController {

    @Autowired
    private CriptomonedaService criptoService;

    @GetMapping
    public List<Criptomoneda> listar(@RequestParam(name = "moneda", required = false) Long monedaId) {
        if (monedaId != null) {
            return criptoService.findByMonedaId(monedaId);
        }
        return criptoService.findAll();
    }

    @PostMapping
    public Criptomoneda crear(@RequestBody Criptomoneda cripto) {
        return criptoService.save(cripto);
    }

    @PutMapping("/{id}")
    public Criptomoneda actualizar(@PathVariable Long id, @RequestBody Criptomoneda cripto) {
        return criptoService.update(id, cripto);
    }
}
