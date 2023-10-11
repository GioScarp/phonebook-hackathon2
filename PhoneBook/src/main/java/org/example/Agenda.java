package org.example;

import java.util.ArrayList;
import java.util.List;

public class Agenda {

    // Atributo para almcacenar la lista de contactos
    private List<Contacto> contactos;

    //Constructor de Agenda
    public Agenda() {
        contactos = new ArrayList<Contacto>();
    }


    /**
     * Agrega un nuevo contacto a la agenda telefónica si el contacto no existe previamente.
     * Imprime un mensaje indicando si el contacto se ha agregado con éxito o si ya existe.
     *
     * @param contacto El objeto Contacto que se va a agregar.
     */
    public void addContacto(Contacto contacto) {
        // Comprueba si el contacto ya existe en la agenda por su nombre.
        if (isExistContacto(contacto.getNombre())) {
            System.out.println("El contacto ya existe en la agenda.");
        } else {
            // Agrega el nuevo contacto a la lista de contactos.
            contactos.add(contacto);
            System.out.println("Contacto agregado exitosamente.");
        }
    }


    /**
     * Comprueba si un contacto con el nombre especificado ya existe en la agenda telefónica.
     *
     * @param nombreContacto El nombre del contacto que se va a comprobar.
     * @return `true` si el contacto con el nombre especificado ya existe en la agenda, `false` en caso contrario.
     */
    public boolean isExistContacto(String nombreContacto) {
        for (Contacto contacto : contactos) {
            // Compara el nombre del contacto (ignorando mayúsculas y minúsculas) con el nombre especificado.
            if (contacto.getNombre().equalsIgnoreCase(nombreContacto)) {
                return true; // El contacto ya existe en la agenda.
            }
        }
        return false; // El contacto no existe en la agenda.
    }


    /**
     * Imprime en la consola la lista de contactos en la agenda telefónica.
     * Cada contacto se muestra en formato de cadena utilizando su método toString().
     */
    public void listarContactos() {
        for (Contacto contacto : contactos) {
            System.out.println(contacto.toString());
        }
    }

    /**
     * Busca un contacto en la agenda telefónica por su nombre.
     *
     * @param nombre El nombre del contacto a buscar.
     * @return El objeto Contacto si se encuentra, o null si el contacto no se encuentra en la agenda.
     */
    public Contacto buscarContacto(String nombre) {
        for (Contacto contacto : contactos) {
            if (contacto.getNombre().equalsIgnoreCase(nombre)) {
                System.out.println("Contacto encontrado:");
                System.out.println(contacto.toString());
                return contacto; // Contacto encontrado, se devuelve.
            }
        }

        System.out.println("Contacto no encontrado");
        return null; // Contacto no encontrado, se devuelve null.
    }


    /**
     * Elimina un contacto de la agenda telefónica.
     *
     * @param contacto El contacto que se va a eliminar.
     */
    public void eliminarContacto(Contacto contacto) {
        if (contactos.remove(contacto)) {
            System.out.println("Contacto eliminado con éxito.");
        } else {
            System.out.println("No se pudo eliminar el contacto. El contacto no existe en la agenda.");
        }
    }


    /**
     * Obtiene la cantidad de contactos en la agenda telefónica.
     *
     * @return La cantidad de contactos en la agenda.
     */
    public int cantidadContactos() {
        return contactos.size();
    }

}
