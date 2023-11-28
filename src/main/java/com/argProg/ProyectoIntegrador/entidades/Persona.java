package com.argProg.ProyectoIntegrador.entidades;

public abstract class Persona {
    private String nombre;
    private String cuit;
    private String razonSocial;

    public Persona(String nombre, String cuit, String razonSocial) {
        this.nombre = nombre;
        this.cuit = cuit;
        this.razonSocial = razonSocial;
    }
}
