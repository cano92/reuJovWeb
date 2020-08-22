package utils.mapper;

import org.springframework.stereotype.Component;

import entities.Usuario;
import utils.dto.UserDTO;;

@Component
public class UserMapper {
	
	/*  mapping class DTO Objetcs  Usuario */
	
	public UserMapper() {
		// TODO Auto-generated constructor stub
	}
	
	public UserDTO mappingToDTO(Usuario user) {
		UserDTO userDTO = new UserDTO();
		
		userDTO.setId( user.getId() );
		
		userDTO.setUser( user.getUser() );
		userDTO.setPass( user.getPass() );
		
		userDTO.setImgUrl( user.getImgUrl() );
		
		userDTO.setNombre( user.getNombre() );
		userDTO.setApellido( user.getApellido() );
		
		userDTO.setEmail( user.getEmail() );
		userDTO.setCel( user.getCel() );
		
		userDTO.setDni( user.getDni() );
		userDTO.setSexo( user.getSexo() );
		userDTO.setFechaNacimiento( user.getFechaNacimiento() );
		
		//falta collecciones
		
		return userDTO;
	}
	
	public Usuario mappingToUsuario(UserDTO user) {
		Usuario usuario=new Usuario();
		
		usuario.setId( user.getId() );
		
		usuario.setUser( user.getUser() );
		usuario.setPass( user.getPass() );
		
		usuario.setImgUrl( user.getImgUrl() );
		
		usuario.setNombre( user.getNombre() );
		usuario.setApellido( user.getApellido() );
		
		usuario.setEmail( user.getEmail() );
		usuario.setCel( user.getCel() );
		
		usuario.setDni( user.getDni() );
		usuario.setSexo( user.getSexo() );
		usuario.setFechaNacimiento( user.getFechaNacimiento() );
		
		//falta collecciones
		
		return usuario;
	}
	

}
