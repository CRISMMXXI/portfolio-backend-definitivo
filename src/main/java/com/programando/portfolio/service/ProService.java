
package com.programando.portfolio.service;

import com.programando.portfolio.model.Proyecto;
import com.programando.portfolio.repository.ProRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author crisl
 */
@Service
public class ProService implements IProService {
    
    
    @Autowired
    private ProRepository pRepository;
    

    @Override
    public void crearProyecto(Proyecto pro) {
        
        pRepository.save(pro);
    }

    @Override
    public void borrarProyecto(Long idPro) {
        
        pRepository.deleteById(idPro);
    }

    @Override
    public Proyecto buscarProyecto(Long idPro) {
        
        Proyecto proyec= pRepository.findById(idPro).orElse(null);
        return proyec;
    }

    @Override
    public List<Proyecto> verProyecto() {
        
        List<Proyecto> lProyec= pRepository.findAll();
        return lProyec;
    }

    
}
