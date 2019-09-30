package modelo.dao;

import java.util.List;

import modelo.entidade.Vendedor;

public interface VendedorDao {
	

	void insert(Vendedor obj);
	void update(Vendedor obj);
	void deletebyId(Integer id);
	Vendedor findById(Integer Id);
	List<Vendedor> findAll();

}
