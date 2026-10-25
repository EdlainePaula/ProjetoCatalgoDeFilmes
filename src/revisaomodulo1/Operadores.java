package revisaomodulo1;

public class Operadores {
    public static void executar() {
        System.out.println("\n=== OPERADORES ===");
        int a = 15, b = 4;
        System.out.println("Soma: " + (a+b)); System.out.println("Subtração: " + (a-b));
        System.out.println("Multiplicação: " + (a*b)); System.out.println("Divisão inteira: " + (a/b));
        System.out.println("Resto: " + (a%b));
        int saldo = 1000; saldo += 250; saldo -= 380; System.out.println("Saldo: " + saldo);
        a = 10; b = 10;
        System.out.println("== " + (a==b) + " != " + (a!=b) + " > " + (a>b) + " >= " + (a>=b));
        int idade = 20; boolean temCarteira = true;
        System.out.println("Pode dirigir: " + (idade >= 18 && temCarteira));
        int numero = 17; System.out.println("Resto por 2: " + (numero%2));
        System.out.println("Arroz: R$ " + (3*5.50));
        int desafio = 30; System.out.println("Divisível por 3 e 5: " + (desafio%3==0 && desafio%5==0));
    }
}
