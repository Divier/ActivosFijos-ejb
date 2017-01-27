package com.divier.apirest.dto;

import java.io.Serializable;

public class ActivoDTO implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    private Integer id;
    private String nombre;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}