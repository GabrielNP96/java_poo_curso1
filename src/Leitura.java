import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite o nome do Filme");
        String filme = leitura.nextLine();

        System.out.println("Ano de lançamento do filme: ");
        int anoDeLancamento = leitura.nextInt();

        System.out.println("Sua avaliação do filme: ");
        double avaliacao = leitura.nextDouble();

        System.out.println("Nome do Filme: " + filme);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        System.out.println("Avaliação: " + avaliacao);

    }
}
