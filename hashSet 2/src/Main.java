import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);

        Set<Integer> lista = new HashSet<>();
        Collections.addAll(lista,2,5,1,3,4,9,7,8,10,6);

        System.out.print("Digite um numero: ");
        Integer numero = scanf.nextInt();

        if(lista.contains(numero)) {
            System.out.println("O número " + numero + " foi encontrado!");
        }
        else{
            System.out.println("O número " + numero + " não foi encontrado!");
        }
    }

}