import java.util.Scanner;

public class ContaBancaria {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        System.out.println("Vamos Registrar sua conta!");

        System.out.println("Digite seu nome:");
        String nome = leitura.nextLine();
        System.out.println("Agora preciso saber se sua conta é corrente ou pupança:\nDigite 1 para corrente e 2 para poupança");
        int tipoConta = leitura.nextInt();
        String correnteOuPoupanca = "str";

        if (tipoConta == 1) {
             correnteOuPoupanca = "Corrente";
        } else if (tipoConta == 2) {
             correnteOuPoupanca = "Poupança";
        } else {
            System.out.println("Erro, tipo de conta invalido");
        }
        System.out.println("Qual valor incial da sua conta?");
        double saldo = leitura.nextDouble();

        System.out.println("Nome: " + nome + "\ntipo de conta: " + correnteOuPoupanca  + "\nSaldo: " + saldo);
    }
}
