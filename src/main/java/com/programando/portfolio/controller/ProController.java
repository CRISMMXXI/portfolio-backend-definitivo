
package com.programando.portfolio.controller;

import com.programando.portfolio.model.Proyecto;
import com.programando.portfolio.service.IProService;
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
@RequestMapping("/api/proyecto")
public class ProController {
    
    
    @Autowired
    private IProService proyecto;

    
    
    @PostMapping("/crear")
    public void createPro(@RequestBody Proyecto pro){
        proyecto.crearProyecto(pro);
    }
    
    @PutMapping("/editar/{idPro}")
    public void editPro(@PathVariable Long idPro,
                        @RequestBody Proyecto pro) {
        
        Proyecto proyec= proyecto.buscarProyecto(idPro);
        
        proyec.setNombre(pro.getNombre());
        proyec.setDescripcion(pro.getDescripcion());
        proyec.setFechaTermino(pro.getFechaTermino());
        proyec.setFoto(pro.getFoto());
        
        proyecto.crearProyecto(proyec);
    }
    
    @DeleteMapping("/eliminar/{idPro}")
    public void deletePro(@PathVariable Long idPro){
        proyecto.borrarProyecto(idPro);
    }
    
    @GetMapping("/ver")
    @ResponseBody
    public List<Proyecto> viewPro(){
        return proyecto.verProyecto();
    }
    
}
