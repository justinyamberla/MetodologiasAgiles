import java.util.*;


public class manejoUsuarios {
    ArrayList<Usuario> listaUsuarios = new ArrayList<Usuario>();


    public manejoUsuarios() {
        Cliente admin=new Cliente("Admin",0,"001","En todas partes","infinita");
        listaUsuarios.add(new Usuario("Admin","Admin",admin));
    }

    public int login(){
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese su usuario:");
        String usuario=input.nextLine();
        System.out.println("Ingrese su contraseña:");
        String contraseña=input.nextLine();
        for(Usuario i : listaUsuarios){
            if(i.getNombreUsuario().equals(usuario) && i.getContraseña().equals(contraseña)){
                System.out.println("Ingreso correcto \nBienvenido");
                return listaUsuarios.indexOf(i);
            }
        }
        System.out.println("Credenciales incorrectas");
        return -1;
    }

    public void registar() {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese su nuevo usuario:");
        String nombreUsuario=input.nextLine();
        System.out.println("Ingrese su nueva contraseña:");
        String contraseña=input.nextLine();
        System.out.println("Ingrese su nuevo nombre:");
        String nombre=input.nextLine();
        System.out.println("Ingrese su nueva edad:");
        int edad=input.nextInt();
        System.out.println("Ingrese su nueva cedula:");
        String cedula=input.nextLine();
        System.out.println("Ingrese su nueva direccion:");
        String direccion=input.nextLine();
        System.out.println("Ingrese su nueva membresia:");
        String membresia=input.nextLine();
        Cliente temporal=new Cliente(nombre,edad,cedula,direccion,membresia);
        listaUsuarios.add(new Usuario(nombreUsuario,contraseña,temporal));
    }

    public void imprimir(int indice){
        System.out.println(listaUsuarios.get(indice).toString());
    }

}
