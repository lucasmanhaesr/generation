import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);

        List<Integer> lista = new ArrayList<>();
        List<Integer> pares = new ArrayList<>();
        List<Integer> impares = new ArrayList<>();

        for(int i = 0; i < 10; i++){
            System.out.print("Digite o valor: ");
            int valor = scanf.nextInt();
            lista.add(valor);
        }

        for(int i = 0; i < lista.size(); i++){
            if(lista.get(i) % 2 == 0){
                pares.add(lista.get(i));
            }
            else{
                impares.add(lista.get(i));
            }
        }

        System.out.println("Total de números pares: " + pares.size());
        System.out.println("Total de números pares: " + impares.size());
    }
}