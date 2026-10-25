package revisaomodulo1;

import java.util.Scanner;
public class Condicionais {
    public static void executar(Scanner sc) {
        System.out.println("\n=== CONDICIONAIS ===");
        System.out.print("Idade: "); int idade = sc.nextInt();
        System.out.println(idade >= 18 ? "Maior de idade" : "Menor de idade");
        System.out.print("Número: "); int numero = sc.nextInt();
        System.out.println(numero%2==0 ? "Par" : "Ímpar");
        System.out.print("Dois números: "); int a = sc.nextInt(), b = sc.nextInt();
        if (a>b) System.out.println("Maior: " + a);
        else if (b>a) System.out.println("Maior: " + b);
        else System.out.println("São iguais");
        System.out.print("Nota: "); double nota = sc.nextDouble();
        if (nota>=7) System.out.println("Aprovada");
        else if (nota>=5) System.out.println("Recuperação");
        else System.out.println("Reprovada");
        System.out.print("Sorvete (1 a 3): "); int sabor = sc.nextInt();
        switch (sabor) {
            case 1 -> System.out.println("Chocolate");
            case 2 -> System.out.println("Morango");
            case 3 -> System.out.println("Baunilha");
            default -> System.out.println("Opção inválida");
        }
        System.out.print("Idade para ingresso: "); int idadeIngresso = sc.nextInt();
        System.out.println("Ingresso: R$ " + (idadeIngresso<12 || idadeIngresso>=60 ? 10 : 25));
        System.out.print("Três lados: "); double l1=sc.nextDouble(), l2=sc.nextDouble(), l3=sc.nextDouble(); sc.nextLine();
        if (l1<=0 || l2<=0 || l3<=0 || l1+l2<=l3 || l1+l3<=l2 || l2+l3<=l1)
            System.out.println("Não forma um triângulo");
        else if (l1==l2 && l2==l3) System.out.println("Equilátero");
        else if (l1==l2 || l1==l3 || l2==l3) System.out.println("Isósceles");
        else System.out.println("Escaleno");
    }
}
