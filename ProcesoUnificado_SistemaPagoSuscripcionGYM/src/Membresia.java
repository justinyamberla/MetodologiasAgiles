import java.util.*;


public class Membresia {

    private String tipo;
    //private String fechInicio;
    private double precio;


    public Membresia(String tipo) {
        if (tipo.equals("Anual")){
            this.tipo="Anual";
            precio=200;

        } else if(tipo.equals("Mensual")){
            this.tipo="Mensual";
            precio=20;

        } else if (tipo.equals("Semanal")){
            this.tipo="Semanal";
            precio=6;
        }  else {
            this.tipo="No valido";
            precio=0;
        }

    }


    @Override
    public String toString() {
        return "\nMembresia= "+tipo +
                "\nPrecio= $" + precio;
    }
}
