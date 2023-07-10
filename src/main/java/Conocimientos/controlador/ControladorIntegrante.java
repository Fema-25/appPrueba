
package Conocimientos.controlador;

import Conocimientos.servicios.ServicioIntegrante;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/app")
public class ControladorIntegrante {
    @Autowired
    private ServicioIntegrante servIntegrante;
    
    @PostMapping("/crearPaciente")
    public String crearPaciente(String nombre,  String apellido, Integer java,  Integer baseDatos,  Integer git,  Integer docker){
        servIntegrante.CrearIntegrante(nombre, apellido, java, baseDatos, git, docker);
        return "prueba";
    }
}
