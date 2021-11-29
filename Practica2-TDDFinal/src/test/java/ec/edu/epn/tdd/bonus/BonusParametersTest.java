package ec.edu.epn.tdd.bonus;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.*;

import static org.junit.Assert.*;

@RunWith(value = Parameterized.class)
public class BonusParametersTest {

    private String membresia;
    private double precio, expected;

    @Parameterized.Parameters
    public static Iterable<Object[]> parameters() {
        List<Object[]> objects = new ArrayList<Object[]>();
        objects.add(new Object[]{"Anual", 100, 80});
        objects.add(new Object[]{"Mensual", 100, 90});
        objects.add(new Object[]{"Anual", 200, 160});
        objects.add(new Object[]{"Mensual", 200, 180});
        objects.add(new Object[]{"Anual", 300, 240});

        return objects;
    }

    public BonusParametersTest(String membresia, double precio, double descuento){
        this.membresia = membresia;
        this.precio = precio;
        this.expected = descuento;
    }

    @Test
    public void given_string_and_two_doubles_when_calcularDescuento_then_ok(){
        Bonus b = new Bonus();
        double actual = b.aplicarDescuento(membresia,precio);

        assertTrue("Error al aplicar descuento",expected == actual);
    }

}