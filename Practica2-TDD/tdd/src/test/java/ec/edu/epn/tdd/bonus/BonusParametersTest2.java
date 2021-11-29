package ec.edu.epn.tdd.bonus;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.*;

import static org.junit.Assert.*;

@RunWith(value = Parameterized.class)
public class BonusParametersTest2 {
    private String membresia;
    private String expected;
    private int index;

    ArrayList<Usuario> test = new ArrayList<Usuario>();

    @Parameterized.Parameters
    public static Iterable<Object[]> parameters() {
        List<Object[]> objects = new ArrayList<Object[]>();
        objects.add(new Object[]{1, "Proteina"});
        objects.add(new Object[]{2, "PreEntreno"});
        objects.add(new Object[]{3, "Creatina"});

        return objects;
    }

    public BonusParametersTest2(int index, String expected) {
        this.index = index;
        this.expected = expected;
    }

    @Test
    public void given_interger__when_ofrecerSuplemento_then_ok() {
        Bonus b = new Bonus();
        Usuario tdd = new Usuario();

        b.ofrecerSuplementos(tdd,index,"Anual");
        String actual = tdd.getBono().getSuplemento().getTipo();

        assertEquals("Error al asignar suplemento",expected,actual);
    }

}