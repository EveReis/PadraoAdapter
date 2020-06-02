package atividadeadapter;

public class MainClass {

    public static void main(String[] args) {
        
        System.out.println("==== TESTE NO COMPUTADOR ====\n");
        
        Dispositivo d = new Computador();
        
        d.pesquisaFilme();
        d.carregaFilme();
        d.assisteFilme();
        
         System.out.println("\n==== TESTE NA SMARTTV ====\n");
        
        d = new AdaptadorSmartTV();
        
        
        
        d.pesquisaFilme();
        d.carregaFilme();
        d.assisteFilme();
        
        
    }
    
}
