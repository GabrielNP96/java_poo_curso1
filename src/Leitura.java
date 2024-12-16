import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite o nome do Filme");
        String filme = leitura.nextLine();
        System.out.printf(filme);

    }
}
