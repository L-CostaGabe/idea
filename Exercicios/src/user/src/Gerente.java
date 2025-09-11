public class Gerente extends Usuario {
    
    public Gerente(String nome, String email, String senha) {
        super(nome, email, senha, true);
    }

    public void gerarRelatorio() {
        System.out.println("Relatório gerado com sucesso pelo gerente: " + nome);
    }
    public void consultarVendas(Atendente atendente) {
        System.out.println("Consultando vendas...");
        System.out.println("Total de vendas realizadas pelo atendente " + atendente.getNome() + ": " + atendente.getValorCaixa());
    }

}
