package com.crypto.api.controllers;

import com.crypto.api.models.dao.*;
import com.crypto.api.models.entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/historial")
@CrossOrigin
public class HistoricoController {

    @Autowired
    private MonedaRepository monedaRepo;

    @Autowired
    private CriptomonedaRepository criptomonedaRepo;

    @Autowired
    private HistoricoMonedaRepository historicoMonedaRepo;

    @Autowired
    private HistoricoCriptomonedaRepository historicoCriptoRepo;

    @PostMapping("/sync")
    public String sincronizar() {
    	
        List<Criptomoneda> criptos = criptomonedaRepo.findAll();
        for (Criptomoneda c : criptos) {
            HistoricoCriptomoneda h = new HistoricoCriptomoneda();
            h.setNombre(c.getNombre());
            h.setSimbolo(c.getSimbolo());
            h.setMonedaId(c.getMoneda().getId());
            h.setFechaRegistro(LocalDateTime.now());
            historicoCriptoRepo.save(h);
        }
        criptomonedaRepo.deleteAll();
        
        List<Moneda> monedas = monedaRepo.findAll();
        for (Moneda m : monedas) {
            HistoricoMoneda h = new HistoricoMoneda();
            h.setNombre(m.getNombre());
            h.setCodigo(m.getCodigo());
            h.setFechaRegistro(LocalDateTime.now());
            historicoMonedaRepo.save(h);
        }
        monedaRepo.deleteAll();

        return "Históricos sincronizados correctamente";
    }
}
