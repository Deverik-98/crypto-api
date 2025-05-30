package com.crypto.api.models.dao;

import com.crypto.api.models.entity.HistoricoMoneda;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HistoricoMonedaRepository extends JpaRepository<HistoricoMoneda, Long> {
}
