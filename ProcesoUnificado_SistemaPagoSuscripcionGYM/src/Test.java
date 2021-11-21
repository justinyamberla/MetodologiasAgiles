import java.util.*;

public class Test {
    public static void main(String[] args) {
        ManejoUsuario sistema = new ManejoUsuario();
        Scanner input=new Scanner(System.in);
        int opcion=0;
        int indiceUsuario=-1;

        boolean finMenuInicial=false;
        while(!finMenuInicial){
            System.out.println("¿Qué desea hacer? \n1.Ingresar con su usuario\n2.Registrar un nuevo usuario\n3.Salir");
            opcion= input.nextInt();
            switch (opcion) {
                case 1 -> {
                    indiceUsuario = sistema.ingresar();
                    if (indiceUsuario != -1) {
                        finMenuInicial = true;
                    }
                }
                case 2 -> sistema.iniciarRegistro();
                case 3 -> {
                    System.out.println("Adios");
                    finMenuInicial = true;
                }
                default -> System.out.println("No entiendo esa orden");
            }
        }

        if (opcion==3) {
            System.exit(0);
        }

        boolean finMenuSecundario=false;
        while(!finMenuSecundario){
            System.out.println("\n\n¿Qué desea hacer? \n1.Mostrar su datos\n2.Comprar Membresia\n3.Salir");
            opcion= input.nextInt();
            switch (opcion) {
                case 1 -> sistema.imprimir(indiceUsuario);
                case 2 -> {
                    Cliente localizacionUsuario = sistema.listaUsuarios.get(indiceUsuario).getCliente();
                    localizacionUsuario.comprarMembresia();
                }
                case 3 -> {
                    System.out.println("Adios");
                    finMenuSecundario = true;
                }
                default -> System.out.println("No entiendo esa orden");
            }

        }
        System.exit(0);

    }


}
