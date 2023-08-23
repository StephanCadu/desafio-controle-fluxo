import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro: ");
        int parametroUm = terminal.nextInt();

        System.out.println("Digite o segundo parâmetro: ");
        int parametroDois = terminal.nextInt();

        try {

            if (parametroDois > parametroUm) {
                for (int index = 1; index <= parametroDois - parametroUm; index++) {
                    System.out.println("Imprimindo número " + index);
                }
            } else {
                throw new ParametrosInvalidosException();
            }

        } catch (ParametrosInvalidosException exception) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro.");
        }
    }
}