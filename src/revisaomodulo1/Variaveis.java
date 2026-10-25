package revisaomodulo1;

public class Variaveis {
    public static void executar() {
        System.out.println("\n=== VARIÁVEIS E TIPOS ===");
        String nome = "Ana"; int idade = 28; double altura = 1.70; boolean programouAntes = true;
        System.out.println(nome); System.out.println(idade); System.out.println(altura); System.out.println(programouAntes);
        String cidade = "Salvador"; System.out.println("Eu moro em " + cidade + ".");
        String primeiroNome = "Ana", sobrenome = "Silva";
        System.out.println(primeiroNome + " " + sobrenome);
        double preco = 29.90; System.out.println("O preço é R$ " + preco);
        boolean temCarteira = true; System.out.println("Tem carteira: " + temCarteira);
        int a = 10, b = 20, auxiliar = a; a = b; b = auxiliar;
        System.out.println("Troca: a=" + a + " b=" + b);
    }
}
