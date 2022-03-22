
package com.tienda.controller;

import com.tienda.entity.Pais;
import com.tienda.entity.Persona;
import com.tienda.service.IPaisService;
import com.tienda.service.IPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *402470090
 * @author jose
 */

@Controller
public class PersonasController {
    
    @Autowired
    private IPersonaService personaService;
    @Autowired
    private IPaisService paisService;
    
    @GetMapping("/persona")
    public String index(Model model){
        List<Persona> listaPersonas=personaService.getAllPerson();
        model.addAttribute("titulo","Personas");
        model.addAttribute("personas", listaPersonas);
        return "personas";
    }
    
    @GetMapping("/personasN")
    public String crearPersona(Model model){
        List<Pais> listaPais = paisService.listCountry();
        model.addAttribute("persona", new Persona());
        model.addAttribute("pais", listaPais);
        return "modificarCliente";
    }
    
    @PostMapping("/save")
    public String guardarPersona(@ModelAttribute Persona persona){
        personaService.savePerson(persona);
        return "redirect:/persona";
    }
    
    @GetMapping("/delete/{id}")
    public String eliminarPersona(@PathVariable("id") Long idPersona){
        personaService.delete(idPersona);
        return "redirect:/persona";
    }
    
    @GetMapping("/editPersona/{id}")
    public String editPersona(@PathVariable("id") Long idPersona, Model model){
        Persona persona = personaService.getPersonByID(idPersona);
        List<Pais> listaPais = paisService.listCountry();
        model.addAttribute("persona", persona);
        model.addAttribute("pais", listaPais);
        return "modificarCliente";
    }
    
    
   
    
}
