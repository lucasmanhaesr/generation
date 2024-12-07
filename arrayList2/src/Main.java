import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);

        List<Integer> lista = new ArrayList<>();

        Collections.addAll(lista,5,1,3,4,9,7,8,10,6);

        System.out.print("Digite um número: ");
        Integer numero = scanf.nextInt();

        if(lista.contains(numero)) {
            System.out.println("O numero " + numero + " está localizado na posição " + lista.indexOf(numero));
        }
        else{
            System.out.println("O numero " + numero + " não foi localizado");
        }

    }
}