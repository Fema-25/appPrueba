
package Conocimientos.controlador;

import Conocimientos.entidades.Integrante;
import Conocimientos.servicios.ServicioIntegrante;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;



@Controller
@RequestMapping("/app")
public class ControladorIntegrante {
    
    @Autowired
    private ServicioIntegrante servIntegrante;
    
    
    @GetMapping("/lista")
    public String lista(Model modelo){
        List<Integrante> listaIntegrantes = servIntegrante.listarIntegrantes();
        modelo.addAttribute("lista", listaIntegrantes);
        return "index.html";
                
    }
    
    
    @PostMapping("/crearIntegrante")
    public String crearIntegrante(@RequestBody Integrante integrante){
        servIntegrante.CrearIntegrante(integrante);
        return "redirect:/app/lista";
    }
    
    @DeleteMapping("/borrarIntegrante/{id}")
    public String borrarIntegrante(@PathVariable("id") Integer id){
        servIntegrante.BorrarIntegrante(id);
        return "redirect:/app/lista";
    }
    
    @PutMapping("/actualizarIntegrante/{id}")
    public String actualizarIntegrante(@PathVariable("id") Integer id, @RequestBody Integrante integrante){
        
       servIntegrante.ModificarIntegrante(id, integrante);        
       return "redirect:/app/lista";
      
    }
}
