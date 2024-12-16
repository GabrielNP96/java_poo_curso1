public class Condicional {
    public static void main(String[] args) {
        int anoDeLancamento = 1986;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        String tipoDePlano = "plus";

        if (anoDeLancamento >= 2022) {
            System.out.println("Filme lançamento.");
        } else {
            System.out.println("Filme retrô.");
        }

        if (incluidoNoPlano && tipoDePlano.equals("plus")) {
            System.out.printf("Filme incluido no plano");
        } else {
            System.out.println("Filme não incluido no plano");
        }
    }
}
