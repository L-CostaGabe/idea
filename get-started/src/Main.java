import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        var scanner = new Scanner(System.in);
/*
       *System.out.println("Digite seu nome: ");
         var name = scanner.nextLine();
         System.out.println("Digite seu ano de nascimento: ");
         var year = scanner.nextInt();
         var ageYear = 2025-year;
         System.out.printf("Olá %s, você tem %s anos!", name, ageYear);

 */
 /*
        *System.out.println("Digite o lado do quadrado: ");
        var side = scanner.nextInt();
        var area = side * side;
        System.out.printf("A área do quadrado é: %s", area);
*/
   /*
       * System.out.println("Digite a base do retângulo: ");
        var base = scanner.nextInt();
        System.out.println("Digite altura do retângulo: ");
        var altura = scanner.nextInt();
        var areaRetangulo = base * altura;
        System.out.printf("A área do retângulo é: %s * %s = %s", base, altura, areaRetangulo);
        */

        System.out.println("Digite o 1º nome: ");
        var name1 = scanner.nextLine();
        System.out.println("Digite o 2º nome: ");
        var name2 = scanner.nextLine();

        System.out.printf("Digite a idade de %s: ", name1);
        var age1 = scanner.nextInt();
        System.out.printf("Digite a idade de %s: ", name2);
        var age2 = scanner.nextInt();
        var ageDifference = Math.abs(age2 - age1);
        System.out.printf("A diferença de idade entre %s e %s é de %s anos.", name1, name2, ageDifference);


    }

}