package org.jhonatan.archivos.ejemplos.servicio;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

public class ArchivoServicio {
    public void crearArchivo(String nombre) {
        File archivo = new File(nombre);

        try {
            FileWriter escritor = new FileWriter(archivo, true);// true para conservar lo escrito

            // escribimos
            escritor.append("Hola que tal Amigos.")
                    .append("Todo Bien? yo aca escribiendo un archivo....\n")
                    .append("Hasta luego Lucas!...\n");
            escritor.close();
            System.out.println("El archivo se ah creado con exito...");

        } catch (Exception e) {
            System.out.println("Error al crear archivo: " + e.getMessage());
        }
    }

    public void crearArchivo02(String nombre) {
        File archivo = new File(nombre);

        try {
            FileWriter escritor = new FileWriter(archivo, true);// true para conservar lo escrito si tiene contenido
                                                                // agrega nuevo contenido

            BufferedWriter buffer = new BufferedWriter(escritor);

            // escribimos
            buffer.append("Hola que tal Amigos!.\n")
                    .append("Todo Bien? yo aca escribiendo un archivo....\n")
                    .append("Hasta luego Lucas!...\n");
            buffer.close();
            System.out.println("El archivo se ah creado con exito...");

        } catch (Exception e) {
            System.out.println("Error al crear archivo: " + e.getMessage());
        }
    }

    public void crearArchivo03(String nombre) {
        File archivo = new File(nombre);

        try (BufferedWriter buffer = new BufferedWriter(new FileWriter(archivo, true))) {
            // escribimos
            buffer.append("Hola que tal Amigos!.\n")
                    .append("Todo Bien? yo aca escribiendo un archivo....\n")
                    .append("Hasta luego Lucas!...\n");
            System.out.println("El archivo se ah creado con exito...");

        } catch (Exception e) {
            System.out.println("Error al crear archivo: " + e.getMessage());
        }
    }

    public void crearArchivo04(String nombre) {
        File archivo = new File(nombre);

        try (PrintWriter buffer = new PrintWriter(new FileWriter(archivo, true))) {
            // escribimos en el archivo
            buffer.println("Hola que tal Amigos!.\n");
            buffer.println("Todo Bien? yo aca escribiendo un archivo....\n");

            buffer.println("Hasta luego Lucas!...\n");
            buffer.printf("Hasta luego %s", "jhonatan");

            System.out.println("El archivo se ah creado con exito...");
        } catch (Exception e) {
            System.out.println("Error al crear archivo: " + e.getMessage());
        }
    }
}
