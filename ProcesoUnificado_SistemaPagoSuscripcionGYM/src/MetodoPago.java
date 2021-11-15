import java.util.Scanner;

public class MetodoPago {
    private String tipo;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void selecionarFormaDePago() {
        int opcion;
        int tarjeta;
        Scanner in = new Scanner(System.in);
        System.out.print("1) Efectivo\n2) Tarjeta");
        System.out.print("\nIngrese su forma de pago: ");
        opcion = in.nextInt();

        switch (opcion){
            case 1:
                System.out.print("\nImprima su comprobante de pago!\n");
                break;
            case 2:
                System.out.print("\nIngrese su número de tarjeta: ");
                tarjeta = in.nextInt();
                System.out.print("\n¡Pago realizado existosamente!");
                break;
        }

    }

}
