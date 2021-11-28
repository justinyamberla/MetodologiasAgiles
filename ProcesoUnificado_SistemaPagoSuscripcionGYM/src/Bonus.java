import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Scanner;

public class Bonus {
    private Usuario user;
    private int diaExtra;
    private double membresiaDesc;
    private Suplementos suplemento = new Suplementos();
    private Accesorio accesorio = new Accesorio();
    private Ropa ropa = new Ropa();

    ArrayList<Accesorio> listAccesorios = new ArrayList<Accesorio>();
    ArrayList<Ropa> listRopa = new ArrayList<Ropa>();

    public Bonus() {
        inicializarListas();
    }

    public int getDiaExtra() {
        return diaExtra;
    }

    public void setDiaExtra(int diaExtra) {
        this.diaExtra = diaExtra;
    }

    public double getMembresiaDesc() {
        return membresiaDesc;
    }

    public void setMembresiaDesc(double membresiaDesc) {
        this.membresiaDesc = membresiaDesc;
    }

    public Suplementos getSuplemento() {
        return suplemento;
    }

    public void setSuplemento(Suplementos suplemento) {
        this.suplemento = suplemento;
    }

    public Accesorio getAccesorio() {
        return accesorio;
    }

    public void setAccesorio(Accesorio accesorio) {
        this.accesorio = accesorio;
    }

    public Ropa getRopa() {
        return ropa;
    }

    public void setRopa(Ropa ropa) {
        this.ropa = ropa;
    }

    public void rebajarPrecioMembresia(Usuario user) {

        switch (user.getCliente().getMembresia().getTipo()) {
            case "Anual" -> {
                this.membresiaDesc = 185;
            }
            case "Mensual" -> {
                this.membresiaDesc = 18;
            }
            case "Semanal" -> {
                System.out.println("No aplica para este tipo de membresía");
            }
        }
        user.getBono().setMembresiaDesc(membresiaDesc);
    }

    public void premiarDiaExtra(Usuario user) {
        switch (user.getCliente().getMembresia().getTipo()) {
            case "Anual" -> {
                this.diaExtra = 5;
            }
            case "Mensual" -> {
                this.diaExtra = 1;
            }
            case "Semanal" -> {
                System.out.println("No aplica para este tipo de membresía");
            }
        }
        user.getBono().setDiaExtra(diaExtra);
    }

    public void ofrecerSuplementos(Usuario user) {
        String membresia = user.getCliente().getMembresia().getTipo();
        Scanner in = new Scanner(System.in);
        System.out.print("\nDesea adquirir:\n\t1.Proteina $100\n\t2.PreEntreno $50\n\t3.Creatina $20");
        int op = in.nextInt();
        switch (op) {
            case 1 -> {
                suplemento.setTipo("Proteina");

                if (membresia.equals("Anual")) {
                    System.out.print("\n*Por tu membresia tienes un 20% de descuento*\n");
                    suplemento.setPrecio(80);
                } else if (membresia.equals("Mensual")) {
                    System.out.print("\n*Por tu membresia tienes un 10% de descuento*\n");
                    suplemento.setPrecio(90);
                } else {
                    System.out.print("\n*Tu membresia no tiene descuentos*\n");
                    suplemento.setPrecio(100);
                }
            }
            case 2 -> {
                suplemento.setTipo("PreEntreno");

                if (membresia.equals("Anual")) {
                    System.out.print("\n*Por tu membresia tienes un 20% de descuento*\n");
                    suplemento.setPrecio(40);
                } else if (membresia.equals("Mensual")) {
                    System.out.print("\n*Por tu membresia tienes un 10% de descuento*\n");
                    suplemento.setPrecio(45);
                } else {
                    System.out.print("\n*Tu membresia no tiene descuentos*\n");
                    suplemento.setPrecio(50);
                }
            }
            case 3 -> {
                suplemento.setTipo("Creatina");

                if (membresia.equals("Anual")) {
                    System.out.print("\n*Por tu membresia tienes un 20% de descuento*\n");
                    suplemento.setPrecio(16);
                } else if (membresia.equals("Mensual")) {
                    System.out.print("\n*Por tu membresia tienes un 10% de descuento*\n");
                    suplemento.setPrecio(18);
                } else {
                    System.out.print("\n*Tu membresia no tiene descuentos*\n");
                    suplemento.setPrecio(20);
                }
            }
        }
        user.getBono().setSuplemento(suplemento);
    }

    public void recomendarAccesorios(Usuario user) {
        String membresia = user.getCliente().getMembresia().getTipo();
        Scanner in = new Scanner(System.in);
        System.out.print("\nTe recomendamos:\n\t1.Cinturon $100\n\t2.Guantes $50\n\t3.Rodirellas $20");
        int op = in.nextInt() - 1;

        accesorio.setTipo(listAccesorios.get(op).getTipo());
        double auxPrecio = listAccesorios.get(op).getPrecio();

        switch (membresia) {
            case "Anual" -> {
                System.out.print("\n*Por tu membresia tienes un 20% de descuento*\n");
                accesorio.setPrecio(aplicarDescuento(membresia,auxPrecio));
            }
            case "Mensual" -> {
                System.out.print("\n*Por tu membresia tienes un 10% de descuento*\n");
                accesorio.setPrecio(aplicarDescuento(membresia,auxPrecio));
            }
            default -> {
                System.out.print("\n*Tu membresia no tiene descuentos*\n");
                accesorio.setPrecio(aplicarDescuento(membresia,auxPrecio));
            }
        }
        user.getBono().setAccesorio(accesorio);
    }

    public void ofrecerRopa(Usuario user){
        String membresia = user.getCliente().getMembresia().getTipo();
        Scanner in = new Scanner(System.in);
        System.out.print("\nDeseas adquirir:\n\t1.Camiseta $20\n\t2.Pantalón $15\n\t3.Chompa $30");
        int op = in.nextInt() - 1;

        ropa.setTipo(listRopa.get(op).getTipo());
        double auxPrecio = listRopa.get(op).getPrecio();

        switch (membresia) {
            case "Anual" -> {
                System.out.print("\n*Por tu membresia tienes un 20% de descuento*\n");
                ropa.setPrecio(aplicarDescuento(membresia,auxPrecio));
            }
            case "Mensual" -> {
                System.out.print("\n*Por tu membresia tienes un 10% de descuento*\n");
                ropa.setPrecio(aplicarDescuento(membresia,auxPrecio));
            }
            default -> {
                System.out.print("\n*Tu membresia no tiene descuentos*\n");
                ropa.setPrecio(aplicarDescuento(membresia,auxPrecio));
            }
        }
        user.getBono().setRopa(ropa);

    }

    public double aplicarDescuento(String tipoMembresia, double precioNormal){
        switch (tipoMembresia){
            case "Anual" -> { //20%
                return precioNormal - (precioNormal*0.20);
            }
            case "Mensual" -> { //10%
                return precioNormal - (precioNormal*0.10);
            }
            default -> {
                return precioNormal;
            }
        }
    }

    public void inicializarListas() {
        listAccesorios.add(new Accesorio("Cinturón", 50));
        listAccesorios.add(new Accesorio("Guantes", 20));
        listAccesorios.add(new Accesorio("Rodirrelas", 15));
        listRopa.add(new Ropa("Camiseta",20));
        listRopa.add(new Ropa("Pantalon",15));
        listRopa.add(new Ropa("Chompa",30));
    }

}
