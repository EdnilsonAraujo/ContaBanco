import java.util.Scanner;

public class ContaBanco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Por favor, digite o número da conta: ");
        int numeroConta = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Por favor, digite o número da Agência: ");
        String numeroAgencia = scanner.next();
        scanner.nextLine();
        System.out.print("Digite seu nome: ");
        String nome = ""; 
        nome+=scanner.nextLine();
        System.out.print("Digite seu saldo: ");
        float saldo = scanner.nextFloat();

        scanner.close(); 
        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco.");
        System.out.println("Sua agência é " + numeroAgencia + ". Sua conta é " + numeroConta + " e seu saldo de "+ saldo + " já está disponível para saque.");
    }
}
