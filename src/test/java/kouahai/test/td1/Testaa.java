package kouahai.test.td1;


import org.junit.jupiter.api.Test;
import  org.junit.jupiter.api.Assertions;

public class Testaa {

    @Test
    public void testAddition() {
        Assertions.assertEquals(5, Calculatrice.addition(2, 3));
    }

}
