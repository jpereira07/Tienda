
package com.tienda.repository;

import com.tienda.entity.Persona;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author jose
 */

@Repository
public interface PersonaRepository extends CrudRepository<Persona,Long> {
    
    
    
}
