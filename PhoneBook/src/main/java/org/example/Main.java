package org.example;

import java.awt.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Aplicación PHONEBOOK
        aplicacion();

    }

    //Aplicación

    public static void aplicacion() {
        Agenda miAgenda = new Agenda();
        Scanner input = new Scanner(System.in);

        boolean ejecutandoApp = true;

        while (ejecutandoApp){

            menu();

            // Variable que almacenará la opción que elija el usuario del menu
            int opcion = input.nextInt();
            input.nextLine();

            // Controla el caso que se realizará dependiendo de la opción que el usuario elija
            switch (opcion) {
                case 1:
                    // Se piden los datos al usuario para crear un contacto
                    System.out.println("Ingrese el nombre y apellido del contacto: ");
                    String nombre = input.nextLine();
                    System.out.println("=========================");
                    System.out.println("Ingrese el número del contacto: ");
                    String numero = input.nextLine();

                    //Se crea un nuevo contacto
                    Contacto nuevoContacto = new Contacto(nombre, numero);
                    //Se llama el método de añadir el contacto de Agenda
                    miAgenda.addContacto(nuevoContacto);
                    break;
                case 2:
                    miAgenda.listarContactos();
                    break;
                case 3:
                    // Se piden los datos al usuario para buscar el contacto
                    System.out.println("Ingrese nombre del contacto a buscar: ");
                    String nombreBuscar = input.nextLine();
                    //Se llama el método de buscar contacto de Agenda
                    miAgenda.buscarContacto(nombreBuscar);
                    break;
                case 4:
                    // Se piden los datos al usuario para eliminar el contacto
                    System.out.println("Ingrese nombre del contacto a eliminar: ");
                    String nombreEliminar = input.nextLine();

                    //Se alamcaena en una variable el contacto encontrado
                    Contacto contactoEcontado = miAgenda.buscarContacto(nombreEliminar);

                    // Se evalua si el contacto existe
                    if(contactoEcontado != null){
                        //Se llama el método de buscar contacto de Agenda
                        miAgenda.eliminarContacto(contactoEcontado);
                    }

                    break;
                case 5:
                    // Se muestra la cantidad de contactos que hay en la agenda
                    System.out.println("Tienes almacenados " + miAgenda.cantidadContactos() + " contactos :) " );
                    break;
                case 6:
                    //Se finaliza el programa
                    System.out.println("¡Hasta luego!");
                    ejecutandoApp = false;
                    break;
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
            }

            System.out.println();
        }
    }

    //Método que muestra el menu de la aplicación
    public static void menu(){
        System.out.println("======= BIENVENIDO A TU PHONEBOOK ===========");
        System.out.println("=============================================");
        System.out.println("1) Agregar un contacto nuevo");
        System.out.println("2) Mostrar lista de contactos");
        System.out.println("3) Buscar un contacto");
        System.out.println("4) Eliminar un contacto");
        System.out.println("5) Tamaño de mi agenda");
        System.out.println("6) Salir de la aplicación");
        System.out.println("==============================");
        System.out.println("Elija una opción: ");

    }
}