
package com.tienda.service;

import com.tienda.entity.Persona;
import java.util.List;

/**
 *
 * @author jose
 */


public interface IPersonaService {
    public List<Persona> getAllPerson();
    public void savePerson(Persona persona);
    public Persona getPersonByID(long id);
    public void delete(long id);
    
}
