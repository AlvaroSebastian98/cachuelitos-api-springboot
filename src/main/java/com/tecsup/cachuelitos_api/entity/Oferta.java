package com.tecsup.cachuelitos_api.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "ofertas")
public class Oferta implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idofertas")
    private Integer idOferta;

    @Column(name = "cotizar")
    private Double cotizarOferta;

    @Column(name = "detalle")
    private String detalleOferta;

    @ManyToOne
    private Publicacion publicacion;

    @ManyToOne
    private Usuario usuario;

    public Integer getIdOferta() {
        return idOferta;
    }

    public void setIdOferta(Integer idOferta) {
        this.idOferta = idOferta;
    }

    public Double getCotizarOferta() {
        return cotizarOferta;
    }

    public void setCotizarOferta(Double cotizarOferta) {
        this.cotizarOferta = cotizarOferta;
    }

    public String getDetalleOferta() {
        return detalleOferta;
    }

    public void setDetalleOferta(String detalleOferta) {
        this.detalleOferta = detalleOferta;
    }

    public Publicacion getPublicacion() {
        return publicacion;
    }

    public void setPublicacion(Publicacion publicacion) {
        this.publicacion = publicacion;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return "Oferta{" +
                "idOferta=" + idOferta +
                ", cotizarOferta=" + cotizarOferta +
                ", detalleOferta='" + detalleOferta + '\'' +
                ", publicacion=" + publicacion +
                ", usuario=" + usuario +
                '}';
    }
}
