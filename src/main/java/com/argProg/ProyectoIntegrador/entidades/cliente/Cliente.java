package com.argProg.ProyectoIntegrador.entidades.cliente;

import com.argProg.ProyectoIntegrador.entidades.Persona;
import com.argProg.ProyectoIntegrador.entidades.empresa.Servicio;


import java.util.List;

public class Cliente extends Persona {
    private List<Servicio> servicios;

    public Cliente(String nombre, String cuit, String razonSocial) {
        super(nombre, cuit, razonSocial);
    }

    public void reportarIncidente(){

    }
}
