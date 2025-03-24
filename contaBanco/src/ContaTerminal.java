import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int numero;
		String agencia;
		String nomeCliente;
		double saldo;

		System.out.println("Por favor, digite o número da Conta: (1234)");
		numero = scanner.nextInt();

		System.out.println("Agora digite o número da Agência: (123-8)");
		agencia = scanner.next();

		System.out.println("Me informe seu nome: ");
		nomeCliente = scanner.next();
		scanner.nextLine();

		System.out.println("Agora me informa seu saldo atual: ");
		saldo = scanner.nextDouble();

		System.out.println();
		System.out.printf("Olá %s, obrigado por criar uma conta em "
				+ "nosso banco, sua agência é %s, "
				+ "conta %d e seu saldo %.2f já está disponível"
				+ " para saque.", nomeCliente, agencia, numero, saldo);

		scanner.close();
	}

}
