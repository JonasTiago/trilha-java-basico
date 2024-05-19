import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Conta!");
        int conta = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Por favor, digite o número da Agência!");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o seu nome completo!");
        String name = scanner.nextLine();

        System.out.println("Por favor, digite o seu saldo!");
        double saldo = scanner.nextDouble();

        String mensagem = "Olá " + name + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +
                          ", conta " + conta + " e seu saldo " + saldo + " já está disponível para saque.";

        System.out.println(mensagem);

        scanner.close();
    }
}
