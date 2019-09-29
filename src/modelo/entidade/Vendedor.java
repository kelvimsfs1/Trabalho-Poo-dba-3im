package modelo.entidade;

import java.io.Serializable;
import java.util.Date;

public class Vendedor implements Serializable {

	private static final long serialVersionUID = 1L;
	private Integer id;
	private String Nome;
	private String email;
	private Date Aniversario;
	private Double SalarioBase;
	
    private Departamento departamento;
    
    public  Vendedor() {
    	
    }

	public Vendedor(Integer id, String nome, String email, Date aniversario, Double salarioBase,
			Departamento departamento) {
		this.id = id;
		Nome = nome;
		this.email = email;
		Aniversario = aniversario;
		SalarioBase = salarioBase;
		this.departamento = departamento;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getAniversario() {
		return Aniversario;
	}

	public void setAniversario(Date aniversario) {
		Aniversario = aniversario;
	}

	public Double getSalarioBase() {
		return SalarioBase;
	}

	public void setSalarioBase(Double salarioBase) {
		SalarioBase = salarioBase;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vendedor other = (Vendedor) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Vendedor [id=" + id + ", Nome=" + Nome + ", email=" + email + ", Aniversario=" + Aniversario
				+ ", SalarioBase=" + SalarioBase + ", departamento=" + departamento + "]";
	}
    
}
