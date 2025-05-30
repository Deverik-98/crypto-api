package com.crypto.api.controllers;

import com.crypto.api.models.entity.Moneda;
import com.crypto.api.models.services.MonedaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/moneda")
@CrossOrigin(origins = "*")
public class MonedaController {

    @Autowired
    private MonedaService monedaService;

    @GetMapping
    public List<Moneda> listar() {
        return monedaService.findAll();
    }

    @PostMapping
    public Moneda crear(@RequestBody Moneda moneda) {
        return monedaService.save(moneda);
    }
}
