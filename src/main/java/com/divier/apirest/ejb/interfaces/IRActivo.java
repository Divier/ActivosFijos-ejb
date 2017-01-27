package com.divier.apirest.ejb.interfaces;

import javax.ejb.Remote;

import com.divier.apirest.dto.ActivoDTO;
import com.divier.apirest.dto.ColorDTO;

@Remote
public interface IRActivo {

    /**
     * Permite consultar todos los activos registrados en el sistema
     * 
     * @return
     */
    public ActivoDTO getAllActivos();

    /**
     * Permite consultar todos los colores registrados en el sistema
     * 
     * @return
     */
    public ColorDTO getAllColores();
}