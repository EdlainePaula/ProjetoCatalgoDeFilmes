package revisaomodulo1;

public class Metodos {
    public static void executar() {
        System.out.println("\n=== MÉTODOS ===");
        mostrarBoasVindas(); saudacao("Ana"); saudacao("Bia"); saudacao("Carlos");
        System.out.println("Dobro: "+dobro(7));
        System.out.printf("Média: %.2f%n",calcularMedia(8,7));
        if(ehPar(8)) System.out.println("8 é par"); else System.out.println("8 é ímpar");
        System.out.println("Somar dois: "+somar(2,3));
        System.out.println("Somar três: "+somar(2,3,4));
        liberarEntrada(20); liberarEntrada(16);
    }
    public static void mostrarBoasVindas() { System.out.println("Boas-vindas!"); }
    public static void saudacao(String nome) { System.out.println("Olá, "+nome+"!"); }
    public static int dobro(int numero) { return numero*2; }
    public static double calcularMedia(double n1,double n2) { return (n1+n2)/2; }
    public static boolean ehPar(int numero) { return numero%2==0; }
    public static int somar(int a,int b) { return a+b; }
    public static int somar(int a,int b,int c) { return a+b+c; }
    public static boolean ehMaiorDeIdade(int idade) { return idade>=18; }
    public static void liberarEntrada(int idade) {
        if(ehMaiorDeIdade(idade)) System.out.println("Entrada liberada");
        else System.out.println("Entrada não permitida");
    }
}
