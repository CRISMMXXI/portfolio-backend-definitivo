
package com.programando.portfolio.repository;

import com.programando.portfolio.model.Usuario;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author crisl
 */
public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{
    
    
    Optional<Usuario> findByEmail(String email);
    
}
