import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int n1, n2;
        int opcao;
        double result = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um número pra escolher a operação:");
        System.out.println("1 = Adição");
        System.out.println("2 = Subtração");
        System.out.println("3 = Multiplicação");
        System.out.println("4 = Divisão");
        opcao = input.nextInt();

        System.out.println("Insira o primeiro valor: ");
        n1 = input.nextInt(0);

        System.out.println("Insira o segundo valor: ");
        n2 = input.nextInt(0);

        if (opcao == 1) {
            result = n1 + n2;
        }

        else if (opcao == 2) {
            result = n1 - n2;
        }

        else if (opcao == 3) {
            result = n1 / n2;
        }

        else if (opcao == 3) {
            result = n1 * n2;
        }

        System.out.println("O resultado da operação é:" + result);
    }
}
