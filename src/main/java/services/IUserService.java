package services;

import utils.dto.UserDTO;

/** logica de persistencia y patrones de diseño de la app*/

public interface IUserService {

	public boolean registerUser( UserDTO user );

}
