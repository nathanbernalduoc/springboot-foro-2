package com.nathanbernal.nathanbernal_foro;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.RestController;

import com.nathanbernal.nathanbernal_foro.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

@RestController
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("/usuario")
    public List<Usuario> getAllUsuarios() {
        return usuarioService.getAllUsuarios();
    }
    
    @GetMapping("/usuario/{id}")
    public Optional<Usuario> getUsuarioBuId(@PathVariable Long id) {
        return usuarioService.getUsuarioById(id);
    }
    
    @PostMapping("/usuario")
    public Usuario createUsuario(@RequestBody Usuario usuario) {
        return usuarioService.createUsuario(usuario);
    }
    
    @PutMapping("/usuario/{id}")
    public Usuario updateUsuario(@PathVariable Long id, @RequestBody Usuario usuario) {
        return usuarioService.updateUsuario(id, usuario);
    }

    @DeleteMapping("/usuario/{id}")
    public void deleteUsuario(@PathVariable Long id) {
        usuarioService.deleteUsuario(id);
    }
}
