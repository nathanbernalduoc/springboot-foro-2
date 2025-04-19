package com.nathanbernal.nathanbernal_foro.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nathanbernal.nathanbernal_foro.Foro;
import com.nathanbernal.nathanbernal_foro.repository.ForoRepository;

@Service
public class ForoServiceImpl implements ForoService {

    @Autowired
    private ForoRepository foroRepository;

    @Override
    public List<Foro> getAllForos() {
        return foroRepository.findAll();
    }

    @Override
    public Optional<Foro> getForoById(Long id) {
        return foroRepository.findById(id);
    }

    @Override
    public Foro createForo(Foro foro) {
        return foroRepository.save(foro);
    }

    @Override
    public Foro updateForo(Long id, Foro foro) {
        if (foroRepository.existsById(id)) {
            foro.setId(id);
            return foroRepository.save(foro);
        } else {
            return null;
        }
    }

    @Override
    public void deleteForo(Long id) {
        foroRepository.deleteById(id);
    }

}
