
package Conocimientos.servicios;

import Conocimientos.entidades.Integrante;
import Conocimientos.repositorio.RepositorioIntegrante;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;



@Service
public class ServicioIntegrante {
    
    @Autowired
    private RepositorioIntegrante repoIntegrante;
    
    
    @Transactional
    public void CrearIntegrante(Integrante integrante){       
        repoIntegrante.save(integrante);       
    }
    
    @Transactional
    public void BorrarIntegrante(Integer id){
        repoIntegrante.deleteById(id);
    }
    
    public void ModificarIntegrante(Integer id, Integrante actualizado){
        Optional<Integrante> opcion = repoIntegrante.findById(id);
        if(opcion.isPresent()){
            Integrante existente = opcion.get();
            existente.setApellido(actualizado.getApellido());
            existente.setNombre(actualizado.getNombre());
            existente.setJava(actualizado.getJava());
            existente.setBaseDatos(actualizado.getBaseDatos()));
            existente.setGit(actualizado.getGit());
            existente.setDocker(actualizado.getDocker());
            repoIntegrante.save(existente);
            
        }
        
         
       
    }
    
    public List<Integrante> listarIntegrantes(){
        return repoIntegrante.findAll();
    }
    
    
    
    
    
    
    private Integrante BuscarIntegrante(Integer id){
        Optional<Integrante> optionalInte = repoIntegrante.findById(id);
        if(optionalInte.isPresent()){
            Integrante integrante = optionalInte.get();
            return integrante;
        }
        else{
            return null;
        }
    }
    
}
