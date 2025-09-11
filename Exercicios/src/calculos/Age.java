package calculos;
import java.time.OffsetDateTime;
import java.util.Scanner;

public class Age {
    
  
    public static void main(String[] args) throws Exception {
        String name;
        int year;
        var baseYear = OffsetDateTime.now().getYear();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Insira seu nome: ");
        name = scanner.nextLine();

        System.out.print("Insira seu ano de nascimento: ");
        year = scanner.nextInt();

        int age = baseYear - year;
        System.out.println("Olá, " + name + ", você possui " + age + " anos de idade.");
        scanner.close();
        

    }
    
}
