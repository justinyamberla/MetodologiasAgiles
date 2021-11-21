import java.util.*;

public class Cliente {
    private String nombre;
    private int edad;
    private String cedula;
    private String direccion;
    private Membresia membresia;

    public Cliente(String nombre, int edad, String cedula, String direccion, String membresia) {
        this.nombre = nombre;
        this.edad = edad;
        this.cedula = cedula;
        this.direccion = direccion;
        this.membresia = new Membresia(membresia);
    }

    public void comprarMembresia(){
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese su tarjeta");
        String tarjeta = input.nextLine();
        System.out.println("Ingrese su CVV");
        String CVV = input.nextLine();
        establecerNuevoTipoMembresia();
    }

    public void establecerNuevoTipoMembresia(){
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
                "Nombre= " + nombre +
                "\nEdad= " + edad +
                "\nCédula= " + cedula +
                "\nDirección= " + direccion +
                membresia.toString();
    }
}

