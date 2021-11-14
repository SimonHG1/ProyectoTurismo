package trpModel;


public class Usuario {
    
    private String id;
    private String nombre;
    private String apellido;
    private String email;
    private String direccion;
    private String telefono;
    private String idCuentaUsuario;

    public Usuario() {
    }

    public Usuario(String id, String nombre, String apellido, String email, String direccion, String telefono, String idCuentaUsuario) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.direccion = direccion;
        this.telefono = telefono;
        this.idCuentaUsuario = idCuentaUsuario;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getIdCuentaUsuario() {
        return idCuentaUsuario;
    }

    public void setIdCuentaUsuario(String idCuentaUsuario) {
        this.idCuentaUsuario = idCuentaUsuario;
    }
    
}
