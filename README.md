# 📘 README — Sesión 06 · Pruebas Unitarias con JUnit 5

## 📌 Descripción general

Este repositorio contiene la resolución completa de los **7 ejercicios** de la Sesión 06, centrados en:

- Implementación de métodos en Java  
- Pruebas unitarias con **JUnit 5**  
- Tests parametrizados  
- Carga de datos desde **archivos CSV**  
- Cobertura del **100%** en cada ejercicio  
- Manejo de valores límite y casos especiales  

Cada ejercicio está organizado en su propio paquete dentro de `src/main/java`, con sus pruebas correspondientes en `src/test/java`.

---

## 📂 Estructura del proyecto
src/
├── main/
│    ├── java/ual/hmis/sesion06/
│    │      ├── ejercicio1/
│    │      ├── ejercicio2/
│    │      ├── ejercicio3/
│    │      ├── ejercicio4/
│    │      ├── ejercicio5/
│    │      ├── ejercicio6/
│    │      └── ejercicio7/
│    └── resources/
│           └── texto.txt
│
└── test/
├── java/ual/hmis/sesion06/
│      ├── ejercicio1/
│      ├── ejercicio2/
│      ├── ejercicio3/
│      ├── ejercicio4/
│      ├── ejercicio5/
│      ├── ejercicio6/
│      └── ejercicio7/
└── resources/
├── mezcla.csv
├── contador.csv
├── temperaturas.csv
└── arrays.csv


---

## 🧪 Resumen de ejercicios

### **Ejercicio 1–3**
Implementación de métodos básicos y pruebas unitarias con JUnit 5.

---

### **Ejercicio 4 — Mezcla lineal**
- Mezcla dos listas ordenadas en una sola lista ordenada.  
- Considera listas vacías, listas con elementos y duplicados.  
- Tests parametrizados con CSV cubriendo todas las combinaciones del enunciado.

---

### **Ejercicio 5 — Contador de palabras**
- Lectura de un archivo de texto (`texto.txt`).  
- Generación de una lista ordenada alfabéticamente.  
- Generación de una lista ordenada por frecuencia.  
- Tests parametrizados con CSV.

---

### **Ejercicio 6 — Conversión de temperatura**
- Conversión entre Celsius, Fahrenheit y Kelvin.  
- Manejo de unidades inválidas devolviendo `Double.NaN`.  
- Tests parametrizados con CSV incluyendo valores límite.

---

### **Ejercicio 7 — Aleatorización de arrays**
- Implementación del algoritmo **Fisher‑Yates**.  
- Implementación alternativa de aleatorización.  
- Tests parametrizados con CSV.  
- Manejo correcto del caso límite: arrays de un solo elemento.

---

## ✔️ Requisitos cumplidos

- [x] Código Java organizado por ejercicios  
- [x] JUnit 5 configurado  
- [x] Tests parametrizados  
- [x] Archivos CSV incluidos  
- [x] Cobertura del 100%  
- [x] Manejo de valores límite  
- [x] Proyecto completo y estructurado  
