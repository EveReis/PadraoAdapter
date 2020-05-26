
package atividadeadapter;

public class AdaptadorSmartTV extends SmartTV implements Dispositivo{

    @Override
    public void carregarFilme() {
        this.carregarAplicacoes();
        System.out.println("Carregando filme...");
    }

    @Override
    public void pesquisarFilme() {
        this.verificarRede();
        System.out.println("Pesquisando filme");
    }

    @Override
    public void assistirFilme() {
        this.verificarRede();
        System.out.println("Iniciando filme.");
        
    }
    
    
    
}
