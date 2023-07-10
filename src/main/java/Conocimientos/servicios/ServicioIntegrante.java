
package Conocimientos.servicios;

import Conocimientos.entidades.Integrante;
import Conocimientos.repositorio.RepositorioIntegrante;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class ServicioIntegrante {
    
    @Autowired
    private RepositorioIntegrante repoIntegrante;
    
    
    @Transactional
    public void CrearIntegrante(String nombre, String apellido, Integer java, Integer baseDatos, Integer git, Integer docker){
        Integrante integrante = new Integrante(nombre, apellido, java, git, docker, baseDatos);
        repoIntegrante.save(integrante);
        
    }
    
}
