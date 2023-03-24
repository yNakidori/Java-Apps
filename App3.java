import java.util.Scanner;
public class App3 {
    public static void main(String[] args) throws Exception {
       
       int cont=1;
       String n1, n2, n3;
       Scanner entrada = new Scanner(System.in);
       System.out.println("Insira a sua senha (Apenas caracteres): ");
       String senha=entrada.nextLine();
           
       if (senha.equals ("senhalc"))
        
            System.out.println("Acesso liberado");
            
    
       else  if
       (senha != "senhalc" );
    
       do
       {
       System.out.println("Tentativa " +cont++);
        System.out.println("Digite a sua senha: ");
       n1 = entrada.nextLine();
       if (senha.equals ("senhalc"))
       System.out.println("Acesso liberado");

       System.out.println("Tentativa " +cont++);
        System.out.println("Digite a sua senha: ");
       n2 = entrada.nextLine();
       if (senha.equals ("senhalc"))
       System.out.println("Acesso liberado");

       System.out.println("Tentativa " +cont++);
        System.out.println("Digite a sua senha: ");
       n3 = entrada.nextLine(); 
       if (senha.equals ("senhalc"))
       System.out.println("Acesso liberado");    
      cont++;
        }
    
        while (cont<=3);
    }
}
