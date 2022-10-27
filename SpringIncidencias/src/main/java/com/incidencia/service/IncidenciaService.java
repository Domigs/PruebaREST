package com.incidencia.service;

import java.util.Optional;
import com.incidencia.modelo.Incidencia;
import java.util.List;

public interface IncidenciaService {
	
	public List<Incidencia>listIncidencia();
	public Optional<Incidencia> getIncidenciaById(int id);
	public int save (Incidencia incidencia);
	public void delete (int id);

}
