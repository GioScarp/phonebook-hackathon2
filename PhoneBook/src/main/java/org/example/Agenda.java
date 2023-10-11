package org.example;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private List<Contacto> contactos;

    public Agenda() {
        contactos = new ArrayList<Contacto>();
    }
    public Agenda(List<Contacto> contactos) {
        this.contactos = contactos;
    }

    public void addContacto(Contacto contacto) {
        if(isExistContacto(contacto.getNombre())){
            System.out.println("Contacto ya existe");
        }else {
            contactos.add(contacto);
            System.out.println("Contacto agregado exitosamente");
        }
    }


    public boolean isExistContacto(String nombreContacto){

        for (Contacto contacto : contactos) {
            if(contacto.getNombre().equalsIgnoreCase(nombreContacto)){
                return true;
            }
        }
        return false;
    }


    public void listarContactos(){
        for (Contacto contacto: contactos) {
            System.out.println(contacto.toString());
        }
    }


    public void buscarContacto(){

    }

    public void eliminar(){

    }

    public void agendaLlena(){

    }

    public void espacios(){

    }
}
