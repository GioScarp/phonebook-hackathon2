package org.example;

public class Main {
    public static void main(String[] args) {
        Agenda miAgenda = new Agenda();

        Contacto Gabi = new Contacto("Gabriela Aguiar", "3212156648");

        miAgenda.addContacto(Gabi);

        Contacto Gabi2 = new Contacto("GABRIELA AGUIAR", "32121");

        miAgenda.addContacto(Gabi2);

        Contacto Valen = new Contacto("Valentina Acevedo", "321215454");

        Contacto Gisell = new Contacto("Gisell Vanegas", "3245464454");

        miAgenda.addContacto(Valen);
        miAgenda.addContacto(Gisell);

        miAgenda.listarContactos();

    }

    public static void menuAgenda() {


    }
}