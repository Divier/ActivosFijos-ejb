package com.divier.apirest.ejb.interfaces;

import javax.ejb.Local;

import com.divier.apirest.dto.ActivoDTO;
import com.divier.apirest.dto.ColorDTO;

@Local
public interface ILActivo {

    /**
     * @see IRActivo#getAllActivos()
     */
    public ActivoDTO getAllActivos();

    /**
     * @see IRActivo#getAllColores()
     */
    public ColorDTO getAllColores();
}