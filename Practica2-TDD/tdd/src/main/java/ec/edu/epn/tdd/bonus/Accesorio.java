package ec.edu.epn.tdd.bonus;

public class Accesorio {
    private String tipo;
    private double precio;

    public Accesorio() {
    }

    public Accesorio(String accesorio, double precio) {
        this.tipo = accesorio;
        this.precio = precio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String accesorio) {
        this.tipo = accesorio;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
