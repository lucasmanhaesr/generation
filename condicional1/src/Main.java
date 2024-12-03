import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int a = scanf.nextInt();

        System.out.print("Digite o segundo número: ");
        int b = scanf.nextInt();

        System.out.print("Digite o terceiro número: ");
        int c = scanf.nextInt();


        int soma = a + b;
        if(soma == c){
            System.out.println("A soma dos dois valores é igual ao terceiro valor");
        }
        else if(soma < c){
            System.out.println("A soma dos dois primeiros valores é menor que o terceiro valor");
        }
        else{
            System.out.println("A soma dos dois primeiros valores é maior que o terceiro valor");
        }
    }
}