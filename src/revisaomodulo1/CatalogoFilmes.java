package revisaomodulo1;

import java.util.Scanner;
public class CatalogoFilmes {
    public static void executar(Scanner sc) {
        Filme[] filmes=new Filme[5]; int total=0; int opcao=0;
        while(opcao!=5) {
            System.out.println("\n=== MEU CATÁLOGO ===");
            System.out.println("1 - Cadastrar filme\n2 - Listar filmes\n3 - Buscar por título\n4 - Estatísticas\n5 - Sair");
            System.out.print("Escolha: ");
            try { opcao=sc.nextInt(); sc.nextLine(); }
            catch(java.util.InputMismatchException e) {
                System.out.println("Digite apenas números!"); sc.nextLine(); continue;
            }
            switch(opcao) {
                case 1 -> {
                    if(total==filmes.length) { System.out.println("Catálogo cheio!"); break; }
                    System.out.print("Título: "); String titulo=sc.nextLine();
                    System.out.print("Gênero: "); String genero=sc.nextLine();
                    System.out.print("Nota (0 a 10): "); double nota;
                    try { nota=sc.nextDouble(); sc.nextLine(); }
                    catch(java.util.InputMismatchException e) {
                        System.out.println("Nota inválida: digite um número!"); sc.nextLine(); break;
                    }
                    if(nota<0 || nota>10) { System.out.println("Nota deve estar entre 0 e 10!"); break; }
                    filmes[total]=new Filme(titulo,genero,nota); total++;
                    System.out.println("Filme cadastrado!");
                }
                case 2 -> {
                    if(total==0) System.out.println("Nenhum filme cadastrado.");
                    for(int i=0;i<total;i++) filmes[i].mostrar();
                }
                case 3 -> {
                    System.out.print("Título para buscar: "); String titulo=sc.nextLine();
                    boolean encontrou=false;
                    for(int i=0;i<total;i++) {
                        if(filmes[i].getTitulo().equalsIgnoreCase(titulo)) {
                            filmes[i].mostrar(); encontrou=true; break;
                        }
                    }
                    if(!encontrou) System.out.println("Filme não encontrado.");
                }
                case 4 -> {
                    if(total==0) { System.out.println("Nenhum filme cadastrado."); break; }
                    double soma=0; int melhor=0, otimos=0;
                    for(int i=0;i<total;i++) {
                        soma+=filmes[i].getNota();
                        if(filmes[i].getNota()>filmes[melhor].getNota()) melhor=i;
                        if(filmes[i].getClassificacao().equals("Ótimo")) otimos++;
                    }
                    System.out.println("Total de filmes: "+total);
                    System.out.printf("Média das notas: %.2f%n",soma/total);
                    System.out.println("Melhor filme: "+filmes[melhor].getTitulo());
                    System.out.println("Filmes ótimos: "+otimos+" de "+total);
                }
                case 5 -> System.out.println("Até logo!");
                default -> System.out.println("Opção inválida");
            }
        }
    }
}
