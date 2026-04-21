package ual.hmis.sesion06.ejercicio01;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ParameterizedTests {

    @ParameterizedTest(name = "{index} => Con entrada ({0}) sale {1}")
    @CsvSource({
        "2, 1",
        "5, 1",
        "6, 1",
        "14, 7"
    })
    void testTransformar(int input, int expected) {
        Ejercicio01 c = new Ejercicio01();
        assertEquals(expected, c.transformar(input));
    }
}