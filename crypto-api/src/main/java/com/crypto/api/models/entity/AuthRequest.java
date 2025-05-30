package com.crypto.api.models.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AuthRequest {
    private String correo;
    private String clave;
}
