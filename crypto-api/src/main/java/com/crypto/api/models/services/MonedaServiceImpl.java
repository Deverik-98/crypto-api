package com.crypto.api.models.services;

import com.crypto.api.models.dao.MonedaRepository;
import com.crypto.api.models.entity.Moneda;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MonedaServiceImpl implements MonedaService {

    @Autowired
    private MonedaRepository monedaRepo;

    @Override
    public List<Moneda> findAll() {
        return monedaRepo.findAll();
    }

    @Override
    public Moneda save(Moneda moneda) {
        return monedaRepo.save(moneda);
    }
}
