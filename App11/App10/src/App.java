import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        int v1, v2;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        v1 = entrada.nextInt();

        System.out.print("Digite o segundo valor: ");
        v2 = entrada.nextInt();

        if (v2 < v1) {
            System.out.println("O segundo valor deve ser maior que o primeiro");
        } else if (v2 > v1) {
            int somapar = 0;
            for (int i = v1; i <= v2; i++) {
                if (i % 2 == 0) {
                    somapar += i;
                }
            }
            int v3 = v1 + v2;
            System.out.println("A soma de todos os números dentro do intervalo inserido é: " + (somapar + v3));

        }

    }
}