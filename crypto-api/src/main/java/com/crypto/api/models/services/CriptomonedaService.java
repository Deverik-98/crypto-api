package com.crypto.api.models.services;

import com.crypto.api.models.entity.Criptomoneda;

import java.util.List;

public interface CriptomonedaService {
    List<Criptomoneda> findAll();
    List<Criptomoneda> findByMonedaId(Long monedaId);
    Criptomoneda save(Criptomoneda criptomoneda);
    Criptomoneda update(Long id, Criptomoneda criptomoneda);
}
