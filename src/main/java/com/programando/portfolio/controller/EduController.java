
package com.programando.portfolio.controller;

import com.programando.portfolio.model.Educacion;
import com.programando.portfolio.service.EducService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author crisl
*/
@RestController
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("/api/educacion")
public class EduController {
    
    private final EducService educacion;
    
    
    @Autowired
    public EduController (EducService educacion) {
        this.educacion= educacion;
    }


    
    
    @PostMapping("/crear")
    public void createEduc(@RequestBody Educacion educ){
        educacion.crearEducacion(educ);
    }
    
    
    @PutMapping("/editar/{idEdu}")
    public void editEduc(@PathVariable Long idEdu,
                         @RequestBody Educacion educ){
        Educacion edu= educacion.buscarEducacion(idEdu);
        
        edu.setNombre(educ.getNombre());
        edu.setTitulo(educ.getTitulo());
        edu.setDescripcion(educ.getDescripcion());
        edu.setFechaTermino(educ.getFechaTermino());
        edu.setFoto(educ.getFoto());
        
        educacion.crearEducacion(edu);
        
    }
                              
    @DeleteMapping("/eliminar/{idEdu}")
    public void deleteEduc(@PathVariable Long idEdu){
        educacion.borrarEducacion(idEdu);
    }
    
    @GetMapping("/ver")
    @ResponseBody
    public List<Educacion> viewEduc() {
        return educacion.verEducacion();
    }
}
