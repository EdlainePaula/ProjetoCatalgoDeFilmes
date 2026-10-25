package revisaomodulo1;

import java.util.Scanner;
public class Arrays {
    public static void executar(Scanner sc) {
        System.out.println("\n=== ARRAYS ===");
        String[] nomes={"Ana","Bruno","Carlos","Diana","Eva"};
        System.out.println(nomes[0]+", "+nomes[2]+", "+nomes[nomes.length-1]);
        int[] notas={8,6,10,7,9}; int soma=0;
        for(int nota:notas) { System.out.println(nota); soma+=nota; }
        System.out.println("Soma: "+soma+" Média: "+((double)soma/notas.length));
        int[] numeros={12,4,20,7,3}; int maior=numeros[0];
        for(int numero:numeros) if(numero>maior) maior=numero;
        System.out.println("Maior: "+maior);
        int[] outrasNotas={8,5,10,4,7}; int aprovadas=0;
        for(int nota:outrasNotas) if(nota>=7) aprovadas++;
        System.out.println("Notas >= 7: "+aprovadas);
        System.out.print("Buscar nome: "); String busca=sc.nextLine(); int posicao=-1;
        for(int i=0;i<nomes.length;i++) if(nomes[i].equalsIgnoreCase(busca)) { posicao=i; break; }
        if(posicao==-1) System.out.println("Nome não encontrado");
        else System.out.println("Posição (começando em zero): "+posicao);
    }
}
