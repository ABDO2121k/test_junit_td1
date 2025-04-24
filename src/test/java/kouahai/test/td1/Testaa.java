package kouahai.test.td1;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class Testaa {

    @Test
    public void testAddition() {
        Assertions.assertEquals(9, Calculatrice.addition(2, 7));
    }

    @Test
    public void testSoustraction() {
        Assertions.assertEquals(5, Calculatrice.soustraction(7, 2));
    }

    @Test
    public void testMultiplication() {
        Assertions.assertEquals(14, Calculatrice.multiplication(2, 7));
    }

    @Test
    public void testDivision() {
        Assertions.assertEquals(3.5, Calculatrice.division(7, 2));
    }

    @Test
    public void testDivisionParZero() {
        Assertions.assertThrows(ArithmeticException.class, () -> {
            Calculatrice.division(7, 0);
        });
    }

}
