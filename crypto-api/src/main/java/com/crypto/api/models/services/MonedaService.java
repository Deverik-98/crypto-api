package com.crypto.api.models.services;

import com.crypto.api.models.entity.Moneda;

import java.util.List;

public interface MonedaService {
    List<Moneda> findAll();
    Moneda save(Moneda moneda);
}
