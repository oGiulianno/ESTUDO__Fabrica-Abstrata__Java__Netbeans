/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabricasconcretas;

import produtos.Bombom;
import produtos.Achocolatado_em_Po;
import interfaces.Produto;
import fabricas.Fabrica_Abstrata;

/**
 *
 * @author Giu
 */
public class Marca_Nestle extends Fabrica_Abstrata {
    
    //Metodos
    public Marca_Nestle(){
        marca = "Nestle";
    }
    public Object[] getListaDeProdutos(){
        Object[] lista = {"Bombom","Achocolatado em Po"};
        return lista;
    }
    @Override
    public Produto getProduto( String modelo ) { 
        if( modelo == null ) {
            return null; 
        }
        else if( modelo.equals("Bombom") ) { 
            return new Bombom();
        }
        else if( modelo.equals("Achocolatado em Po") ) {
            return new Achocolatado_em_Po(); 
        }
        else {  return null;} 
    }
    
}
