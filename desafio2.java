package exercicios2703;
import java.util.Scanner;
public class desafio2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner ler = new Scanner(System.in);
		int numero;
		
		System.out.println("Digite o número: ");
		numero = ler.nextInt();
		
		if (numero > 0) {
			System.out.println("O número é positivo");
		}
		if (numero < 0) {
			System.out.println("O número é negativo");
		}
		else if (numero == 0) {
			System.out.println("O número é zero");
		}
		
	
		
	}		
}
