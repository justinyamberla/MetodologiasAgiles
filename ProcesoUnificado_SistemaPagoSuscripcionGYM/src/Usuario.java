import java.util.*;

public class Usuario {
    private String nombreUsuario;
    private String contraseña;
    private Cliente cliente;

    public Usuario(String nombreUsuario, String contraseña, Cliente cliente) {
        this.nombreUsuario = nombreUsuario;
        this.contraseña = contraseña;
        this.cliente=cliente;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public Cliente getCliente() {
        return cliente;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nombreUsuario='" + nombreUsuario + '\'' +
                ", contraseña='" + contraseña + '\'' +
                    cliente.toString() +
                '}';
    }
}
