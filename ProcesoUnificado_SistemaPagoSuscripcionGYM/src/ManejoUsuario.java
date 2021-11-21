import java.util.*;


public class ManejoUsuario {
    ArrayList<Usuario> listaUsuarios = new ArrayList<Usuario>();


    public ManejoUsuario() {
        Cliente admin = new Cliente("admin", 0, "001", "En todas partes", "infinita");
        listaUsuarios.add(new Usuario("admin", "admin", admin));
    }

    public int ingresarCredenciales(){
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese su usuario:");
        String usuario = input.nextLine();
        System.out.println("Ingrese su contrasena:");
        String contrasena = input.nextLine();
        return login(usuario,contrasena);
    }

    public int login(String usuario, String contrasena) {
        for (Usuario i : listaUsuarios) {
            boolean validarNombreUsuario = i.getNombreUsuario().equals(usuario);
            boolean validarContrasena = i.getContrasena().equals(contrasena);
            if (validarNombreUsuario && validarContrasena) {
                System.out.println("Ingreso correcto \nBienvenido "+i.getNombreUsuario()+'!');
                return listaUsuarios.indexOf(i);
            }
        }
        System.out.println("Credenciales incorrectas");
        return -1;
    }

    public void iniciarRegistro(){
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

        registrar(nombre,edad,cedula,direccion,membresia,nombreUsuario,contrasena);
    }


    public void registrar(String nombre, int edad, String cedula, String direccion, String membresia,
                          String usuario, String contrasena) {

        Cliente temporal = new Cliente(nombre, edad, cedula, direccion, membresia);
        listaUsuarios.add(new Usuario(usuario, contrasena, temporal));
    }


    public void imprimir(int indice){
        System.out.println(listaUsuarios.get(indice).toString());
    }

}
