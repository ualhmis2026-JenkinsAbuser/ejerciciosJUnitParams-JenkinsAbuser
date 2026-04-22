package ual.hmis.sesion06.ejercicio5;

import static org.junit.jupiter.api.Assertions.*;
import java.util.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.api.Test;

class ContadorDePalabrasTest {

    @ParameterizedTest
    @CsvFileSource(resources = "/contador.csv", delimiter = ';')
    void testContador(String tipo, String esperado) {
        ContadorDePalabras c = new ContadorDePalabras();

        List<String> resultado;

        if (tipo.equals("alfabetico"))
            resultado = c.palabrasOrdenAlfabetico();
        else
            resultado = c.palabrasPorFrecuencia();

        assertEquals(esperado, resultado.toString());
    }
}
