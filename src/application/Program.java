package application;

import java.util.Date;

import modelo.dao.DaoFactory;
import modelo.dao.VendedorDao;
import modelo.entidade.Departamento;
import modelo.entidade.Vendedor;

public class Program {

	public static void main(String[] args) {

		Departamento obj = new Departamento(1, "books");
		Vendedor vendedor = new Vendedor(21, "bob", "bob@gmail.com", new Date(), 3000.0, obj);
		
		VendedorDao vendedorDao = DaoFactory.createVendedorDao();
		
		System.out.println(vendedor);

	}	
 
}
