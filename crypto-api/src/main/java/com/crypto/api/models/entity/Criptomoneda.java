package com.crypto.api.models.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "criptomoneda")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Criptomoneda {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    private String simbolo;

    @ManyToOne
    @JoinColumn(name = "moneda_id")
    private Moneda moneda;
}
