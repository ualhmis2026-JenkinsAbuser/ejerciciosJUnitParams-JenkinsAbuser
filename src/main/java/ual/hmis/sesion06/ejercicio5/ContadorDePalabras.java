package ual.hmis.sesion06.ejercicio5;

import java.io.*;
import java.nio.file.*;
import java.util.*;

public class ContadorDePalabras {

    private List<String> leerArchivo() {
        try {
            Path ruta = Paths.get("src/main/resources/texto.txt");
            return Files.readAllLines(ruta);
        } catch (IOException e) {
            throw new RuntimeException("Error leyendo archivo", e);
        }
    }

    public List<String> palabrasOrdenAlfabetico() {
        List<String> lineas = leerArchivo();
        List<String> palabras = new ArrayList<>();

        for (String linea : lineas) {
            palabras.addAll(Arrays.asList(linea.split("\\s+")));
        }

        Collections.sort(palabras);
        return palabras;
    }

    public List<String> palabrasPorFrecuencia() {
        List<String> lineas = leerArchivo();
        Map<String, Integer> contador = new HashMap<>();

        for (String linea : lineas) {
            for (String palabra : linea.split("\\s+")) {
                contador.put(palabra, contador.getOrDefault(palabra, 0) + 1);
            }
        }

        List<String> resultado = new ArrayList<>(contador.keySet());

        resultado.sort((a, b) -> contador.get(b) - contador.get(a));

        return resultado;
    }
}
