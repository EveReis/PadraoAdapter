/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividadeadapter;

/**
 *
 * @author samue
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("--- TESTE DO COMPUTADOR ---\n");
        
        Dispositivo d = new Computador();
        
        d.pesquisarFilme();
        d.carregarFilme();
        d.assistirFilme();
        
         System.out.println("\n--- TESTE DA SMARTTV ---\n");
        
        d = new AdaptadorSmartTV();
        
        
        
        d.pesquisarFilme();
        d.carregarFilme();
        d.assistirFilme();
        
        
    }
    
}
