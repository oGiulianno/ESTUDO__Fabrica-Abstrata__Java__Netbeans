/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabricasconcretas;

import produtos.Sabor_Uva;
import produtos.Sabor_Laranja;
import interfaces.Produto;
import fabricas.Fabrica_Abstrata;

/**
 *
 * @author Giu
 */
public class Marca_Ki_Suco extends Fabrica_Abstrata {
    
    //Metodos
    public Marca_Ki_Suco(){
        marca = "Ki-Suco";
    }
    public Object[] getListaDeProdutos(){
        Object[] lista = {"Sabor Uva","Sabor Laranja"};
        return lista;
    }
    @Override
    public Produto getProduto( String modelo ) { 
        if( modelo == null ) {
            return null; 
        }
        else if( modelo.equals("Sabor Uva") ) { 
            return new Sabor_Uva();
        }
        else if( modelo.equals("Sabor Laranja") ) {
            return new Sabor_Laranja(); 
        }
        else {  return null;} 
    }
    
}
