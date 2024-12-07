import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);

        List<String> lista = new ArrayList<String>();

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite a cor: ");
            String cor = scanf.nextLine();
            lista.add(cor);
        }

        //Cores adicionadas
        System.out.print("Cores adicionadas: [" + lista.get(0));
        for(int i = 1; i < lista.size(); i++) {
            System.out.print(", " + lista.get(i));
        }
        System.out.println("]");

//        Cores em ordem crescente
        Collections.sort(lista);
        System.out.print("\nCores em ordem crescente: [" + lista.get(0));
        for(int i = 1; i < lista.size(); i++) {
            System.out.print(", " + lista.get(i));
        }
        System.out.println("]");


    }
}
