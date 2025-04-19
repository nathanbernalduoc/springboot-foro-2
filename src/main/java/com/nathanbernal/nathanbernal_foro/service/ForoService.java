package com.nathanbernal.nathanbernal_foro.service;

import java.util.List;
import java.util.Optional;

import com.nathanbernal.nathanbernal_foro.Foro;

public interface ForoService {

    public List<Foro> getAllForos();
    public Optional<Foro> getForoById(Long id);
    public Foro createForo(Foro foro);
    public Foro updateForo(Long id, Foro foro);
    void deleteForo(Long id);

}
