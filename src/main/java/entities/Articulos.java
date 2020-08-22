package entities;

import java.util.LinkedList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Articulos {
	
	@Id @GeneratedValue
	long id;
	
	String titulo;
	String encabezado;
	String descripcion;
	
	//es una lista de los nombres de las imagenes del articulo
	//la hubicacion fija de las imagenes estan img/articulos/
	LinkedList<String> imagenes;
	
	public Articulos() {
		// TODO Auto-generated constructor stub
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getEncabezado() {
		return encabezado;
	}

	public void setEncabezado(String encabezado) {
		this.encabezado = encabezado;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public LinkedList<String> getImagenes() {
		return imagenes;
	}

	public void setImagenes(LinkedList<String> imagenes) {
		this.imagenes = imagenes;
	}

	
}
