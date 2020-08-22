package entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Programa {

	@Id @GeneratedValue
	long id;
	
	long director1ID;
	long director2ID;
	
	long anuncioID;
	long ofrendaID;
	
	long juegos1ID;
	long juegos2ID;
	
	long palabraMayoresID;
	long palabraMenoresID;
	
	long programaEstadoID;
	String comentario;
	
	public Programa() {
		// TODO Auto-generated constructor stub
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getDirector1ID() {
		return director1ID;
	}

	public void setDirector1ID(long director1id) {
		director1ID = director1id;
	}

	public long getDirector2ID() {
		return director2ID;
	}

	public void setDirector2ID(long director2id) {
		director2ID = director2id;
	}

	public long getAnuncioID() {
		return anuncioID;
	}

	public void setAnuncioID(long anuncioID) {
		this.anuncioID = anuncioID;
	}

	public long getOfrendaID() {
		return ofrendaID;
	}

	public void setOfrendaID(long ofrendaID) {
		this.ofrendaID = ofrendaID;
	}

	public long getJuegos1ID() {
		return juegos1ID;
	}

	public void setJuegos1ID(long juegos1id) {
		juegos1ID = juegos1id;
	}

	public long getJuegos2ID() {
		return juegos2ID;
	}

	public void setJuegos2ID(long juegos2id) {
		juegos2ID = juegos2id;
	}

	public long getPalabraMayoresID() {
		return palabraMayoresID;
	}

	public void setPalabraMayoresID(long palabraMayoresID) {
		this.palabraMayoresID = palabraMayoresID;
	}

	public long getPalabraMenoresID() {
		return palabraMenoresID;
	}

	public void setPalabraMenoresID(long palabraMenoresID) {
		this.palabraMenoresID = palabraMenoresID;
	}

	public long getProgramaEstadoID() {
		return programaEstadoID;
	}

	public void setProgramaEstadoID(long programaEstadoID) {
		this.programaEstadoID = programaEstadoID;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	
	
	
}
