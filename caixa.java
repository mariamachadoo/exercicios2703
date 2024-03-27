package exercicios2703;
import java.util.Scanner;
public class caixa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		String cpf, senha, senhacor, login;
		double valor, saldofinal, saldo = 4000.00;

		login = "43822445878";
		senhacor = "123456";

		System.out.println("Informe o seu CPF: ");
		cpf = ler.nextLine();

		if (cpf.equals("43822445878")) {

			System.out.println("Digite a sua senha: ");
			senha = ler.nextLine();

			if (senha.equals("123456")) {
				System.out.println("Seu saldo atual é de: R$" + saldo);
				System.out.println("Qual valor você deseja sacar?: ");
				valor = ler.nextDouble();

				if (valor <= saldo) {
					saldofinal = saldo - valor;
					System.out.println("Seu saldo atual é: " + saldofinal);
				}
				else {
					System.out.println("Seu saldo é insuficiente");
				}
			}
			else {
				System.err.println("Sua senha está incorreta");
			}
		}
		else {
			System.out.println("CPF inválido");

		}ler.close();
	}
}