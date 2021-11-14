package trpModel;

import java.sql.Date;


public class CuentaUsuario {
    
    private int idCuentaUsuario;
    private String emailUsuario;
    private String passwordUsuario;
    private Date fechaCreacion;
    private int idTipoUsuario;

    public CuentaUsuario() {
    }

    public CuentaUsuario(int idCuentaUsuario, String emailUsuario, String passwordUsuario, Date fechaCreacion, int idTipoUsuario) {
        this.idCuentaUsuario = idCuentaUsuario;
        this.emailUsuario = emailUsuario;
        this.passwordUsuario = passwordUsuario;
        this.fechaCreacion = fechaCreacion;
        this.idTipoUsuario = idTipoUsuario;
    }

    public int getIdCuentaUsuario() {
        return idCuentaUsuario;
    }

    public void setIdCuentaUsuario(int idCuentaUsuario) {
        this.idCuentaUsuario = idCuentaUsuario;
    }

    public String getEmailUsuario() {
        return emailUsuario;
    }

    public void setEmailUsuario(String emailUsuario) {
        this.emailUsuario = emailUsuario;
    }

    public String getPasswordUsuario() {
        return passwordUsuario;
    }

    public void setPasswordUsuario(String passwordUsuario) {
        this.passwordUsuario = passwordUsuario;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public int getIdTipoUsuario() {
        return idTipoUsuario;
    }

    public void setIdTipoUsuario(int idTipoUsuario) {
        this.idTipoUsuario = idTipoUsuario;
    }
    
}
