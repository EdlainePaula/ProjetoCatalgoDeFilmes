package revisaomodulo1;

public class Concatenacao {
    public static void executar() {
        System.out.println("\n=== CONCATENAÇÃO E PRINTF ===");
        String nome = "Ana"; int idade = 28; double altura = 1.70;
        System.out.println(nome + " tem " + idade + " anos.");
        double nota1 = 8.0, nota2 = 7.0;
        System.out.printf("Média: %.2f%n", (nota1+nota2)/2);
        double preco = 29.90; System.out.printf("Preço: R$ %.2f%n", preco);
        System.out.printf("Nome: %s | Idade: %d | Altura: %.2f%n", nome, idade, altura);
        double total = 0; String produto1 = "Arroz", produto2 = "Feijão", produto3 = "Leite";
        double valor1 = 5.50, valor2 = 8.20, valor3 = 4.90;
        total += valor1; total += valor2; total += valor3;
        System.out.printf("%s: R$ %.2f%n%s: R$ %.2f%n%s: R$ %.2f%nTOTAL: R$ %.2f%n",
                produto1, valor1, produto2, valor2, produto3, valor3, total);
    }
}
