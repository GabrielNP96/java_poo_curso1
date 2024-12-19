import java.util.Scanner;

public class SomaDoisNumeros {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite um número");
        double primeiroNumero = leitura.nextDouble();
        System.out.println("Digite outro número");
        double segundoNumero = leitura.nextDouble();
        double resposta = primeiroNumero + segundoNumero;

        System.out.println(primeiroNumero + " + " + segundoNumero + " = " + resposta);
    }
}
