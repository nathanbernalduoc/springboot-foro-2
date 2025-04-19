package com.nathanbernal.nathanbernal_foro;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "NF_FORO")
public class Foro {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "foro_seq")
    @SequenceGenerator(name = "foro_seq", sequenceName = "SEQ_NF_FORO_ID", allocationSize = 1)
    @Column(name = "foro_id")
    private Long id;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "categoria_id")
    private Long categoriaId;

    Foro() {

    }

    Foro(Long id, String nombre, Long categoriaId) {
        this.id = id;
        this.nombre = nombre;
        this.categoriaId = categoriaId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Long getCategoriaId() {
        return categoriaId;
    }

    public void setCategoriaId(Long categoriaId) {
        this.categoriaId = categoriaId;
    }
    
}
