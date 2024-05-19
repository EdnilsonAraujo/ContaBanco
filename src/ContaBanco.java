import java.util.Scanner;

public class ContaBanco {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número da conta: ");
        int numeroConta = scanner.nextInt();
        System.out.print("Digite o número da agência: ");
        String numeroAgencia = scanner.next();
        System.out.print("Digite seu nome: ");
        String nome = ""; 
        while(scanner.hasNext()){
            nome+=scanner.nextLine();
            }
        System.out.print("Digite seu saldo: ");
        float saldo = scanner.nextFloat();

        scanner.close(); 
        System.out.println("Hello, World!");
    }
}
