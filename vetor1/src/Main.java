import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);

        int[] vetor = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};

        System.out.print("Digite o valor a ser encontrado no vetor: ");
        int valor = scanf.nextInt();

        for(int i = 0; i < vetor.length; i++){
            if(valor == vetor[i]){
                System.out.println("O numero: " + valor + " está localizado na posição " + i);
            }
            else{
                System.out.println("O número " + valor + " não foi encontrado!");
                break;
            }
        }


    }
}