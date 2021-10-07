/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Nicolas Cardellini
 */
public class Cliente implements Comparable<Cliente> {

    private String nombre;
    private String apellido;
    private long dni;

    public Cliente(String nombre, String apellido, int dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public long getDni() {
        return dni;
    }

    @Override
    public int compareTo(Cliente cli) {
        if (this.dni > cli.getDni()) {
            return -1;
        } else if (this.dni > cli.getDni()) {
            return 1;
        } else {
            return 0;
        }
    }

}
