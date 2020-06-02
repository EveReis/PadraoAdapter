
package atividadeadapter;


public class Computador implements Dispositivo{

    @Override
    public void carregaFilme() {
        System.out.println("Carregando o filme.");
    }

    @Override
    public void pesquisaFilme() {
        System.out.println("Pesquisando o filme.");
        
    }

    @Override
    public void assisteFilme() {
        System.out.println("Iniciando o filme.");
    }
    
    
}
