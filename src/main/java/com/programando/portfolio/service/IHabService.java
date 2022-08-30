
package com.programando.portfolio.service;

import com.programando.portfolio.model.Habilidad;
import java.util.List;

/**
 *
 * @author crisl
 */
public interface IHabService {
    
    
    public void crearHabilidad(Habilidad hab);
    
    public void borrarHabilidad(Long idHab);
    
    public Habilidad buscarHabilidad(Long idHab);
    
    public List<Habilidad> verHabilidad();
    
    
}
