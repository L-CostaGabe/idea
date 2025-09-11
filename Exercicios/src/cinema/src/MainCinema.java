public class MainCinema {
    public static void main(String[] args) throws Exception {
        
        Ingresso ingresso1 = new Ingresso(20.0, "Inception", false);
        System.out.println(ingresso1);
        
        MeiaEntrada meia1 = new MeiaEntrada(20.0, "Inception", true);
        System.out.println(meia1);
        
        IngressoFamilia familia1 = new IngressoFamilia(20.0, "Inception", false, 4);
        System.out.println(familia1);
    
    }
}
