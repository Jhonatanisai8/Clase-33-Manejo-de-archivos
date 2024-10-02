package org.jhonatan.archivos.ejemplos.servicio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.*;

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

    public String leerArchivos(String nombre) {

        StringBuilder sb = new StringBuilder();
        File archivo = new File(nombre);
        try {
            FileReader lectura = new FileReader(archivo);
            BufferedReader reader = new BufferedReader(lectura);
            String linea;
            while ((linea = reader.readLine()) != null) {
                sb.append(linea).append("\n");
            }

            reader.close();
        } catch (Exception e) {
            System.out.println("Error al leer archivo: " + e.getMessage());
        }
        return sb.toString();

    }

    public String leerArchivos02(String nombre) {

        StringBuilder sb = new StringBuilder();
        File archivo = new File(nombre);
        try {
            Scanner leer = new Scanner(archivo);
            // limitador
            leer.useDelimiter("\n");

            while (leer.hasNext()) {
                sb.append(leer.next()).append("\n");
            }
            leer.close();
        } catch (Exception e) {
            System.out.println("Error al leer archivo: " + e.getMessage());
        }
        return sb.toString();

    }

}
