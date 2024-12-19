import java.util.Scanner;

public class ContaBancaria {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        String nome = "Tom Kirkman";
        String tipoConta = "Corrente";
        double saldo = 2500;

        System.out.println("***********************");
        System.out.println("\nNome do cliente: " + nome);
        System.out.println("Tipo conta: " + tipoConta);
        System.out.println("Saldo atual: " + saldo);
        System.out.println("\n***********************");

        int opcoes = 1;

        while (opcoes > 0) {
            System.out.println("Operações: ");
            System.out.println("""
                    1 - Consultar Saldo
                    2 - Depositar Valor
                    3 - Transferir valor
                    4 - Sair
                    
                    Digite sua opção: 
                    """);
            opcoes = leitura.nextInt();

            if(opcoes == 1) {
                System.out.println("Saldo atual: " + saldo);
            } else if (opcoes == 2) {
                System.out.println("Quanto Deseja Depositar: ");
                double deposito = leitura.nextDouble();
                System.out.println("Deposito de " + deposito + " Realizado com sucesso!");
                saldo += deposito;
                System.out.println("Seu saldo atual é: " + saldo);
            } else if (opcoes == 3) {
                System.out.println("Quanto deseja tranferir: ");
                double transferir = leitura.nextDouble();

                if (transferir > saldo) {
                    System.out.println("saldo insuficiente.\nSaldo atual " + saldo);
                } else {
                    saldo -= transferir;
                    System.out.println("Transferencia de " + transferir + " Realizada com sucesso! \nSaldo atual : " + saldo);
                }
            } else if (opcoes == 4) {
                System.out.println("Encerrando programa...\nAté mais");
                opcoes = 0;
            } else {
                System.out.println("Erro, opcão invalida");
            }
        }
    }
}
