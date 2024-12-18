import java.util.Random;
import java.util.Scanner;

public class JogoDeAdvinhacao {
    public static void main(String[] args) {
        // Gera um número aleatório entre 0 e 100
        Random aleatorio = new Random();
        Scanner leitura = new Scanner(System.in);

        int numeroAleatorio = aleatorio.nextInt(101);
        int tentativas = 5;

        System.out.println("Você tem " + tentativas + " chances para adivinhar o número secreto entre 0 e 100!");

        while (tentativas > 0) {
            System.out.print("Digite um número: ");
            int numeroDoUsuario = leitura.nextInt();

            if (numeroDoUsuario > numeroAleatorio) {
                System.out.println("O número secreto é menor que " + numeroDoUsuario + ".");
            } else if (numeroDoUsuario < numeroAleatorio) {
                System.out.println("O número secreto é maior que " + numeroDoUsuario + ".");
            } else {
                System.out.println("Parabéns! Você adivinhou o número secreto!");
                break; // Sai do loop se o usuário acertar
            }

            tentativas--; // Reduz o número de tentativas restantes

            if (tentativas > 0) {
                System.out.println("Você ainda tem " + tentativas + " tentativa(s).");
            } else {
                System.out.println("Que pena! Suas tentativas acabaram.");
                System.out.println("O número secreto era: " + numeroAleatorio);
            }
        }

        leitura.close(); // Fecha o Scanner
    }
}
