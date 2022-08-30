
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
public class Proyecto {
    

    //atributos
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idPro;
    
    private String nombre;
    private String descripcion;
    
    @Temporal(TemporalType.DATE)
    private Date fechaTermino;
    
    private String foto;
    

    
    //constructores
    public Proyecto() {
    }

    public Proyecto(Long idPro, String nombre, String descripcion, Date fechaTermino, String foto) {
        this.idPro = idPro;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fechaTermino = fechaTermino;
        this.foto = foto;
    }



 

}
