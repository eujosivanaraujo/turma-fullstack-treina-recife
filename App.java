import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();

        sc.close();

        System.out.println("Bem vindo(a), " + nome + "!");
    }
}
