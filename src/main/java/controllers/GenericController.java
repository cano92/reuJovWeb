package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import services.IUserService;
import services.iplm.*;
import utils.dto.UserDTO;
import utils.validator.*;

@Controller
public class GenericController {


//	private UserValidator userValidator;
	
	@Autowired
	private IUserService userService;
	
	public GenericController() { }

	
	@RequestMapping(value="/test",method=RequestMethod.GET)
	public String showHomeTest(Model model) {
		//usado para probar los servicios
		
		//probando alta de usuario
		UserDTO user= new UserDTO();
		
	
		userService.registerUser(user);
		
		return "home";
	}
	
	@RequestMapping(value="/home",method=RequestMethod.GET)
	public String showHome(Model model) {
		//inicio general de la pagina
		//traer articulo principal o novedad
		
		
		
		return "home";
	}
	
	/* recibe un usuario para registrarlo */
	@RequestMapping(value="/register",method=RequestMethod.GET)
	public String showRegisterUser(Model model) {
		
		//si fue exitoso va ahome con info
		//sino vuelve a la formulario con los datos
		return "registerUser";
	}
	
	@RequestMapping(value="/register",method=RequestMethod.POST)
	public String registerUser( @RequestHeader("username") String username ) {
		//validar permiso con la user session
		
		//crear primero el DTO si pasa la validacion se envia el DTO sino pasa se envia el DTO
		UserDTO userDTO=this.createRegisterUserDTO();
		
	
//		System.out.println(username);
		
		//boolean result = userValidator.validateRegisterForm( );
		boolean result=false;
		if(result) { //pasa la validacion
			
			this.userService.registerUser(userDTO);
			return "home";//el usuario se registro correctamente
			
		}else {	//no pasa la validacion
			
//			el error del frmulario se envia: Error + userDTO	campos		
//			model.addAttribute("error",error);
			return "error";
		}
	}
	
	private UserDTO createRegisterUserDTO() {
		UserDTO userDTO= new UserDTO();
		
		//se le setean los datos con los del formulario
		userDTO.setNombre("alguien");
		userDTO.setApellido("un apellido");
		userDTO.setDni(1234);
		
		
		
		return userDTO;
	}
	
	/* usuario intenta logguearse*/
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String showloginUser() {
		
		//en caso de falla else
		return "login";
	}

	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String loginUser() {
		
		//if (){}
		
		
		return "";
	}
	
	@RequestMapping(value="/info",method=RequestMethod.GET)
	public String info() {
		
		//deberia traer los contactos actualizados de los encargados publicos
		return "info";
	}

	
	
//	public IUserValidator getUserValidator() {
//		return userValidator;
//	}
//
//	public void setUserValidator(IUserValidator userValidator) {
//		this.userValidator = userValidator;
//	}

	public IUserService getUserService() {
		return userService;
	}

	public void setUserService(IUserService userService) {
		this.userService = userService;
	}
	
	
	
}
