package application;

import java.util.Date;

import modelo.entidade.Departamento;
import modelo.entidade.Vendedor;

public class Program {

	public static void main(String[] args) {

		Departamento obj = new Departamento(1, "books");
		Vendedor vendedor = new Vendedor(21, "bob", "bob@gmail.com", new Date(), 3000.0, obj);
		System.out.println(vendedor);

	}	
 
}
