package modelo;

/**
 *
 * @author HP VICTUS
 */
public class Usuario {

    private int idUsuario;
    private String nombre;
    private String apellido;
    private String usuario;
    private String password;
    private String telefono;
    private int estado;

    public Usuario() {

        this.idUsuario = 0;
        this.nombre = "";
        this.apellido = "";
        this.usuario = "";
        this.password = "";
        this.telefono = "";
        this.estado = 0;

    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public String getUsuario() {
       return usuario;
    }

    public String getPassword() {
        return password;
    }
    
    
}
