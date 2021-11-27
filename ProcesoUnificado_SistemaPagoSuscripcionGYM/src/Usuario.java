public class Usuario {
    private String nombreUsuario;
    private String contrasena;
    private Cliente cliente;

    public Usuario(String nombreUsuario, String contraseña, Cliente cliente) {
        this.nombreUsuario = nombreUsuario;
        this.contrasena = contraseña;
        this.cliente = cliente;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return  "Nombre de Usuario = " + nombreUsuario +
                "\nContraseña = " + contrasena + "\n" +
                cliente.toString();
    }
}
