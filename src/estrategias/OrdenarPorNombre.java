/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estrategias;

import comparators.DniComparator;
import modelo.EstrategiaOrdenamiento;
import comparators.NombreComparator;
import modelo.Cliente;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author Nicolas Cardellini
 */
//ESTRATEGIA 1
public class OrdenarPorNombre implements EstrategiaOrdenamiento {

    @Override
    public ArrayList<Cliente> ordenar(ArrayList<Cliente> clientes) {
        Collections.sort(clientes, new NombreComparator());
        Collections.reverse(clientes);
        return clientes;

    }
}
