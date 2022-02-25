
package com.tienda.controller;

import com.tienda.entity.Persona;
import com.tienda.service.IPersonaService;
import com.tienda.service.PersonaService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author jose
 */
@Controller
public class LoginController {
    
    @GetMapping({"/","perro"})
    public String index(){
        return "login";
    }
    
    @GetMapping ("/nuevoCliente")
    public String nuevoCliente(Persona persona){
        return "savePerson";
    }
    
    @PostMapping ("/guardarCliente")
    public String guardarCliente (Persona persona){
        IPersonaService.savePerson(Persona);
        return "redirect:/";
    }
    
    
}
