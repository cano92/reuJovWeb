package dao.impl;

import org.springframework.stereotype.Repository;

import dao.IUsuarioDAO;
import entities.Usuario;

@Repository
public class UsuarioDAOImpl  extends GenericDAOImpl<Usuario> implements IUsuarioDAO    {

	//el construcctor debe ir sin argumentos para que spring lo maneje
	public UsuarioDAOImpl() {
		//super(persistentClass);
		super(Usuario.class);
		// TODO Auto-generated constructor stub
	}

	//se implementa la interface IUsuarioDAO  (incluye las interface basica)
	//y se hereda la implementacion basica de la interface basica 
	//todo lo que no es la implementacion de genericDAO se debe implementar
	

}
