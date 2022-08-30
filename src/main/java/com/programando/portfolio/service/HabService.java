
package com.programando.portfolio.service;

import com.programando.portfolio.model.Habilidad;
import com.programando.portfolio.repository.HabRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author crisl
 */
@Service
public class HabService implements IHabService {
    
    
    @Autowired
    private HabRepository hRepository;
    

    @Override
    public void crearHabilidad(Habilidad hab) {
        
        hRepository.save(hab);
    }

    @Override
    public void borrarHabilidad(Long idHab) {
        
        hRepository.deleteById(idHab);
    }

    @Override
    public Habilidad buscarHabilidad(Long idHab) {
        
        Habilidad hab= hRepository.findById(idHab).orElse(null);
        return hab;
    }

    @Override
    public List<Habilidad> verHabilidad() {
        
        List<Habilidad> lHab= hRepository.findAll();
        return lHab;
    }

    
}
