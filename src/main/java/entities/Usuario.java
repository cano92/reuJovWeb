package entities;

import java.util.Date;
//colleccion sin repetidos
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Usuario {
	
	@Id @GeneratedValue
	//@Column(name="usuario_ID")
	long id;
	
	String user;
	String pass;
	//Icon pequeño para header para enviar menos peso
	String imgUrl;
	
	String nombre;
	String apellido;
	//edad se calcula
	
	String email;
	int cel;
	
	int dni;
	String sexo;//M  F
	Date fechaNacimiento;
	
	//Datos Adicionales
	//padre contacto, madre contacto
	
	/*collecciones  HashSet (mapa) TreeSet (arbol enlaz) */
	@OneToMany()
	private Set<Rol>roles;
	@OneToMany()
	private Set<Usuario> discipulos;
	
	
	public Usuario() {
		// TODO Auto-generated constructor stub
	}
	
	

	public void setId(long id) {
		this.id = id;
	}



	public long getId() {
		return id;
	}


	public String getUser() {
		return user;
	}


	public void setUser(String user) {
		this.user = user;
	}


	public String getPass() {
		return pass;
	}


	public void setPass(String pass) {
		this.pass = pass;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public int getCel() {
		return cel;
	}


	public void setCel(int cel) {
		this.cel = cel;
	}


	public int getDni() {
		return dni;
	}


	public void setDni(int dni) {
		this.dni = dni;
	}


	public String getSexo() {
		return sexo;
	}


	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}


	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}


	public Set<Rol> getRoles() {
		return roles;
	}


	public void setRoles(Set<Rol> roles) {
		this.roles = roles;
	}


	public Set<Usuario> getDiscipulos() {
		return discipulos;
	}

	public void setDiscipulos(Set<Usuario> discipulos) {
		this.discipulos = discipulos;
	}
	

}
