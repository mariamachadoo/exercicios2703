package exercicios2703;

import java.util.Scanner;

public class desafio1 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int numero;
		System.out.println("Digite o numero do mês: ");
		numero = ler.nextInt ();

		if (numero == 1) {
			System.out.println("O mês é janeiro");

		}
		if (numero == 2){
			System.out.println("O mês é fevereiro");

		}
		if (numero == 3){
			System.out.println("O mês é março");

		}
		if (numero == 4){
			System.out.println("O mês é abril");

		}
		if (numero == 5) {
			System.out.println("O mês é maio");

		}
		if (numero == 6) {
			System.out.println("O mês é junho");

		}
		if (numero == 7){
			System.out.println("O mês é julho");
		}

		if (numero == 8){
			System.out.println("O mês é agosto");
		}
		if (numero == 9){
			System.out.println("O mês é setembro");
		}
		if (numero == 10){
			System.out.println("O mês é outubro");
		}	
		if (numero == 11){
			System.out.println("O mês é novembro");
		}
		if (numero == 12){
			System.out.println("O mês é dezembro");
		}
		else if (numero > 12) {
			System.out.println("Mês inválido");
		}
		ler.close();						

	}

}
