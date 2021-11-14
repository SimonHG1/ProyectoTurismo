package trpController;

import trpModel.CuentaUsuario;
import trpServices.LoginDesktop;
import trpServiceEspecificacion.LoginSpec;


public class CuentaUsuarioController {
    
    private LoginSpec loginService;

    public CuentaUsuarioController() {
        loginService = new LoginDesktop();
    }
    
    public CuentaUsuario validar(String emailUsuario, String passwordUsuario) {
		return loginService.validar(emailUsuario, passwordUsuario);
	}
    
   

    
}
