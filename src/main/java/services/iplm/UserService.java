package services.iplm;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.IUsuarioDAO;
import entities.Usuario;
import services.IUserService;
import utils.dto.UserDTO;
import utils.mapper.UserMapper;

@Service
public class UserService implements IUserService {

	@Autowired
	private IUsuarioDAO userDAO;
	@Autowired
	private UserMapper userMapper;
	
	public UserService() {
		// TODO Auto-generated constructor stub
	}

	
	
	public IUsuarioDAO getUserDAO() {
		return userDAO;
	}



	public void setUserDAO(IUsuarioDAO userDAO) {
		this.userDAO = userDAO;
	}



	@Override
	public boolean registerUser(UserDTO user) {
		//la BD no conoce userDTO se debe mapear a entidad para registrar
		Usuario usuario=this.userMapper.mappingToUsuario(user);
		
		userDAO.save(usuario);
		return true;
	}
	

}
