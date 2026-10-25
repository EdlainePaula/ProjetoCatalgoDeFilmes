package revisaomodulo1;

import java.util.Scanner;
public class Strings {
    public static void executar(Scanner sc) {
        System.out.println("\n=== STRINGS ===");
        System.out.print("Nome completo: "); String nome=sc.nextLine();
        System.out.println("Caracteres: "+nome.length());
        System.out.println("Maiúsculo: "+nome.toUpperCase()+" | Minúsculo: "+nome.toLowerCase());
        if(!nome.isEmpty()) System.out.println("Primeira letra: "+nome.charAt(0));
        else System.out.println("Nome vazio: não há primeira letra");
        System.out.print("Frase: "); String frase=sc.nextLine();
        System.out.print("Palavra: "); String palavra=sc.nextLine();
        System.out.println("Aparece na frase: "+frase.toLowerCase().contains(palavra.toLowerCase()));
        System.out.print("Primeiro nome para comparar: "); String nome1=sc.nextLine();
        System.out.print("Segundo nome para comparar: "); String nome2=sc.nextLine();
        System.out.println("São iguais: "+nome1.equalsIgnoreCase(nome2));
        System.out.println("Sem espaços nas pontas, em maiúsculo: "+nome.trim().toUpperCase());
        System.out.print("Palavra do desafio: "); String desafio=sc.nextLine().toLowerCase();
        if(desafio.isEmpty()) System.out.println("Digite uma palavra não vazia");
        else System.out.println("Começa e termina igual: "+(desafio.charAt(0)==desafio.charAt(desafio.length()-1)));
    }
}
