package application;

import java.awt.List;
import java.util.Date;

import modelo.dao.DaoFactory;
import modelo.dao.VendedorDao;
import modelo.entidade.Departamento;
import modelo.entidade.Vendedor;

public class Program {

	public static void main(String[] args) {

		//Departamento obj = new Departamento(1, "books");
		//Vendedor vendedor = new Vendedor(21, "bob", "bob@gmail.com", new Date(), 3000.0, obj);
		
		VendedorDao vendedorDao = DaoFactory.createVendedorDao();
		
		System.out.println("=== Teste 1: Vendedor EncontradoPorId ===");
		Vendedor vendedor = VendedorDao.findById(3);
		System.out.println(vendedor);
		
		System.out.println("\n=== Teste 2: Vendedor EncontradoPorDepartamento ===");
		Departamento departamento = new Departamento(2, null);
		List<Vendedor> list = vendedorDao.findByDepartamento(departamento);
		for (Vendedor obj :list) {
			System.out.println(obj); 
		}
        
		System.out.println("\n=== Teste 2: Vendedor EncontradoPorTudo ===");
		List<Vendedor> list = vendedorDao.findAll();
		for (Vendedor obj :list) {
			System.out.println(obj);  
		}

		System.out.println("\n=== Teste 4: Vendedor Inserindo ===");
	    Vendedor newVendedor = new Vendedor(null, "joao", "joao@gmail.com",new Date(),4500.0,departamento);
	    vendedorDao.insert(newVendedor);
		System.out.println("Inseriu");  
		
	    
	
	    System.out.println("\n=== Teste 5: Vendedor atualizando ===");
	    vendedor = vendedorDao.findById(1);
	    vendedor.setNome("Maria");
	    vendedorDao.update(vendedor);
	    System.out.println("Atualização completa");
	    
	    

 
} 
