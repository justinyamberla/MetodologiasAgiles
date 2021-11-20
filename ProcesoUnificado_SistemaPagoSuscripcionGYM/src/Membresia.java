import java.util.*;


public class Membresia {
    private int tipo;
    private Date fechInicio;
    private Date fechFinal;
    private double precio;


    public Membresia(int tipo, Date fechInicio) {
        this.tipo = tipo;
        this.fechInicio = fechInicio;
        if (tipo==1){
            this.precio=25;
        } else if (tipo==2){
            this.precio=18;
        } else if(tipo==3){
            this.precio=2;
        } else {
            //error
        }

    }



    @Override
    public String toString() {
        return "Membresia= " +tipo +
                ", Fecha Inicio= " + fechInicio +
                ", Fecha Final= " + fechFinal +
                ", Precio= $" + precio;
    }
}
