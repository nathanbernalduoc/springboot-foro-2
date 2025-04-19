package com.nathanbernal.nathanbernal_foro.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

import com.nathanbernal.nathanbernal_foro.Comentario;

public interface ComentarioRepository extends JpaRepository<Comentario, Long>{

    List<Comentario> findByForoId(Long foroId);

}
