import java.util.Scanner;

public class App4 {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);
        int chances = 3;

        while (chances > 0) {
            System.out.println("Insira a sua senha: ");
            String senha = input.nextLine();

            if (senha.equals("senhalc")) {
                System.out.println("Acesso liberado");
                break;
            }
            System.out.println("Senha incorreta, tente novamente");
            chances--;
        }

        if (chances == 0) {
            System.out.println("Acesso bloqueado");
        }
    }
}
