package ec.edu.epn.tdd.bonus;

import java.util.Scanner;

public class Suplementos {
    private String tipo;
    private double precio;

    public Suplementos() {
    }

    public Suplementos(String tipo, double precio) {
        this.tipo = tipo;
        this.precio = precio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void comprarSuplemento(){
        Scanner in = new Scanner(System.in);
        System.out.print("\nDesea adquirir:\n\t1.Proteina $100\n\t2.PreEntreno $50\n\t3.Creatina $20");
        int op = in.nextInt();

    }

    //public void asignar suplemento

}
