
package Conocimientos.servicios;

import Conocimientos.builders.IntegrantesBuilder;
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
        IntegrantesBuilder build = new IntegrantesBuilder(integrante);
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
            existente.setBaseDatos(actualizado.getBaseDatos());
            existente.setGit(actualizado.getGit());
            existente.setDocker(actualizado.getDocker());
            repoIntegrante.save(existente);
            
        }
    }
   
       
    public void modificarDatos(Integer id, String nombre,String apellido,Integer java,Integer git,Integer docker,Integer baseDatos){
        
        IntegrantesBuilder build = new IntegrantesBuilder();
        Integrante actualizado = build.setNombre(nombre)
                                    .setApellido(apellido)
                                    .setBaseDatos(baseDatos)
                                    .setDocker(docker)
                                    .setGit(git)
                                    .setJava(java)
                                    .build();
        
        Optional<Integrante> opcion = repoIntegrante.findById(id);
        if(opcion.isPresent()){
            
            repoIntegrante.save(asignadorValor(opcion.get(), actualizado));
        }
        
            
    }
    private Integrante asignadorValor(Integrante viejo, Integrante nuevo){
        if(nuevo.getNombre() != null){
            viejo.setNombre(nuevo.getNombre());
        }
        if(nuevo.getApellido() != null){
            viejo.setApellido(nuevo.getApellido());
        }
        if(nuevo.getBaseDatos() != null){
            viejo.setBaseDatos(nuevo.getBaseDatos());
        }
        if(nuevo.getDocker() != null){
            viejo.setDocker(nuevo.getDocker());
        }
        if(nuevo.getGit() != null){
            viejo.setGit(nuevo.getGit());
        }
        if(nuevo.getJava()!= null){
            viejo.setJava(nuevo.getJava());
        }
        return viejo;
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
