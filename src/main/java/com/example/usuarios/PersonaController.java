package com.example.usuarios;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class PersonaController {

    private PersonaService personaService;

    public PersonaController(){
        this.personaService = new PersonaService();
    }

    @GetMapping("/personas")
    public List<Persona> obtenerPersonas(){
        return this.personaService.obtenerPersonas();
    }

    @PostMapping("/personas")
    public Persona agregarPersona(@RequestBody Persona persona){
        return this.personaService.crearPersona(persona);
    }

    @GetMapping("personas/{cedula}")
    public Persona obtenerPersonaCedula(@PathVariable("cedula") String cedula){
        return this.personaService.obtenerPersonaCedula(cedula);
    }

    @GetMapping("/personas/")
    public List<Persona> obtenerPersonaPorCiudad(@RequestParam String ciudad){
        return this.personaService.obtenerPersonaPorCiudad(ciudad);
    }

}
