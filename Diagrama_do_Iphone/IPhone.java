
public class IPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorDeInternet {
    
	// Implementação dos métodos da interface ReprodutorMusical
    public void reproduzirMusica() {
        System.out.println("Reproduzindo musica...");
    }

    public void pausarMusica() {
        System.out.println("Música parada.");
    }

    public void pularMusica() {
    	System.out.println("Pulando a música...");
    }
    
    public void voltarMusica() {
    	System.out.println("Pulando a música...");
    }

    public void selecionarMusica() {
    	System.out.println("Selecionando a música...");
    }

 // Implementação dos métodos da interface AparelhoTelefonico
    public void fazerChamada(int numero) {
    	System.out.println("Ligando para o número " + numero);
    }

    public void receberChamada(int numero) {
    	System.out.println(numero + " Está ligando...");
    }

    public void encerrarChamada() {
    	System.out.println("Chamada encerrada.");
    }
    
    public void iniciarCorreioDeVoz() {
    	System.out.println("Você tem uma mensagem!");
    }

 // Implementação dos métodos da interface NavegadorInternet
    public void exibirPagina(String url) {
    	System.out.println("Exibindo a página...");
    }

    public void fecharPaginaWeb() {
    	System.out.println("fechando a página...");
    }

    public void adicionarNovaAba() {
        System.out.println("Abrindo nova aba...");
    }

    public void atualizarPagina() {
        System.out.println("Página atualizada.");
    }
    
}
