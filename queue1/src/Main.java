import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);

        Queue<String> lista = new LinkedList<>();
        int menu;

        do{
            System.out.println("\n*********** MENU **********");
            System.out.println("1 - Adicionar cliente na fila");
            System.out.println("2 - Listar todos os clientes");
            System.out.println("3 - Retirar cliente da fila");
            System.out.println("0 - Sair");
            System.out.println("*****************************");

            System.out.print("\nEntre com a opção desejada: ");
            menu = scanf.nextInt();

            switch (menu){
                case 1:
                    System.out.print("Digite seu nome: ");
                    String nome = scanf.next();
                    lista.add(nome);
                    break;
                case 2:
                    System.out.println("Fila: " + lista);
                    break;
                case 3:
                    if(lista.isEmpty()){
                        System.out.println("A lista está vazia");
                    }
                    else{
                        System.out.println("Chamada: " + lista.poll());
                    }
                    break;
                default:
                    break;
            }
        }
        while (menu != 0);
    }
}