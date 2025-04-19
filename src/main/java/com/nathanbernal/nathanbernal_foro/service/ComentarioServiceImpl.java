package com.nathanbernal.nathanbernal_foro.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nathanbernal.nathanbernal_foro.Comentario;
import com.nathanbernal.nathanbernal_foro.repository.ComentarioRepository;

@Service
public class ComentarioServiceImpl implements ComentarioService {

    @Autowired
    private ComentarioRepository comentarioRepository;

    @Override
    public List<Comentario> getAllComentarios() {
        return comentarioRepository.findAll();
    }

    @Override
    public Optional<Comentario> getComentarioById(Long id) {
        return comentarioRepository.findById(id);
    }

    @Override
    public Comentario createComentario(Comentario comentario) {
        return comentarioRepository.save(comentario);
    }

    @Override
    public Comentario updateComentario(Long id, Comentario comentario) {
        if (comentarioRepository.existsById(id)) {
            comentario.setId(id);
            return comentarioRepository.save(comentario);
        } else {
            return null;
        }
    }

    @Override
    public void deleteComentario(Long id) {
        comentarioRepository.deleteById(id);
    }

    @Override
    public List<Comentario> getComentarioByForoId(Long foroId) {
        return comentarioRepository.findByForoId(foroId);
    }

}
