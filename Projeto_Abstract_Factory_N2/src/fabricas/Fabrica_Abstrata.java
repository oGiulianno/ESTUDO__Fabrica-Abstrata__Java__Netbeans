/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabricas;

import fabricasconcretas.Marca_Ki_Suco;
import fabricasconcretas.Marca_Creme_Mel;
import interfaces.Produto;
import fabricasconcretas.Marca_Nestle;

/**
 *
 * @author Giu
 */
public abstract class Fabrica_Abstrata {
    
    //Atributos
    protected String marca;
    
    public static Object[] getListaDeFabricas(){
        Object[] lista = {"Ki Suco","Creme Mel","Nestle"};
        return lista;
    }
    public String getMarca(){return marca;}
    public abstract Object[] getListaDeProdutos();
    public abstract Produto getProduto(String produto);
    public static Fabrica_Abstrata getInstance( String marca ) { 
        if( marca == null ) {
            return null; 
        }
        else if(marca.equals("Ki Suco")) { 
            return new Marca_Ki_Suco();
        }
        else if(marca.equals("Creme Mel")) {
            return new Marca_Creme_Mel(); }
        else if(marca.equals("Nestle")) {
                return new Marca_Nestle();
        }
        else {return null;}
    }
    
}
