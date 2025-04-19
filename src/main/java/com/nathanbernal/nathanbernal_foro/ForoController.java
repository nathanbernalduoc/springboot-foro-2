package com.nathanbernal.nathanbernal_foro;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nathanbernal.nathanbernal_foro.service.ForoService;

@RestController
public class ForoController {

    @Autowired
    private ForoService usuarioService;

    @GetMapping("/foro")
    public List<Foro> getAllForos() {
        return usuarioService.getAllForos();
    }
    
    @GetMapping("/foro/{id}")
    public Optional<Foro> getForoBuId(@PathVariable Long id) {
        return usuarioService.getForoById(id);
    }
    
    @PostMapping("/foro")
    public Foro createForo(@RequestBody Foro usuario) {
        return usuarioService.createForo(usuario);
    }
    
    @PutMapping("/foro/{id}")
    public Foro updateForo(@PathVariable Long id, @RequestBody Foro usuario) {
        return usuarioService.updateForo(id, usuario);
    }

    @DeleteMapping("/foro/{id}")
    public void deleteForo(@PathVariable Long id) {
        usuarioService.deleteForo(id);
    }


}
