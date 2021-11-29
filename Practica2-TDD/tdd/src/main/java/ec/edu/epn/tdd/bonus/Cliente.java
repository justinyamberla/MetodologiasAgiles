package ec.edu.epn.tdd.bonus;

import java.util.Scanner;

public class Cliente {
    private String nombre;
    private int edad;
    private String cedula;
    private String direccion;
    private Membresia membresia;
    private Tarjeta tarjeta;

    public Cliente(String nombre, int edad, String cedula, String direccion, String membresia) {
        this.nombre = nombre;
        this.edad = edad;
        this.cedula = cedula;
        this.direccion = direccion;
        this.membresia = new Membresia(membresia);
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getCedula() {
        return cedula;
    }

    public String getDireccion() {
        return direccion;
    }

    public Membresia getMembresia() {
        return membresia;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setMembresia(Membresia membresia) {
        this.membresia = membresia;
    }

    public void comprarMembresia() {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese su tarjeta");
        int numTarjetaAux = input.nextInt();
        System.out.println("Ingrese su CVV");
        int cvvAux = input.nextInt();

        tarjeta = new Tarjeta(numTarjetaAux, cvvAux);
        establecerNuevoTipoMembresia();
    }

    public void establecerNuevoTipoMembresia() {
        Scanner input = new Scanner(System.in);
        System.out.println("Escoja su nueva membresia (1, 2, o 3):\n1.Anual\n2.Mensual\n3.Semanal");
        int opcion = input.nextInt();
        switch (opcion) {
            case 1 -> this.membresia = new Membresia("Anual");
            case 2 -> this.membresia = new Membresia("Mensual");
            case 3 -> this.membresia = new Membresia("Semanal");
            default -> System.out.println("Operacion Cancelada");
        }
    }

    @Override
    public String toString() {
        return
                "Nombre = " + nombre +
                        "\nEdad = " + edad +
                        "\nCédula = " + cedula +
                        "\nDirección = " + direccion +
                        membresia.toString();
    }
}

