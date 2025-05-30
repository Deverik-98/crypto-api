package com.crypto.api.models.services;

import com.crypto.api.models.dao.UsuarioRepository;
import com.crypto.api.models.entity.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepo;

    @Override
    public Optional<Usuario> findByCorreo(String correo) {
        return usuarioRepo.findByCorreo(correo);
    }

    @Override
    public Usuario save(Usuario usuario) {
        return usuarioRepo.save(usuario);
    }
}
