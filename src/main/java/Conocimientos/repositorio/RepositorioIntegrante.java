
package Conocimientos.repositorio;

import Conocimientos.entidades.Integrante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioIntegrante extends JpaRepository<Integrante, Integer>{
    
}
