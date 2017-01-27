package com.divier.apirest.entity;

import java.io.Serializable;

//@Entity
//@Table(name = "activo")
public class Activo implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    // @Id
    // @GeneratedValue(strategy = GenerationType.IDENTITY)
    // @Column(name = "id_activo")
    private Integer id;

    // @Column(name = "nombre")
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