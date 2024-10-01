package org.jhonatan.archivos.ejemplos;

import org.jhonatan.archivos.ejemplos.servicio.ArchivoServicio;

public class EjemploCrearArchivos {
    public static void main(String[] args) {
        System.out.println("CREANDO ARCHIVOS CON JAVA");

        // le pamos la ruta
        String nombreArchivo = "C:\\Users\\User\\Desktop\\miPrimerArchivo.txt";

        // instancia de ArchivoServicio
        ArchivoServicio service = new ArchivoServicio();
        service.crearArchivo03(nombreArchivo);
    }
}
