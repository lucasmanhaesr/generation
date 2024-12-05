import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);

        double media;
        int contador = 0;
        int[] vetor = new int[10];
        List<Integer> par = new ArrayList<>();
        List<Integer> impar = new ArrayList<>();

        for(int i = 0; i < vetor.length; i++){
            System.out.print("Digite o número: ");
            int numero = scanf.nextInt();
            vetor[i] = numero;
        }

        for(int i = 0; i < vetor.length; i++){
            if(vetor[i] % 2 != 0){
                impar.add(vetor[i]);
            }
            else{
                par.add(vetor[i]);
            }
            contador += vetor[i];
        }

        System.out.print("Elementos nos índices ímpares: [" + impar.get(0) + ", ");
        for(int i = 1; i < impar.size() + 1; i++){
            if(i == impar.size() - 1){
                break;
            }
            System.out.print(impar.get(i) + ", ");
        }
        System.out.print(impar.get(impar.size() - 1) + "]\n");

        System.out.print("Elementos nos índices pares: [" + par.get(0) + ", ");
        for(int i = 1; i < par.size() + 1; i++){
            if(i == par.size() - 1){
                break;
            }
            System.out.print(par.get(i) + ", ");
        }
        System.out.print(par.get(par.size() - 1) + "]\n");

        System.out.println("A soma dos vetores é de: " + contador);
        media = (double) contador / vetor.length;
        System.out.println("A média é de: " + media);

    }
}

