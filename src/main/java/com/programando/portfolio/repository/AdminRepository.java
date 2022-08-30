
package com.programando.portfolio.repository;

import com.programando.portfolio.model.Administrador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author crisl
 */
@Repository
public interface AdminRepository extends JpaRepository <Administrador, Long> {
    
}
