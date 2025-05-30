package com.crypto.api.models.dao;

import com.crypto.api.models.entity.Moneda;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MonedaRepository extends JpaRepository<Moneda, Long> {
}
