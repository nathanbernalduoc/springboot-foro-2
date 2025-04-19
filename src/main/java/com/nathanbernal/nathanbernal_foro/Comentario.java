package com.nathanbernal.nathanbernal_foro;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "NF_COMENTARIO")
public class Comentario {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "comentario_seq")
    @SequenceGenerator(name = "comentario_seq", sequenceName = "SEQ_NF_COMENTARIO_ID", allocationSize = 1)
    @Column(name = "comentario_id")
    private Long id;
    @Column(name = "foro_id")
    private Long foroId;
    @Column(name = "usuario_id")
    private Long usuarioId;
    @Column(name = "comentario")
    private String comentario;
    @Column(name = "registro_fecha")
    private Date registroFecha;

    Comentario() {

    }

    Comentario(Long id, Long foroId, Long usuarioId, String comentario, Date registroFecha) {
        this.id = id;
        this.foroId = foroId;
        this.usuarioId = usuarioId;
        this.comentario = comentario;
        this.registroFecha = registroFecha;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getForoId() {
        return foroId;
    }

    public void setForoId(Long foroId) {
        this.foroId = foroId;
    }

    public Long getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(Long usuarioId) {
        this.usuarioId = usuarioId;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public Date getRegistroFecha() {
        return registroFecha;
    }

    public void setRegistroFecha(Date registroFecha) {
        this.registroFecha = registroFecha;
    }

}
