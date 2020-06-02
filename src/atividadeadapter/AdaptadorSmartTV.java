package atividadeadapter;

public class AdaptadorSmartTV extends SmartTV implements Dispositivo{

    @Override
    public void carregaFilme() {
        this.carregaAplicacoes();
        System.out.println("Carregando o filme.");
    }

    @Override
    public void pesquisaFilme() {
        this.verificaRede();
        System.out.println("Pesquisando o filme.");
    }

    @Override
    public void assisteFilme() {
        this.verificaRede();
        System.out.println("Iniciando o filme.");
        
    }
    
    
    
}
