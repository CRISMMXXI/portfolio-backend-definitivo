
package com.programando.portfolio.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author crisl
 */
@Getter @Setter
@Entity
public class Habilidad {
    

    //atributos
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idHab;
    
    private String nombre;
    private String foto;

    
    //constructores    
    public Habilidad() {
    }

    public Habilidad(Long idHab, String nombre, String foto) {
        this.idHab = idHab;
        this.nombre = nombre;
        this. foto = foto;
    }



    
    
}
