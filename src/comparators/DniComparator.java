/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparators;

import modelo.Cliente;
import java.util.Comparator;

/**
 *
 * @author Nicolas Cardellini
 */
public class DniComparator implements Comparator<Cliente> {

    @Override
    public int compare(Cliente c1, Cliente c2) {
        if (c1.getDni() < c2.getDni()) {
            return -1;
        } else if (c1.getDni() > c2.getDni()) {
            return 1;
        } else {
            return 0;
        }
    }

}
