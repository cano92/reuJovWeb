package entities;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Rol {


	@Id @GeneratedValue
	long id;
	
	String rol;
	
	@OneToMany
	private Set<Permiso> permisos;
	
	public Rol() {
		// TODO Auto-generated constructor stub
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public Set<Permiso> getPermisos() {
		return permisos;
	}


	public void setPermisos(Set<Permiso> permisos) {
		this.permisos = permisos;
	}


	public String getRol() {
		return rol;
	}


	public void setRol(String rol) {
		this.rol = rol;
	}
	
	
	

}
