package com.crypto.api.models.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "historico_criptomoneda")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class HistoricoCriptomoneda {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    private String simbolo;

    @Column(name = "moneda_id")
    private Long monedaId;

    @Column(name = "fecha_registro")
    private java.time.LocalDateTime fechaRegistro;
}
