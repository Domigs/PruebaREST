package com.incidencia.dao;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.incidencia.modelo.*;

@Repository
public interface IncidenciaDao extends CrudRepository <Incidencia,Serializable>{
 

}

