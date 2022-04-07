
package com.tienda.service;

import com.tienda.entity.Persona;
import com.tienda.repository.PersonaRepository;
import java.util.List;
import com.tienda.repository.PersonaRepository;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;


/**
 *
 * @author jose
 */

@Service
public class PersonaService implements IPersonaService {
    
    @Autowired
    private PersonaRepository personaRepository;

    @Override
    public List<Persona> getAllPerson() {
        return (List<Persona>)personaRepository.findAll();
    }

    @Override
    public void savePerson(Persona persona) {
        personaRepository.save(persona);
    }

    @Override
    public Persona getPersonByID(long id) {
        return personaRepository.findById(id).orElse(null);
    }

    @Override
    public void delete(long id) {
        personaRepository.deleteById(id);
    }

    @Override
    public Persona findByNombre(String nombre){
        return personaRepository.findByNombre(nombre);
    }
}
