
package com.programando.portfolio.service;

import com.programando.portfolio.model.Educacion;
import com.programando.portfolio.repository.EducRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author crisl
 */
@Service
@Transactional
public class EducService {
    
    private final EducRepository eRepository;
    
    
    @Autowired
    public EducService (EducRepository eRepository) {
        this.eRepository= eRepository;
    }
    

    
    public void crearEducacion(Educacion educ) {
        eRepository.save(educ);
    } 

    
    public void borrarEducacion(Long idEdu) {
        eRepository.deleteById(idEdu);
    }

    
    public Educacion buscarEducacion(Long idEdu) {
        
        Educacion educ= eRepository.findById(idEdu).orElse(null);
        return educ;
    }

    
    public List<Educacion> verEducacion() {
    
        List<Educacion> lEduc= eRepository.findAll();
        return lEduc;
    }
    
    
}
