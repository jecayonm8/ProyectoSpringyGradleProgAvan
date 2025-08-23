package co.edu.uniquindio.application;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hola")
    public String hola() { return "¡Listo, Spring Boot + Gradle!"; }
}
