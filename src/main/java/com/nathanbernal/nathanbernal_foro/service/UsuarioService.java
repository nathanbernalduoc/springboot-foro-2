package com.nathanbernal.nathanbernal_foro.service;

import java.util.List;
import java.util.Optional;

import com.nathanbernal.nathanbernal_foro.Usuario;

public interface UsuarioService {

    public List<Usuario> getAllUsuarios();
    public Optional<Usuario> getUsuarioById(Long id);
    public Usuario createUsuario(Usuario usuario);
    public Usuario updateUsuario(Long id, Usuario usuario);
    void deleteUsuario(Long id);

}
