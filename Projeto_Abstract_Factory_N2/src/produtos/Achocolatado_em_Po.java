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
public class Achocolatado_em_Po implements Produto {
    
    //Atributos
    String nome = "Achocolatado em Po";
    String descricao = "Achocolatado em Po da Marca Nestle";
    float preco = (float)(8.50);
    
    //Metodos
    @Override
    public String getNome(){return nome;}
    @Override
    public String getDescricao(){return descricao;}
    @Override
    public float getPreco(){return preco;}
}
