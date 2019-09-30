package modelo.dao;


import java.util.List;

import modelo.entidade.Departamento;

public interface DepartamentoDao {
	
	void insert(Departamento obj);
	void update(Departamento obj);
	void deletebyId(Integer id);
	Departamento findById(Integer Id);
	List<Departamento> findAll();

}
