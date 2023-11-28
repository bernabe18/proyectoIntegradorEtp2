package com.argProg.ProyectoIntegrador.entidades.empresa;

import com.argProg.ProyectoIntegrador.enums.IncidenteEstado;

import java.util.Date;

public class Incidente {
    private Date fechaIngreso;
    private Date fechaResolucion;
    private Problema problema;
    private IncidenteEstado incidenteEstado;
    private boolean esCmplejo;

    public Incidente(Date fechaIngreso, Problema problema, IncidenteEstado incidenteEstado, boolean esCmplejo) {
        this.fechaIngreso = fechaIngreso;
        this.problema = problema;
        this.incidenteEstado = incidenteEstado;
        this.esCmplejo = esCmplejo;
    }
}
