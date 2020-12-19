/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabricas;

import interfaces.Produto;
import javax.swing.JOptionPane;

/**
 *
 * @author Giu
 */
public class Projeto_Abstract_Factory_N2 {

    /**
     * @param args the command line arguments
     */
    
    public static void imprimir(Produto obj, String marca){
        String saida = "Marca: " + marca + "\n";
        saida += "Produto: " + obj.getNome() + "\n";
        saida += "Descrição" + obj.getDescricao() + "\n";
        saida += "Preco: R$ " + obj.getPreco();
        JOptionPane.showMessageDialog(null, saida);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        boolean controle1 = true;
        Object tipoDaFabrica;
        Object[] opcoesDeFabricas = Fabrica_Abstrata.getListaDeFabricas();
        do{
            tipoDaFabrica = JOptionPane.showInputDialog(null,
                                "Escolha uma Marca",
                                "Projeto Fabrica",
                                JOptionPane.PLAIN_MESSAGE,
                                null,opcoesDeFabricas,
                                opcoesDeFabricas[2]);
            
            Fabrica_Abstrata objFabricaAbstrata = Fabrica_Abstrata.getInstance(tipoDaFabrica.toString());
            
            String fabrica = objFabricaAbstrata.getMarca();
            boolean controle2 = true;
            Object objetoDoProduto;
            Object[] opcoesDeProdutos = objFabricaAbstrata.getListaDeProdutos();
            do{
                objetoDoProduto = JOptionPane.showInputDialog(null,
                                "Escolha um Produto",
                                "Projeto Fabrica",
                                JOptionPane.PLAIN_MESSAGE,
                                null,opcoesDeProdutos,
                                opcoesDeProdutos[0]);
            if(objetoDoProduto==null) controle2=false;
            else{
                Produto objetoProduto = objFabricaAbstrata.getProduto(objetoDoProduto.toString());
                imprimir(objetoProduto, fabrica);
            }
           }while(controle2); 
            
        }while(controle1);
        
        
    }
    
}
