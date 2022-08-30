
package com.programando.portfolio.service;

import com.programando.portfolio.model.Proyecto;
import java.util.List;

/**
 *
 * @author crisl
 */
public interface IProService {
    
    
    public void crearProyecto(Proyecto pro);
    
    public void borrarProyecto(Long idPro);
    
    public Proyecto buscarProyecto(Long idPro);
    
    public List<Proyecto> verProyecto();
    
    
}
