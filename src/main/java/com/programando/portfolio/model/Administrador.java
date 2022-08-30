
package com.programando.portfolio.model;


import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author crisl
 */
@Entity
public class Administrador implements Serializable {
    
    
    //atributos
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long Id;
    
    private String nombre;
    private String apellido;
    private String certificado;
    private String descripcion;
    private String foto;
    private String fotoBannerA;
    private String fotoBannerB;
    private String fotoBannerC;
    
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "idEdu")
    private List <Educacion> listaEducacion;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "idPro")
    private List <Proyecto> listaProyecto;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "idHab")
    private List <Habilidad> listaHabilidad;

    
    //constructores
    public Administrador() {
    }

    public Administrador(Long Id, String nombre, String apellido, String certificado, String descripcion, String foto, String fotoBannerA, String fotoBannerB, String fotoBannerC) {
        this.Id = Id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.certificado = certificado;
        this.descripcion = descripcion;
        this.foto = foto;
        this.fotoBannerA = fotoBannerA;
        this.fotoBannerB = fotoBannerB;
        this.fotoBannerC = fotoBannerC;
    }
    
    
    //Getters and Setters
    public Long getId () {
        return Id;
    };

    public void setId(Long Id) {
        this.Id = Id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCertificado() {
        return certificado;
    }

    public void setCertificado(String certificado) {
        this.certificado = certificado;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getFotoBannerA() {
        return fotoBannerA;
    }

    public void setFotoBannerA(String fotoBannerA) {
        this.fotoBannerA = fotoBannerA;
    }

    public String getFotoBannerB() {
        return fotoBannerB;
    }

    public void setFotoBannerB(String fotoBannerB) {
        this.fotoBannerB = fotoBannerB;
    }

    public String getFotoBannerC() {
        return fotoBannerC;
    }

    public void setFotoBannerC(String fotoBannerC) {    
        this.fotoBannerC = fotoBannerC;
    }
    

 
    
}
