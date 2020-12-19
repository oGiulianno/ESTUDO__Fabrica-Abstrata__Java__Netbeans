/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabricasconcretas;

import produtos.Sorvete_Morango;
import produtos.Sorvete_Chocolate;
import interfaces.Produto;
import fabricas.Fabrica_Abstrata;

/**
 *
 * @author Giu
 */
public class Marca_Creme_Mel  extends Fabrica_Abstrata {
    
    //Metodos
    public Marca_Creme_Mel(){
        marca = "Creme Mel";
    }
    public Object[] getListaDeProdutos(){
        Object[] lista = {"Sorvete de Morango","Sorvete de Chocolate"};
        return lista;
    }
    @Override
    public Produto getProduto( String modelo ) { 
        if( modelo == null ) {
            return null; 
        }
        else if( modelo.equals("Sorvete de Morango") ) { 
            return new Sorvete_Morango();
        }
        else if( modelo.equals("Sorvete de Chocolate") ) {
            return new Sorvete_Chocolate(); 
        }
        else {  return null;} 
    }
    
}
