package com.crypto.api.models.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "historico_moneda")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class HistoricoMoneda {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    private String codigo;

    @Column(name = "fecha_registro")
    private java.time.LocalDateTime fechaRegistro;
}
