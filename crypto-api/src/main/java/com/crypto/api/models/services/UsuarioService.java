package com.crypto.api.models.services;

import com.crypto.api.models.entity.Usuario;

import java.util.Optional;

public interface UsuarioService {
    Optional<Usuario> findByCorreo(String correo);
    Usuario save(Usuario usuario);
}
