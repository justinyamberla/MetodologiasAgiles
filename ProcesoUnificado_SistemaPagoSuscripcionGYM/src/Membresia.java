import java.util.Scanner;

public class Membresia {
    private String tipo;
    private String fechInicio;
    private String fechFinal;
    private double precio;

    public Membresia() {

    }

    public Membresia(String tipo, String fechInicio, double precio) {
        this.tipo = tipo;
        this.fechInicio = fechInicio;
        this.precio = precio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getFechInicio() {
        return fechInicio;
    }

    public void setFechInicio(String fechInicio) {
        this.fechInicio = fechInicio;
    }

    public String getFechFinal() {
        return fechFinal;
    }

    public void setFechFinal(String fechFinal) {
        this.fechFinal = fechFinal;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void seleccionarMembresia() {
        Scanner in = new Scanner(System.in);
        int opMembresia;

        System.out.print("1) Mensual -> $25\n2) Quincenal -> $18\n3) Diario -> $2\n4) Tarjeta por 21 días -> $30\n");
        System.out.print("\nSeleccione la membresia: ");
        opMembresia = in.nextInt();
        in.nextLine();

        if (opMembresia == 1) {
            this.tipo = "Mensual";
            this.precio = 25;
        } else if (opMembresia == 2) {
            this.tipo = "Quincenal";
            this.precio = 18;
        } else if (opMembresia == 3) {
            this.tipo = "Diario";
            this.precio = 2;
        } else if (opMembresia == 4) {
            this.tipo = "Tarjeta x 21 días";
            this.precio = 30;
        }

        System.out.print("\nIngrese la fecha de inicio (dd/mm/aaaa): ");
        this.fechInicio = in.nextLine();

    }

    @Override
    public String toString() {
        return "Membresia= " +tipo +
                ", Fecha Inicio= " + fechInicio +
                ", Fecha Final= " + fechFinal +
                ", Precio= $" + precio;
    }
}
