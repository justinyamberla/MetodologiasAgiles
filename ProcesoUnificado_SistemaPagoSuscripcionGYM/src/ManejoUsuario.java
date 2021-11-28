import java.util.*;


public class ManejoUsuario {
    ArrayList<Usuario> listaUsuarios = new ArrayList<Usuario>();


    public ManejoUsuario() {
        Cliente admin = new Cliente("admin", 0, "001", "En todas partes", "infinita");
        listaUsuarios.add(new Usuario("admin", "admin", admin));
    }

    public int ingresarCredenciales() {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese su usuario:");
        String usuario = input.nextLine();
        System.out.println("Ingrese su contrasena:");
        String contrasena = input.nextLine();
        return login(usuario, contrasena);
    }

    public int login(String usuario, String contrasena) {
        for (Usuario i : listaUsuarios) {
            boolean validarNombreUsuario = i.getNombreUsuario().equals(usuario);
            boolean validarContrasena = i.getContrasena().equals(contrasena);
            if (validarNombreUsuario && validarContrasena) {
                System.out.println("\n\nIngreso correcto \nBienvenido " + i.getNombreUsuario() + '!');
                return listaUsuarios.indexOf(i);
            }
        }
        System.out.println("Credenciales incorrectas");
        return -1;
    }

    public void iniciarRegistro() {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese su nuevo usuario:");
        String nombreUsuario = input.nextLine();
        System.out.println("Ingrese su nueva contraseña:");
        String contrasena = input.nextLine();
        System.out.println("Ingrese su nombre:");
        String nombre = input.nextLine();
        System.out.println("Ingrese su edad:");
        int edad = input.nextInt();
        input.nextLine();
        System.out.println("Ingrese su cedula:");
        String cedula = input.nextLine();
        System.out.println("Ingrese su direccion:");
        String direccion = input.nextLine();
        System.out.println("Ingrese su nueva membresia:");
        String membresia = input.nextLine();

        registrar(nombre, edad, cedula, direccion, membresia, nombreUsuario, contrasena);
    }

    public void registrar(String nombre, int edad, String cedula, String direccion, String membresia,
                          String usuario, String contrasena) {

        Cliente temporal = new Cliente(nombre, edad, cedula, direccion, membresia);
        listaUsuarios.add(new Usuario(usuario, contrasena, temporal));
    }

    public void finalizarActualizacionInformacion(Usuario usuario){
        Scanner input = new Scanner(System.in);
        System.out.println("Desea actualizar algo más?\n\t1.Si\n\t2.No");
        int opcion = input.nextInt();
        if(opcion == 1){
            actualizarInformacion(usuario);
        }
    }

    public void actualizarInformacion(Usuario usuario){
        Scanner input = new Scanner(System.in);
        System.out.println("Qué desea actualizar?\n1.Usuario\n2.Contraseña\n3.Nombre" +
                "\n4.Edad\n5.Cédula\n6.Dirección\n7.Membresía\n");
        int opcion = input.nextInt();
        input.nextLine();

        switch (opcion){
            case 1 ->{
                System.out.print("Ingrese el nuevo usuario: ");
                String aux = input.nextLine();
                usuario.setNombreUsuario(aux);
                finalizarActualizacionInformacion(usuario);
            }
            case 2 ->{
                System.out.print("Ingrese la nueva contraseña: ");
                String aux = input.nextLine();
                usuario.setContrasena(aux);
                finalizarActualizacionInformacion(usuario);
            }
            case 3 ->{
                System.out.print("Ingrese el nuevo Nombre: ");
                String aux = input.nextLine();
                usuario.getCliente().setNombre(aux);
                finalizarActualizacionInformacion(usuario);
            }
            case 4 ->{
                System.out.print("Ingrese la Edad: ");
                int aux = input.nextInt();
                input.nextLine();
                usuario.getCliente().setEdad(aux);
                finalizarActualizacionInformacion(usuario);
            }
            case 5 ->{
                System.out.print("Ingrese el nuevo número de cédula: ");
                String aux = input.nextLine();
                usuario.getCliente().setCedula(aux);
                finalizarActualizacionInformacion(usuario);
            }
            case 6 ->{
                System.out.print("Ingrese la nueva dirección: ");
                String aux = input.nextLine();
                usuario.getCliente().setDireccion(aux);
                finalizarActualizacionInformacion(usuario);
            }
            case 7 ->{
                System.out.print("Ingrese la Membresía: ");
                String aux = input.nextLine();
                usuario.getCliente().setMembresia(new Membresia(aux));
                finalizarActualizacionInformacion(usuario);
            }
            default -> System.out.println("Opción no válida");
        }
    }


    public void imprimir(int indice) {
        String informacionUsuario = listaUsuarios.get(indice).toString();
        System.out.println(informacionUsuario);
    }

}
