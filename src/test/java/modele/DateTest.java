package modele;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DateTest {
    @Test
    @Order(1)
    void estBissextile() {
        System.out.println("Test méthode estBissextile");
        assertTrue(Date.estBissextile(2400));
        assertTrue(Date.estBissextile(2016));
        assertFalse(Date.estBissextile(2100));
        assertFalse(Date.estBissextile(2017));

    }
}