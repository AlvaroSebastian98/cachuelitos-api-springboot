package com.tecsup.cachuelitos_api.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "publicaciones")
public class Publicacion implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idpublicaciones")
    private Integer idPublicacion;

    @Column(name = "pub_titulo")
    private String tituloPublicacion;

    @Column(name = "pub_descripcion")
    private String descripcionPublicacion;

    @Column(name = "pub_email")
    private String emailPublicacion;

    @Column(name = "pub_telefono")
    private String telefonoPublicacion;

    @Column(name = "pub_habilidades")
    private String habilidadesPublicacion;

    @Column(name = "pub_estado")
    private Boolean estadoPublicacion;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "pub_fecha")
    private Date fechaPublicacion;

    @ManyToOne
    private Usuario usuario;

    @ManyToOne
    private Distrito distrito;

    public Integer getIdPublicacion() {
        return idPublicacion;
    }

    public void setIdPublicacion(Integer idPublicacion) {
        this.idPublicacion = idPublicacion;
    }

    public String getTituloPublicacion() {
        return tituloPublicacion;
    }

    public void setTituloPublicacion(String tituloPublicacion) {
        this.tituloPublicacion = tituloPublicacion;
    }

    public String getDescripcionPublicacion() {
        return descripcionPublicacion;
    }

    public void setDescripcionPublicacion(String descripcionPublicacion) {
        this.descripcionPublicacion = descripcionPublicacion;
    }

    public String getEmailPublicacion() {
        return emailPublicacion;
    }

    public void setEmailPublicacion(String emailPublicacion) {
        this.emailPublicacion = emailPublicacion;
    }

    public String getTelefonoPublicacion() {
        return telefonoPublicacion;
    }

    public void setTelefonoPublicacion(String telefonoPublicacion) {
        this.telefonoPublicacion = telefonoPublicacion;
    }

    public String getHabilidadesPublicacion() {
        return habilidadesPublicacion;
    }

    public void setHabilidadesPublicacion(String habilidadesPublicacion) {
        this.habilidadesPublicacion = habilidadesPublicacion;
    }

    public Boolean getEstadoPublicacion() {
        return estadoPublicacion;
    }

    public void setEstadoPublicacion(Boolean estadoPublicacion) {
        this.estadoPublicacion = estadoPublicacion;
    }

    public Date getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(Date fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Distrito getDistrito() {
        return distrito;
    }

    public void setDistrito(Distrito distrito) {
        this.distrito = distrito;
    }

    @Override
    public String toString() {
        return "Publicacion{" +
                "idPublicacion=" + idPublicacion +
                ", tituloPublicacion='" + tituloPublicacion + '\'' +
                ", descripcionPublicacion='" + descripcionPublicacion + '\'' +
                ", emailPublicacion='" + emailPublicacion + '\'' +
                ", telefonoPublicacion='" + telefonoPublicacion + '\'' +
                ", habilidadesPublicacion='" + habilidadesPublicacion + '\'' +
                ", estadoPublicacion=" + estadoPublicacion +
                ", fechaPublicacion=" + fechaPublicacion +
                ", usuario=" + usuario +
                ", distrito=" + distrito +
                '}';
    }
}
