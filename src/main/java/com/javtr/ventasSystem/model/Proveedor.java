package com.javtr.ventasSystem.model;

import javax.persistence.*;

@Entity
public class Proveedor {

    @Id
    private Integer nif;
    private String nombre;
    private String direccion;

    public Proveedor() {
    }

    public Integer getNif() {
        return nif;
    }

    public void setNif(Integer nif) {
        this.nif = nif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }


    @Override
    public String toString() {
        return "Proveedor{" +
                "nif=" + nif +
                ", nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}
