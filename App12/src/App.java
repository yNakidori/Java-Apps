
import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        String escolha;
        double alt, result;

        JOptionPane.showMessageDialog(null,
                "O programa irá calcular o peso ideal de uma pessoal com base em seu sexo e altura");
        escolha = JOptionPane.showInputDialog(null, "Digite o seu sexo");
        alt = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira a sua altura:"));

        if (escolha.equals("Masculino".toLowerCase())) {
            result = (alt * 72.7) - 58;
        } else if (escolha.equals("Feminino".toLowerCase())) {
            result = (alt * 62.1) - 44.7;
        } else {
            result = Double.parseDouble(JOptionPane.showInputDialog(null, "Dado invalido"));
        }

        JOptionPane.showMessageDialog(null, "O resultado e:" + result);
    }
}
