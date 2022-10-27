package com.incidencia.service;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.incidencia.dao.IncidenciaDao;
import com.incidencia.modelo.Incidencia;

@Service
public class IncidenciaServiceImpl implements IncidenciaDao {
	
	@Autowired
	private IncidenciaDao dao;
	
	@Override
	public List<Incidencia> listIncidencia() {
		return (List<Incidencia>) dao.findAll();
	}

	@Override
	public Optional<Incidencia> getIncidenciaById(int id) {
		return dao.findById(id);
	}

	@Override
	public int save(Incidencia incidencia) {
		int result = 0;
		Incidencia p = dao.save(incidencia);
		if (!p.equals(null)) {
			result = 1;
		}
		return result;
	}

	@Override
	public void delete(int id) {
		dao.deleteById(id);

	}
	

}
