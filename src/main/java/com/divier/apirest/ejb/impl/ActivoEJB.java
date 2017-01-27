package com.divier.apirest.ejb.impl;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.divier.apirest.dto.ActivoDTO;
import com.divier.apirest.dto.ColorDTO;
import com.divier.apirest.ejb.interfaces.ILActivo;
import com.divier.apirest.ejb.interfaces.IRActivo;
import com.divier.apirest.entity.Color;

@Stateless(name = "ActivoEJB")
@LocalBean
public class ActivoEJB implements IRActivo, ILActivo {

    @PersistenceContext(unitName = "activos")
    EntityManager em;

    public ActivoDTO getAllActivos() {
        return null;
    }

    public ColorDTO getAllColores() {
        ColorDTO color = new ColorDTO();
        em.find(Color.class, 1);
        return color;
    }
}