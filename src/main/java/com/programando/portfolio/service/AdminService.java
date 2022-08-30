
package com.programando.portfolio.service;

import com.programando.portfolio.model.Administrador;
import com.programando.portfolio.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author crisl
 */
@Service
@Transactional
public class AdminService {
    
    private final AdminRepository aRepo;
    
    
    @Autowired
    public AdminService (AdminRepository aRepo){
        this.aRepo= aRepo;
    } 
    

    
    public void crearAdministrador(Administrador admin) {
        
        aRepo.save(admin);
    }

    
    public void borrarAdministrador(Long id) {
        
        aRepo.deleteById(id);
    }

    
    public Administrador buscarAdministrador(Long id) {
        
        Administrador admin= aRepo.findById(id).orElse(null);
        return admin;
    }
    
    
    
}
