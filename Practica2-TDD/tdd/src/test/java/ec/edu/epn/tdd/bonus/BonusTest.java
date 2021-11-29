package ec.edu.epn.tdd.bonus;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

//given_when_then_ok

public class BonusTest {
    Bonus b = null;
    private Usuario tdd = null;

    @Before
    public void BonusTest(){
        b = new Bonus();
        tdd = new Usuario("test","", new Cliente("",2,"","","Mensual"));
    }

    @Test
    public void given_user_when_rebajarPrecioMembresia_then_ok() {
        Usuario test2 = new Usuario("test","", new Cliente("",23,"","","Mensual"));
        b.rebajarPrecioMembresia(test2);

        System.out.print("\nTEST #1\n");
        assertTrue("Error al aplicar el descuento",test2.getBono().getMembresiaDesc() == 18);
        System.out.print("\n*** Test Exitoso ***\n");
    }

    @Test
    public void given_user_when_premiarFidelidad_then_ok() {
        b.premiarFidelidad(tdd);

        System.out.print("\nTEST #2\n");
        assertFalse("Error variable días extras vacío",tdd.getBono().getDiaExtra()==0);
        System.out.print("\nDías extra -> "+tdd.getBono().getDiaExtra()+"\n");
        System.out.print("\n*** Test Exitoso ***\n");
    }

    @Test
    public void given_user_when_ofrecerSuplementos_then_ok() {
        b.ofrecerSuplementos(tdd,1,tdd.getCliente().getMembresia().getTipo());

        System.out.print("\nTEST #3\n");
        assertNotEquals("Error no existe un suplemento asignado",null,tdd.getBono().getSuplemento().getTipo());
        System.out.print("\nSuplemento asignado -> "+tdd.getBono().getSuplemento().getTipo()+"\n");
        System.out.print("\n*** Test Exitoso ***\n");
    }

    @Test
    public void given_user_when_recomendarAccesorios_then_ok() {
        b.recomendarAccesorios(tdd,2,tdd.getCliente().getMembresia().getTipo());

        System.out.print("\nTEST #4\n");
        assertNotEquals("Error no existe accesorio asignado",null,tdd.getBono().getAccesorio().getTipo());
        System.out.print("\nAccesorio asignado -> "+tdd.getBono().getAccesorio().getTipo()+"\n");
        System.out.print("\n*** Test Exitoso ***\n");
    }

    @Test
    public void given_user_when_ofrecerRopa_then_ok() {
        b.ofrecerRopa(tdd,2,tdd.getCliente().getMembresia().getTipo());

        System.out.print("\nTEST #5\n");
        assertEquals("Error no existe ropa asignado","Pantalon",tdd.getBono().getRopa().getTipo());
        System.out.print("\nRopa asignada -> "+tdd.getBono().getRopa().getTipo()+"\n");
        System.out.print("\n*** Test Exitoso ***\n");

    }

    @Test
    public void given_string_and_double_when_calcularDescuenta_then_ok() {
        System.out.print("\nTEST #6\n");

        assertTrue("Error no se aplico correctamente el descuento",b.aplicarDescuento("Anual",200) == 180);

        System.out.print("\nDescuento aplicado correctamente -> "+b.aplicarDescuento("Mensual",200)+"\n");
        System.out.print("\n*** Test Exitoso ***\n");
    }

    @Test
    public void given_string_and_double_when_wrong_calcularDescuenta_then_ok() {
        System.out.print("\nTEST #7\n");

        assertFalse("Descuento aplicado correctamente",
                b.aplicarDescuento("Anual",200) == 180);

        System.out.print("\nError, no se aplicó correctamente el descuento -> "+
                b.aplicarDescuento("Mensual",200)+"\n");
        System.out.print("\n*** Test Exitoso ***\n");
    }

    @Test
    public void given_user_when_wrong_premiarFidelidad_then_ok() {
        b = new Bonus();
        tdd = new Usuario("test","", new Cliente("",2,"",
                "","Mensual"));
        b.premiarFidelidad(tdd);

        System.out.print("\nTEST #8\n");
        assertTrue("Variable días extra tiene valor",tdd.getBono().getDiaExtra()==1);
        System.out.print("Variable días extra vacío");
        System.out.print("\n*** Test Exitoso ***\n");
    }
}