package com.crypto.api.models.dao;

import com.crypto.api.models.entity.HistoricoCriptomoneda;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HistoricoCriptomonedaRepository extends JpaRepository<HistoricoCriptomoneda, Long> {
}
