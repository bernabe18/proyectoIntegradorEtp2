package com.argProg.ProyectoIntegrador.entidades.empresa;

import com.argProg.ProyectoIntegrador.enums.TipoEspecialidad;

public class Especialidad {
   private String nombre;
   private TipoEspecialidad tipoEspecialidad;

    public Especialidad(String nombre, TipoEspecialidad tipoEspecialidad) {
        this.nombre = nombre;
        this.tipoEspecialidad = tipoEspecialidad;
    }
}
