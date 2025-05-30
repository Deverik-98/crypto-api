package com.crypto.api.models.services;

import com.crypto.api.models.dao.CriptomonedaRepository;
import com.crypto.api.models.entity.Criptomoneda;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CriptomonedaServiceImpl implements CriptomonedaService {

    @Autowired
    private CriptomonedaRepository criptomonedaRepo;

    @Override
    public List<Criptomoneda> findAll() {
        return criptomonedaRepo.findAll();
    }

    @Override
    public List<Criptomoneda> findByMonedaId(Long monedaId) {
        return criptomonedaRepo.findByMoneda_Id(monedaId);
    }

    @Override
    public Criptomoneda save(Criptomoneda criptomoneda) {
        return criptomonedaRepo.save(criptomoneda);
    }

    @Override
    public Criptomoneda update(Long id, Criptomoneda data) {
        Optional<Criptomoneda> actual = criptomonedaRepo.findById(id);
        if (actual.isPresent()) {
            Criptomoneda cripto = actual.get();
            cripto.setNombre(data.getNombre());
            cripto.setSimbolo(data.getSimbolo());
            cripto.setMoneda(data.getMoneda());
            return criptomonedaRepo.save(cripto);
        }
        return null;
    }
}
