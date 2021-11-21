import java.util.*;


public class Test {
    public static void main(String[] args) {
        manejoUsuarios controller = new manejoUsuarios();
        Scanner input=new Scanner(System.in);
        boolean aceptado=false;
        int opcion=0;
        int indiceUsuario=-1;
        while(!aceptado){
            System.out.println("¿Qué desea hacer? \n1.Ingresar con su usuario\n2.Registrar un nuevo usuario\n3.Salir");
            opcion= input.nextInt();
            switch(opcion){
                case 1:
                    indiceUsuario= controller.login();
                    if(indiceUsuario!=-1){
                        aceptado=true;
                    }
                    break;
                case 2:
                    controller.registar();
                    break;
                case 3:
                    System.out.println("Adios");
                    aceptado=true;
                    break;
                default:
                    System.out.println("No entiendo esa orden");
            }
        }
        if (opcion==3) {
            System.exit(0);
        }
        aceptado=false;
        while(!aceptado){
            System.out.println("\n\n¿Qué desea hacer? \n1.Mostrar su datos\n2.Comprar Membresia\n3.Salir");
            opcion= input.nextInt();
            switch(opcion){
                case 1:
                    controller.imprimir(indiceUsuario);
                    break;
                case 2:
                    controller.listaUsuarios.get(indiceUsuario).getCliente().comprarMembresia();
                    break;
                case 3:
                    System.out.println("Adios");
                    aceptado=true;
                    break;
                default:
                    System.out.println("No entiendo esa orden");
                    break;
            }

        }
        System.exit(0);

        }






    }






