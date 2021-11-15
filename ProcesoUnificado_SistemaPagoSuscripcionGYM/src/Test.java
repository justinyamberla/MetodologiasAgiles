import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int opcion, opMembresia;
        String userAux, contraAux;
        Membresia membresiaAux = new Membresia();
        ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();
        String nombreAux, edadAux, cedulaAux, direccionAux, usuarioAux, contrasenaAux;

        Cliente test = new Cliente("Jose", "28", "1726503103", "La Concordia", "12345");

        Scanner in = new Scanner(System.in);

        System.out.println("Sistema de pagos para PoliGym\n1) Ingresar al sistema" +
                "\n2) Registrarse" + "\n3) Salir");

        System.out.print("\nIngrese la opción deseada: ");
        opcion = in.nextInt();
        in.nextLine();

        do {
            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el usuario: ");
                    userAux = in.nextLine();
                    if (userAux.equalsIgnoreCase(test.getCedula())) {
                        System.out.print("Ingrese la contraseña: ");
                        contraAux = in.nextLine();
                        if (contraAux.equalsIgnoreCase(test.getContrasena())) {
                            membresiaAux.seleccionarMembresia();
                            MetodoPago auxMetodoPago = new MetodoPago();
                            auxMetodoPago.selecionarFormaDePago();
                        } else {
                            System.out.print("\nContraseña Incorrecta!");
                        }
                    } else {
                        System.out.print("\nUsuario Incorrecto!");
                    }
                    break;
                case 2:
                    System.out.print("\nIngrese su nombre: ");
                    nombreAux = in.nextLine();
                    System.out.print("Ingrese su edad: ");
                    edadAux = in.nextLine();
                    System.out.print("Ingrese su dirección: ");
                    direccionAux = in.nextLine();
                    System.out.print("Ingrese su cedula: ");
                    cedulaAux = in.nextLine();
                    System.out.print("Ingrese una contraseña: ");
                    contrasenaAux = in.nextLine();
                    Cliente c1 = new Cliente(nombreAux, edadAux, cedulaAux, direccionAux);
                    c1.setContrasena(contrasenaAux);

                    System.out.println();
                    membresiaAux.seleccionarMembresia();
                    c1.setMembresia(membresiaAux);

                    listaClientes.add(c1);

                    System.out.println(listaClientes.get(0).toString());

                    MetodoPago auxMetodoPago = new MetodoPago();
                    auxMetodoPago.selecionarFormaDePago();

                    break;
                default:
                    System.out.print("Opción Incorrecta!");
                    break;

            }
        } while (opcion != 3);

    }

}
