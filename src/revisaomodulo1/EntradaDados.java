package revisaomodulo1;

import java.util.Scanner;
public class EntradaDados {
    public static void executar(Scanner sc) {
        System.out.println("\n=== SCANNER ===");
        System.out.print("Nome: "); String nome = sc.nextLine(); System.out.println("Olá, " + nome + "!");
        System.out.print("Idade: "); int idade = sc.nextInt(); sc.nextLine();
        System.out.println("No próximo aniversário: " + (idade+1));
        System.out.print("Primeiro número: "); int a = sc.nextInt();
        System.out.print("Segundo número: "); int b = sc.nextInt(); sc.nextLine();
        System.out.println("Soma: " + (a+b));
        System.out.print("Altura (use vírgula ou ponto conforme sua configuração): "); double altura = sc.nextDouble();
        System.out.print("Peso: "); double peso = sc.nextDouble(); sc.nextLine();
        System.out.println("Altura: " + altura + ", peso: " + peso);
        System.out.print("Ficha - idade: "); int idadeFicha = sc.nextInt(); sc.nextLine();
        System.out.print("Ficha - nome: "); String nomeFicha = sc.nextLine();
        System.out.print("Ficha - cidade: "); String cidade = sc.nextLine();
        System.out.println("Ficha: " + nomeFicha + ", " + idadeFicha + " anos, " + cidade);
    }
}
