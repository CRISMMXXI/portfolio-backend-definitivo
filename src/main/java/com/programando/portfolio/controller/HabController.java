
package com.programando.portfolio.controller;

import com.programando.portfolio.model.Habilidad;
import com.programando.portfolio.service.IHabService;
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
@RequestMapping("/api/habilidad")
public class HabController {
    
    
    @Autowired
    private IHabService habilidad;

    
    
    @PostMapping("/crear")
    public void createHab(@RequestBody Habilidad hab){
        habilidad.crearHabilidad(hab);
    }
    
    @PutMapping("/editar/{idHab}")
    public void editHab(@PathVariable Long idHab,
                        @RequestBody Habilidad hab){
        Habilidad habi= habilidad.buscarHabilidad(idHab);
        
        habi.setNombre(hab.getNombre());
        habi.setFoto(hab.getFoto());
        
        habilidad.crearHabilidad(habi);
    }
    
    @DeleteMapping("/eliminar/{idHab}")
    public void deleteHab(@PathVariable Long idHab){
        habilidad.borrarHabilidad(idHab);
    }
    
    @GetMapping("/ver")
    @ResponseBody
    public List<Habilidad> viewHab(){
        return habilidad.verHabilidad();
    }
    
    
}
