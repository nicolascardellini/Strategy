/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import modelo.EstrategiaOrdenamiento;
import modelo.Cliente;
import java.util.ArrayList;

/**
 *
 * @author Nicolas Cardellini
 */
//CONTEXTO
public class OrdenarListado {

    private EstrategiaOrdenamiento estrategia;

    public OrdenarListado(EstrategiaOrdenamiento estrategia) {
        this.estrategia = estrategia;
    }

    public ArrayList<Cliente> ejecutarEstrategia(ArrayList<Cliente> clientes) {
        return estrategia.ordenar(clientes);
    }
}
