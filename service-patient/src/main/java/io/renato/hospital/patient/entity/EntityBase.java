package io.renato.hospital.patient.entity;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

@MappedSuperclass
public class EntityBase implements Serializable {
    private static final long serialVersionUID = 1L;

    @Column(name = "fecha_creacion")
    @Temporal(TemporalType.TIMESTAMP)
    protected Date fechaCreacion;
    @Column(name = "usuario_creador")
    protected String usuarioCreador;
    @Column(name = "fecha_modificacion")
    @Temporal(TemporalType.TIMESTAMP)
    protected Date fechaModificacion;
    @Column(name = "usuario_modificador")
    protected String usuarioModificador;

    public Date getFechaCreacion() {
        if (fechaCreacion == null) {
            return null;
        }
        return new Date(fechaCreacion.getTime());
    }

    public void setFechaCreacion(Date fechaCreacion) {
        if (fechaCreacion == null) {
            this.fechaCreacion = null;
        } else {
            this.fechaCreacion = new Date(fechaCreacion.getTime());
        }
    }

    public Date getFechaModificacion() {
        if (fechaModificacion == null) {
            return null;
        }
        return new Date(fechaModificacion.getTime());
    }

    public void setFechaModificacion(Date fechaModificacion) {
        if (fechaModificacion == null) {
            this.fechaModificacion = null;
        } else {
            this.fechaModificacion = new Date(fechaModificacion.getTime());
        }
    }

    public String getUsuarioCreador() {
        return usuarioCreador;
    }

    public void setUsuarioCreador(String usuarioCreador) {
        this.usuarioCreador = usuarioCreador;
    }

    public String getUsuarioModificador() {
        return usuarioModificador;
    }

    public void setUsuarioModificador(String usuarioModificador) {
        this.usuarioModificador = usuarioModificador;
    }

    @Override
    public String toString() {
        return "EntityBase{" +
                "fechaCreacion=" + fechaCreacion +
                ", usuarioCreador='" + usuarioCreador + '\'' +
                ", fechaModificacion=" + fechaModificacion +
                ", usuarioModificador='" + usuarioModificador + '\'' +
                '}';
    }
}
