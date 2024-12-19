import java.util.Scanner;

public class parOuImpar {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
       int numeroDoUsuario = leitura.nextInt();

       if (numeroDoUsuario % 2 == 0) {
           System.out.println(numeroDoUsuario + " é par");
       } else {
           System.out.println(numeroDoUsuario + " é impar.");
       }
    }
}
