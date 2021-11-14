package trpServices;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import trpBD.AccesoDB;
import trpModel.CuentaUsuario;
import trpServiceEspecificacion.LoginSpec;


public class LoginDesktop implements LoginSpec {
    
    private final String SQL_SELECT = "select id_cuenta_usuario, email_usuario, " 
                                    + "password_usuario, fecha_creacion, "
                                    + "tipo_usuario_id_tipo_usuario from cuenta_usuario ";
   
        @Override
	public CuentaUsuario validar(String emailUsuario, String passwordUsuario) {
		CuentaUsuario bean = null;
		Connection cn = null;
		try {
			cn = AccesoDB.getConnection();
			String sql = SQL_SELECT
							+ "where email_usuario = ? and password_usuario = ? ";
			PreparedStatement pstm = cn.prepareStatement(sql);
			pstm.setString(1, emailUsuario);
			pstm.setString(2, passwordUsuario);
			ResultSet rs = pstm.executeQuery();
			if (rs.next()) {
				bean = mapRow(rs);
			}
                        
			rs.close();
			pstm.close();
		} catch (SQLException e) {
			throw new RuntimeException(e.getMessage());
		} catch (Exception e) {
			String msg = "Error en el proceso de validación.";
			if (e.getMessage() != null) {
				msg += "\n" + e.getMessage();
			}
			throw new RuntimeException(msg);
		} finally {
			try {
				cn.close();
			} catch (Exception e) {
			}
		}
		return bean;
	}
        
       
       
        
        @Override
	public CuentaUsuario mapRow(ResultSet rs) throws SQLException {
		CuentaUsuario bean = new CuentaUsuario();
                bean.setIdCuentaUsuario(rs.getInt("id_cuenta_usuario"));
                bean.setEmailUsuario(rs.getString("email_usuario"));
                bean.setPasswordUsuario("******");
                bean.setFechaCreacion(rs.getDate("fecha_creacion"));
                bean.setIdTipoUsuario(rs.getInt("tipo_usuario_id_tipo_usuario"));
		return bean;
	}
}
