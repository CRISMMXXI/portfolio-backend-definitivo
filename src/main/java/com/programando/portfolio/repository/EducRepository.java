
package com.programando.portfolio.repository;

import com.programando.portfolio.model.Educacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author crisl
 */
@Repository
public interface EducRepository extends JpaRepository <Educacion, Long> {
    
}
