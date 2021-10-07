/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaestrategia;

import estrategias.OrdenarPorNombre;
import modelo.OrdenarListado;
import comparators.NombreComparator;
import estrategias.OrdenarPorDni;
import modelo.Cliente;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Nicolas Cardellini
 */
public class PruebaEstrategia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Cliente> clientes = new ArrayList<>();
        clientes.add(new Cliente("jorge", "perez", 43551376));
        clientes.add(new Cliente("andres", "perez", 38346848));
        clientes.add(new Cliente("mariano", "perez", 20051297));
        clientes.add(new Cliente("camila", "perez", 545));

        OrdenarListado o = new OrdenarListado(new OrdenarPorNombre());
        o.ejecutarEstrategia(clientes);
        for (Cliente cliente : clientes) {
            System.out.println(cliente.getNombre() + " " + cliente.getDni());
        }

    }

}
