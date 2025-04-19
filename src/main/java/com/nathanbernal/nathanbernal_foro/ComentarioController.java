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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nathanbernal.nathanbernal_foro.service.ComentarioService;

@RestController
public class ComentarioController {

    @Autowired
    private ComentarioService comentarioService;

    @GetMapping("/comentario")
    public List<Comentario> getAllComentarios() {
        return comentarioService.getAllComentarios();
    }
    
    @GetMapping("/comentario/{id}")
    public Optional<Comentario> getComentarioBuId(@PathVariable Long id) {
        return comentarioService.getComentarioById(id);
    }
    
    @PostMapping("/comentario")
    public Comentario createComentario(@RequestBody Comentario comentario) {
        return comentarioService.createComentario(comentario);
    }
    
    @PutMapping("/comentario/{id}")
    public Comentario updateComentario(@PathVariable Long id, @RequestBody Comentario comentario) {
        return comentarioService.updateComentario(id, comentario);
    }

    @DeleteMapping("/comentario/{id}")
    public void deleteComentario(@PathVariable Long id) {
        comentarioService.deleteComentario(id);
    }

}
