
package com.programando.portfolio.model;


import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.Getter;
import lombok.Setter;
/**
 *
 * @author crisl
 */
@Getter @Setter
@Entity
public class Educacion {
    

    //atributos
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idEdu;
    
    private String nombre;
    private String titulo;
    private String descripcion;
    
    @Temporal(TemporalType.DATE)
    private Date fechaTermino;
    
    private String foto;
    


    //Constructores
    public Educacion() {
    }

    public Educacion(Long idEdu, String nombre, String titulo, String descripcion, Date fechaTermino, String foto) {
        this.idEdu = idEdu;
        this.nombre = nombre;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fechaTermino = fechaTermino;
        this.foto = foto;
    }


 

}
