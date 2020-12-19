/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package produtos;

import interfaces.Produto;

/**
 *
 * @author Giu
 */
public class Sabor_Uva  implements Produto {
    
    //Atributos
    String nome = "Sabor Uva";
    String descricao = "Suco Ki-Suco de Sabor Uva";
    float preco = (float)(0.50);
    
    //Metodos
    @Override
    public String getNome(){return nome;}
    @Override
    public String getDescricao(){return descricao;}
    @Override
    public float getPreco(){return preco;}
    
}
