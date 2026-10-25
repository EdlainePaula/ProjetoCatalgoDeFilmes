package revisaomodulo1;

import java.util.InputMismatchException;
import java.util.Scanner;
public class Excecoes {
    public static void executar(Scanner sc) {
        System.out.println("\n=== TRATAMENTO DE EXCEÇÕES ===");
        try {
            System.out.print("Numerador inteiro: "); int a=sc.nextInt();
            System.out.print("Denominador inteiro: "); int b=sc.nextInt();
            System.out.println("Divisão: "+(a/b));
        } catch(ArithmeticException e) { System.out.println("Não é possível dividir por zero"); }
        catch(InputMismatchException e) { System.out.println("Digite apenas números inteiros"); }
        finally { sc.nextLine(); }
        int[] notas={8,6,10,7,9};
        try {
            System.out.print("Posição da nota (0 a 4): "); int pos=sc.nextInt();
            System.out.println("Nota: "+notas[pos]);
        } catch(ArrayIndexOutOfBoundsException e) { System.out.println("Posição inválida"); }
        catch(InputMismatchException e) { System.out.println("Digite um número inteiro"); }
        finally { sc.nextLine(); }
        try {
            System.out.print("Idade: "); int idade=sc.nextInt(); System.out.println("Idade: "+idade);
        } catch(InputMismatchException e) { System.out.println("Idade deve ser um número"); }
        finally { sc.nextLine(); }
        String nome=null;
        try { System.out.println(nome.length()); }
        catch(NullPointerException e) { System.out.println("Nome está nulo"); }
        String[] nomes={"Ana","Bia","Caio"};
        try { System.out.println(nomes[5]); }
        catch(ArrayIndexOutOfBoundsException e) { System.out.println("Posição 5 não existe"); }
        System.out.println("O programa continua funcionando.");
        System.out.print("Desafio - erro (1=divisão, 2=array, 3=genérico): ");
        String escolha=sc.nextLine();
        try {
            switch(escolha) {
                case "1" -> { int zero=0; System.out.println(10/zero); }
                case "2" -> System.out.println(nomes[10]);
                case "3" -> { throw new IllegalArgumentException("Erro de teste"); }
                default -> System.out.println("Sem erro");
            }
        } catch(ArithmeticException e) { System.out.println("Catch: divisão por zero"); }
        catch(ArrayIndexOutOfBoundsException e) { System.out.println("Catch: posição inválida"); }
        catch(Exception e) { System.out.println("Catch genérico: "+e.getMessage()); }
    }
}
