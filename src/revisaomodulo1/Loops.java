package revisaomodulo1;

import java.util.Scanner;
public class Loops {
    public static void executar(Scanner sc) {
        System.out.println("\n=== LOOPS ===");
        for(int i=1;i<=20;i++) System.out.println(i);
        for(int i=10;i>=1;i--) System.out.println(i);
        System.out.println("Fim!");
        System.out.print("Tabuada de qual número? "); int n=sc.nextInt();
        for(int i=1;i<=10;i++) System.out.println(n+" x "+i+" = "+(n*i));
        for(int i=2;i<=30;i+=2) System.out.print(i+" "); System.out.println();
        int soma=0; for(int i=1;i<=100;i++) soma+=i;
        System.out.println("Soma de 1 a 100: "+soma);
        int i=1; while(i<=20) { System.out.println(i); i++; }
        int energia=3; do { System.out.println("Jogando..."); energia--; } while(energia>0);
        System.out.print("Altura do triângulo: "); int altura=sc.nextInt(); sc.nextLine();
        for(int linha=1;linha<=altura;linha++) {
            for(int estrela=1;estrela<=linha;estrela++) System.out.print("*");
            System.out.println();
        }
    }
}
