package org.jhonatan.archivos.ejemplos;

import org.jhonatan.archivos.ejemplos.servicio.ArchivoServicio;

public class EjemploLeerArchivo {
    public static void main(String[] args) {
        ArchivoServicio servicio = new ArchivoServicio();

        // llamamos al metodo leer archivo y le pasamos la ruta
        System.out.println(servicio.leerArchivos02("C:\\Users\\User\\Desktop\\miPrimerArchivo.txt"));

    }
}
