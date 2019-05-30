package com.tecsup.cachuelitos_api.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "usuarios")
public class Usuario implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idusuarios")
    private Integer idUsuario;

    @Column(name = "id_firebase")
    private String idFirebase;

    @Column(name = "usu_nombre")
    private String nombreUsuario;

    @Column(name = "usu_telefono")
    private String telefonoUsuario;

    @Column(name = "usu_email")
    private String emailUsuario;

    @Column(name = "usu_estado")
    private Boolean estadoUsuario;

    @Column(name = "usu_disponibilidad")
    private Boolean disponibilidadUsuario;

    @Column(name = "usu_calificacion_emp")
    private Integer calificacionEmpleado;

    @Column(name = "usu_calificacion_clien")
    private Integer calificacionCliente;

    @Column(name = "usu_horarios")
    private String horariosUsuario;

    @ManyToOne
    private Distrito distrito;

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getIdFirebase() {
        return idFirebase;
    }

    public void setIdFirebase(String idFirebase) {
        this.idFirebase = idFirebase;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getTelefonoUsuario() {
        return telefonoUsuario;
    }

    public void setTelefonoUsuario(String telefonoUsuario) {
        this.telefonoUsuario = telefonoUsuario;
    }

    public String getEmailUsuario() {
        return emailUsuario;
    }

    public void setEmailUsuario(String emailUsuario) {
        this.emailUsuario = emailUsuario;
    }

    public Boolean getEstadoUsuario() {
        return estadoUsuario;
    }

    public void setEstadoUsuario(Boolean estadoUsuario) {
        this.estadoUsuario = estadoUsuario;
    }

    public Boolean getDisponibilidadUsuario() {
        return disponibilidadUsuario;
    }

    public void setDisponibilidadUsuario(Boolean disponibilidadUsuario) {
        this.disponibilidadUsuario = disponibilidadUsuario;
    }

    public Integer getCalificacionEmpleado() {
        return calificacionEmpleado;
    }

    public void setCalificacionEmpleado(Integer calificacionEmpleado) {
        this.calificacionEmpleado = calificacionEmpleado;
    }

    public Integer getCalificacionCliente() {
        return calificacionCliente;
    }

    public void setCalificacionCliente(Integer calificacionCliente) {
        this.calificacionCliente = calificacionCliente;
    }

    public String getHorariosUsuario() {
        return horariosUsuario;
    }

    public void setHorariosUsuario(String horariosUsuario) {
        this.horariosUsuario = horariosUsuario;
    }

    public Distrito getDistrito() {
        return distrito;
    }

    public void setDistrito(Distrito distrito) {
        this.distrito = distrito;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "idUsuario=" + idUsuario +
                ", idFirebase=" + idFirebase +
                ", nombreUsuario='" + nombreUsuario + '\'' +
                ", telefonoUsuario='" + telefonoUsuario + '\'' +
                ", emailUsuario='" + emailUsuario + '\'' +
                ", estadoUsuario=" + estadoUsuario +
                ", disponibilidadUsuario=" + disponibilidadUsuario +
                ", calificacionEmpleado=" + calificacionEmpleado +
                ", calificacionCliente=" + calificacionCliente +
                ", horariosUsuario='" + horariosUsuario + '\'' +
                ", distrito=" + distrito +
                '}';
    }
}
