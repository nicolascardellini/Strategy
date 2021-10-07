/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import modelo.Cliente;
import java.util.ArrayList;

/**
 *
 * @author Nicolas Cardellini
 */
//INTERFACE ESTRATEGIA
public interface EstrategiaOrdenamiento {

    public ArrayList<Cliente> ordenar(ArrayList<Cliente> cli);
}
