package com.argProg.ProyectoIntegrador.entidades.empresa;

import com.argProg.ProyectoIntegrador.enums.SistemaOperativo;
import com.argProg.ProyectoIntegrador.enums.TipoAplicaciones;

public class Problema {
    private String descripcion;
    private String TipoProblema;

    public Problema(String descripcion, String tipoProblema) {
        this.descripcion = descripcion;
        //agregar bien el valor del enum que corresponda
        if (tipoProblema.equals(SistemaOperativo.valueOf(SistemaOperativo.class.getName()))){
            this.TipoProblema =SistemaOperativo.values().toString();
        }else {
            this.TipoProblema = String.valueOf(TipoAplicaciones.valueOf(SistemaOperativo.class.getName()));
        }

    }
}
