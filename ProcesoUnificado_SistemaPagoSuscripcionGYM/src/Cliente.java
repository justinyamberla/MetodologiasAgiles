public class Cliente {
    private String nombre;
    private String edad;
    private String cedula;
    private String direccion;
    private String contrasena;
    private Membresia membresia;

    public Cliente(String nombre, String edad, String cedula, String direccion) {
        this.nombre = nombre;
        this.edad = edad;
        this.cedula = cedula;
        this.direccion = direccion;
    }

    public Cliente(String nombre, String edad, String cedula, String direccion, String contrasena) {
        this.nombre = nombre;
        this.edad = edad;
        this.cedula = cedula;
        this.direccion = direccion;
        this.contrasena = contrasena;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public Membresia getMembresia() {
        return membresia;
    }

    public void setMembresia(Membresia membresia) {
        this.membresia = membresia;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "Nombre= " + nombre +
                ", Edad= " + edad +
                ", Cédula= " + cedula +
                ", Dirección= " + direccion + ", "
                + membresia.toString() +
                '}';
    }
}

