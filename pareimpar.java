package exercicios2703;
import java.util.Scanner;
public class pareimpar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Informe o número: ");
		numero = ler.nextInt();
		
		if (numero % 2==0) {
			System.out.println("O número informado é par");
		}
		else  {
			System.out.println("O número informado é impar");
		}
		
		}

	

}
