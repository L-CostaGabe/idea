public class Vendedor extends Usuario {

    private int quantidadeVendas;

    public Vendedor(String nome, String email, String senha) {
        super(nome, email, senha, false);
    }

    public int getQuantidadeVendas() {
        return quantidadeVendas;
    }

    public void registrarVenda() {
        quantidadeVendas++;
        System.out.println("Venda registrada com sucesso pelo vendedor: " + nome);
    }

    public void consultarVendas() {
        System.out.println("Total de vendas realizadas por " + nome + ": " + quantidadeVendas);
    }

}

//Testando janela