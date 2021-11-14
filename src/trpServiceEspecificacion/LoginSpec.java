package trpServiceEspecificacion;

import trpModel.CuentaUsuario;


public interface LoginSpec extends RowMapper<CuentaUsuario> {
    
    CuentaUsuario validar(String emailUsuario, String passwordUsuario);
    
}
