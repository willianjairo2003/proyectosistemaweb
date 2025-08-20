package com.example.demoproyecto;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ControlPaginas {

    // Página de login
    @GetMapping("/login")
    public String login() {
        return "login"; 
    }

    // Página de registro
    @GetMapping("/registro")
    public String registro() {
        return "registro"; 
    }

    
    @PostMapping("/procesarLogin")
    public String procesarLogin() {
        return "principal"; 
    }

    
    @PostMapping("/procesarRegistro")
    public String procesarRegistro() {
        return "principal"; 
    }

}
