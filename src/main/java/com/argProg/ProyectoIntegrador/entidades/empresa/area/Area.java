package com.argProg.ProyectoIntegrador.entidades.empresa.area;

import com.argProg.ProyectoIntegrador.entidades.cliente.Cliente;

import java.util.List;

public abstract class Area {
    private List<Cliente> clientes;

    public abstract void agregar();
    public abstract void modificar();
    public abstract void eliminar();

}
