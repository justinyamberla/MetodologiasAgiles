import java.util.*;

public class Cliente {
    private String nombre;
    private int edad;
    private String cedula;
    private String direccion;
    //private Membresia membresia;
    private String membresia;

    public Cliente(String nombre, int edad, String cedula, String direccion, String membresia) {
        this.nombre = nombre;
        this.edad = edad;
        this.cedula = cedula;
        this.direccion = direccion;
        this.membresia = membresia;
    }

    public void comprarMembresia(){
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese su tarjeta");
        String tarjeta=input.nextLine();
        System.out.println("Ingrese su CVV");
        String CVV=input.nextLine();
        System.out.println("Escoja su nueva membresia:\n1.Mensual\n2.Semanal\n3.Diaria");
        int opcion= input.nextInt();
        switch (opcion){
            case 1:
                this.membresia="Mensual";
                break;
            case 2:
                this.membresia="Semanal";
                break;
            case 3:
                this.membresia="Diaria";
                break;
            default:
                System.out.println("Operacion Cancelada");
        }
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "Nombre= " + nombre +
                ", Edad= " + edad +
                ", Cédula= " + cedula +
                ", Dirección= " + direccion +
                ", Membresia" + membresia +
                '}';
    }
}

