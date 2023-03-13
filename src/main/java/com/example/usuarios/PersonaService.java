package com.example.usuarios;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PersonaService {
    private List<Persona> personas;

    public PersonaService() {
        this.personas = new ArrayList<>();
    }

    public List<Persona> obtenerPersonas(){
        return this.personas;
    }

    public Persona crearPersona(Persona persona){
        this.personas.add(persona);
        return persona;
    }

    public Persona obtenerPersonaCedula(String cedula){
        return this.personas
                .stream()
                .filter(persona -> persona.getCedula().equals(cedula))
                .findFirst().get();
    }

    public List<Persona> obtenerPersonaPorCiudad(String ciudad) {
        return this.personas.stream()
                .filter(persona -> persona.getCiudad()
                        .equals(ciudad)).collect(Collectors.toList());
    }
}
