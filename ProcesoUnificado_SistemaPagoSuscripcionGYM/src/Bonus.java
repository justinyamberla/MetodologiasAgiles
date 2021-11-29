import java.util.*;

public class Bonus {
    private Usuario user;
    private int diaExtra;
    private double membresiaDesc;
    private Suplementos suplemento = new Suplementos();
    private Accesorio accesorio = new Accesorio();
    private Ropa prenda = new Ropa();

    ArrayList<Suplementos> listSuplementos = new ArrayList<Suplementos>();
    ArrayList<Accesorio> listAccesorios = new ArrayList<Accesorio>();
    ArrayList<Ropa> listRopa = new ArrayList<Ropa>();

    public Bonus() {
        inicializarListas();
    }

    public Usuario getUser() {
        return user;
    }

    public void setUser(Usuario user) {
        this.user = user;
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
        return prenda;
    }

    public void setRopa(Ropa ropa) {
        this.prenda = ropa;
    }

    public void rebajarPrecioMembresia(Usuario user) {
        String tipoMembresia = user.getCliente().getMembresia().getTipo();

        switch (tipoMembresia) {
            case "Anual" -> {
                this.membresiaDesc = 155;
            }
            case "Mensual" -> {
                this.membresiaDesc = 18;
            }
            case "Semanal" ->{
                System.out.println("No aplica para este tipo de membresía");
            }
        }
        user.getBono().setMembresiaDesc(membresiaDesc);
    }

    public void premiarFidelidad(Usuario user) {
        String tipoMembresia = user.getCliente().getMembresia().getTipo();
        switch (tipoMembresia) {
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

    public void informacionSuplementos(Usuario user){
        String membresia = user.getCliente().getMembresia().getTipo();
        Scanner in = new Scanner(System.in);
        System.out.print("\nDesea adquirir:\n\t1.Proteina $100\n\t2.PreEntreno $50\n\t3.Creatina $20");
        int op = in.nextInt();
        ofrecerSuplementos(user,op,membresia);
    }

    public void ofrecerSuplementos(Usuario user, int index, String membresia) {
        suplemento.setTipo(listSuplementos.get(index-1).getTipo());
        double auxPrecio = listSuplementos.get(index-1).getPrecio();

        switch (membresia) {
            case "Anual" -> {
                System.out.print("\n*Por tu membresia tienes un 20% de descuento*\n");
                suplemento.setPrecio(aplicarDescuento(membresia,auxPrecio));
            }
            case "Mensual" -> {
                System.out.print("\n*Por tu membresia tienes un 10% de descuento*\n");
                suplemento.setPrecio(aplicarDescuento(membresia,auxPrecio));
            }
            default -> {
                System.out.print("\n*Tu membresia no tiene descuentos*\n");
                suplemento.setPrecio(aplicarDescuento(membresia,auxPrecio));
            }
        }
        user.getBono().setSuplemento(suplemento);
    }

    public void informacionAccesorios(Usuario user){
        String membresia = user.getCliente().getMembresia().getTipo();
        Scanner in = new Scanner(System.in);
        System.out.print("\nTe recomendamos:\n\t1.Cinturon $100\n\t2.Guantes $50\n\t3.Rodirellas $20");
        int op = in.nextInt();
        recomendarAccesorios(user,op,membresia);
    }

    public void recomendarAccesorios(Usuario user, int index, String membresia) {
        accesorio.setTipo(listAccesorios.get(index-1).getTipo());
        double auxPrecio = listAccesorios.get(index-1).getPrecio();

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
        //user.getBono().setAccesorio(accesorio);
    }
    public void informacionRopa(Usuario user){
        String membresia = user.getCliente().getMembresia().getTipo();
        Scanner in = new Scanner(System.in);
        System.out.print("\nDeseas adquirir:\n\t1.Camiseta $20\n\t2.Pantalón $15\n\t3.Chompa $30");
        int tpRopa = in.nextInt();

        ofrecerRopa(user,tpRopa,membresia);
    }
    public void ofrecerRopa(Usuario user,int tpRopa,String membresia){

        prenda.setTipo(listRopa.get(tpRopa-1).getTipo());
        double auxPrecio = listRopa.get(tpRopa-1).getPrecio();

        switch (membresia) {
            case "Anual" -> {
                System.out.print("\n*Por tu membresia tienes un 20% de descuento*\n");
                prenda.setPrecio(aplicarDescuento(membresia,auxPrecio));
            }
            case "Mensual" -> {
                System.out.print("\n*Por tu membresia tienes un 10% de descuento*\n");
                prenda.setPrecio(aplicarDescuento(membresia,auxPrecio));
            }
            default -> {
                System.out.print("\n*Tu membresia no tiene descuentos*\n");
                prenda.setPrecio(aplicarDescuento(membresia,auxPrecio));
            }
        }

        Scanner in = new Scanner(System.in);
        System.out.print("\nSeleccione la talla:\n\t1.S - Small\n\t2.M - Medium\n\t3.L - Large");
        int talla = in.nextInt();

        switch (talla){
            case 1 -> prenda.setTalla("S");
            case 2 -> prenda.setTalla("M");
            case 3 -> prenda.setTalla("L");
        }

        user.getBono().setRopa(prenda);
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
        listSuplementos.add(new Suplementos("Proteina",100));
        listSuplementos.add(new Suplementos("PreEntreno",50));
        listSuplementos.add(new Suplementos("Creatina",20));
        listAccesorios.add(new Accesorio("Cinturón", 50));
        listAccesorios.add(new Accesorio("Guantes", 20));
        listAccesorios.add(new Accesorio("Rodirrelas", 15));
        listRopa.add(new Ropa("Camiseta",20));
        listRopa.add(new Ropa("Pantalon",15));
        listRopa.add(new Ropa("Chompa",30));
    }

}
