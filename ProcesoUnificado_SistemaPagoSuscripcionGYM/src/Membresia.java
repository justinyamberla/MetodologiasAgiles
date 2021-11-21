import java.util.Arrays;
import java.util.List;


public class Membresia {

    private String tipo;
    private double precio;



    public Membresia(String nuevaMembresia) {

        List<String> membresias = Arrays.asList("Anual", "Mensual", "Semanal");

        for(String s : membresias){
            if (s.equals(nuevaMembresia)) {
                this.tipo = s;
                break;
            }else{
                this.tipo = "No valido";
            }
        }
    }


    @Override
    public String toString() {
        return "\nMembresia= " + tipo +
                "\nPrecio= $" + precio;
    }
}
