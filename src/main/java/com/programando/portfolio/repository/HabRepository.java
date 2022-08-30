
package com.programando.portfolio.repository;

import com.programando.portfolio.model.Habilidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author crisl
 */
@Repository
public interface HabRepository extends JpaRepository<Habilidad, Long> {
    
}
