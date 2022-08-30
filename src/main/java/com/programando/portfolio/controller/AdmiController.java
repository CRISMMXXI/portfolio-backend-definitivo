
package com.programando.portfolio.controller;

import com.programando.portfolio.model.Administrador;
import com.programando.portfolio.service.AdminService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author crisl
 */
@RestController
@CrossOrigin(origins= "http://localhost:4200")
@RequestMapping("/api/administrador")
public class AdmiController {
    
    private final AdminService administrador;
    
    
    
    public AdmiController (AdminService administrador) {
        this.administrador= administrador;
    }
    
    
    @GetMapping("/id/{id}")
    public ResponseEntity<Administrador> obtenerAdministrador(@PathVariable("id") Long id){
        Administrador admin = administrador.buscarAdministrador(id);
        return new ResponseEntity<>(admin, HttpStatus.OK);
    }
    
    @PutMapping("/editar/{id}")
    public void editarAdministrador(@PathVariable Long id,
                                    @RequestBody Administrador admin) {
        Administrador admi= administrador.buscarAdministrador(id);
        
        admi.setNombre(admin.getNombre());
        admi.setApellido(admin.getApellido());
        admi.setCertificado(admin.getCertificado());
        admi.setDescripcion(admin.getDescripcion());
        admi.setFoto(admin.getFoto());
        admi.setFotoBannerA(admin.getFotoBannerA());
        admi.setFotoBannerB(admin.getFotoBannerB());
        admi.setFotoBannerC(admin.getFotoBannerC());
        
        administrador.crearAdministrador(admi);
    }
    
    
}
