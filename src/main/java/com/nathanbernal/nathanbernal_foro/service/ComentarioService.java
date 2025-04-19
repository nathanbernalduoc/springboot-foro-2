package com.nathanbernal.nathanbernal_foro.service;

import java.util.List;
import java.util.Optional;

import com.nathanbernal.nathanbernal_foro.Comentario;

public interface ComentarioService {

    public List<Comentario> getAllComentarios();
    public Optional<Comentario> getComentarioById(Long id);
    public Comentario createComentario(Comentario comentario);
    public Comentario updateComentario(Long id, Comentario comentario);
    public List<Comentario> getComentarioByForoId(Long Id);
    void deleteComentario(Long id);

}
