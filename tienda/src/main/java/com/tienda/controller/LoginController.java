
package com.tienda.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

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
    
}
