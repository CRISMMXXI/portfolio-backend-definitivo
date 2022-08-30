
package com.programando.portfolio.repository;

import com.programando.portfolio.model.Proyecto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author crisl
 */
@Repository
public interface ProRepository extends JpaRepository<Proyecto, Long> {
    
}
