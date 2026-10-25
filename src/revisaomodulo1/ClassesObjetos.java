package revisaomodulo1;

public class ClassesObjetos {
    public static void executar() {
        System.out.println("\n=== CLASSES E OBJETOS ===");
        Pet pet1=new Pet(); pet1.nome="Luna"; pet1.raca="Vira-lata"; pet1.peso=4.2;
        Pet pet2=new Pet(); pet2.nome="Thor"; pet2.raca="Poodle"; pet2.peso=6.1;
        System.out.println(pet1.nome+" - "+pet1.raca+" - "+pet1.peso+" kg");
        System.out.println(pet2.nome+" - "+pet2.raca+" - "+pet2.peso+" kg");
        Produto produto=new Produto(); produto.nome="Caneta"; produto.preco=5.50; produto.quantidade=10;
        System.out.printf("Estoque de %s: R$ %.2f%n",produto.nome,produto.preco*produto.quantidade);
        Aluna aluna=new Aluna(); aluna.nome="Ana"; aluna.nota1=8; aluna.nota2=7;
        aluna.media=(aluna.nota1+aluna.nota2)/2;
        System.out.printf("%s - notas %.1f e %.1f - média %.2f%n",aluna.nome,aluna.nota1,aluna.nota2,aluna.media);
        Jogadora j1=new Jogadora(); j1.nome="Ana"; j1.pontos=10;
        Jogadora j2=new Jogadora(); j2.nome="Bia"; j2.pontos=25;
        Jogadora j3=new Jogadora(); j3.nome="Clara"; j3.pontos=18;
        Jogadora melhor=j1; if(j2.pontos>melhor.pontos) melhor=j2;
        if(j3.pontos>melhor.pontos) melhor=j3;
        System.out.println("Maior pontuação: "+melhor.nome);
    }
}
