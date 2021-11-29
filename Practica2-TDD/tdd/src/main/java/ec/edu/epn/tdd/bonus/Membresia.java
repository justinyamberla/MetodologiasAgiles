package ec.edu.epn.tdd.bonus;

public class Membresia {
    private String tipo;
    private double precio;

    public Membresia(String tipo) {
        establecerTipoMembresia(tipo);
    }

    public String getTipo() {
        return tipo;
    }

    public double getPrecio() {
        return precio;
    }

    public void establecerTipoMembresia(String tipo) {
        switch (tipo) {
            case "Anual" -> {
                this.tipo = "Anual";
                precio = 200;
            }
            case "Mensual" -> {
                this.tipo = "Mensual";
                precio = 20;
            }
            case "Semanal" -> {
                this.tipo = "Semanal";
                precio = 6;
            }
            default -> {
                this.tipo = "No valido";
                precio = 0;
            }
        }
    }



    @Override
    public String toString() {
        return "\nMembresia = " + tipo +
                "\nPrecio = $" + precio;
    }
}
