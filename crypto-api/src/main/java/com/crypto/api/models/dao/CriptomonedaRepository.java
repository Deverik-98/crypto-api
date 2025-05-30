package com.crypto.api.models.dao;

import com.crypto.api.models.entity.Criptomoneda;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CriptomonedaRepository extends JpaRepository<Criptomoneda, Long> {
    List<Criptomoneda> findByMoneda_Id(Long monedaId);
}
