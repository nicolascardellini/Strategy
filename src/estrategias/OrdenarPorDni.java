/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estrategias;

import modelo.EstrategiaOrdenamiento;
import comparators.DniComparator;
import modelo.Cliente;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Nicolas Cardellini
 */
//ESTRATEGIA 2
public class OrdenarPorDni implements EstrategiaOrdenamiento {

    @Override
    public ArrayList<Cliente> ordenar(ArrayList<Cliente> clientes) {
        Collections.sort(clientes, new DniComparator());
        return clientes;
    }
}
