package modelo.basico;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity //entidade
public class Usuario {

	@Id
	private Long id;
	
	private String nome;
	
	private String email;
	
	public Usuario() {
		
	}
	
	public Usuario(String nome, String email) {
		super();
		this.nome = nome;
		this.email = email;
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
}
