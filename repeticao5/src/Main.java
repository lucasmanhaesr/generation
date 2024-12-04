import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);

        List<Integer> lista = new ArrayList<>();
        int numero;
        int contador = 0;

        do{
            System.out.print("Digite o número: ");
            numero = scanf.nextInt();
            if(numero > 0){
                lista.add(numero);
            }
        }
        while(numero != 0);

        for(int i : lista){
            contador += i;
        }
        System.out.println("A soma dos números positivos é: " + contador);

    }
}