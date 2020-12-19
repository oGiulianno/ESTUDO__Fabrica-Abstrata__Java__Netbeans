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
public class Bombom implements Produto {
    
    //Atributos
    String nome = "Bombom";
    String descricao = "Bombom da marca Nestle";
    float preco = (float)(5.99);
    
    //Metodos
    @Override
    public String getNome(){return nome;}
    @Override
    public String getDescricao(){return descricao;}
    @Override
    public float getPreco(){return preco;}
}
