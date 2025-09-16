package org.example;

public class Cliente {
    private String nombre;
    private String email;
    private String telefono;

    //constructor
    public Cliente(String nombre, String email, String telefono) {
        this.nombre = nombre;
        this.email = email;
        this.telefono = telefono;
    }

    //getters
    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefono() {
        return telefono;
    }

    //para mostrar al cliente
    @Override
    public String toString() {
        return nombre + " " + email + " " + telefono;
    }

}
