public class Sistem {
    public static void main(String[] args) throws Exception {
        Gerente gerente = new Gerente("Alice", "alice@sistem.com", "password123" );  
        Vendedor vendedor = new Vendedor("Bob", "bob@sistem.com", "password456");
        Atendente atendente = new Atendente("John", "john@sistem.com", "password789");

             

        vendedor.realizarLogin();
        vendedor.exibirInfo();
        vendedor.registrarVenda();
        vendedor.consultarVendas();
        vendedor.realizarLogout();
                
        System.out.println();


        atendente.realizarLogin();
        atendente.exibirInfo();
        atendente.receberPagamento();
        
        atendente.realizarLogout();

        System.out.println();

        gerente.realizarLogin();
        gerente.gerarRelatorio();
        gerente.exibirInfo();
        gerente.consultarVendas(atendente);
        
        
       
        

    }
}
