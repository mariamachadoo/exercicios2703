package exercicios2703;
import java.util.Scanner;
public class triangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);

		int numero1, numero2, numero3;

		System.out.println("Informe a medida do primeiro lado: ");
		numero1 = ler.nextInt();

		System.out.println("Informe a medida do segundo lado: ");
		numero2 = ler.nextInt();

		System.out.println("Informe a medida do terceiro lado: ");
		numero3 = ler.nextInt();

		if (numero1 == numero2 && numero2 == numero3) {
			System.out.println("É um triâgulo equilátero");
		}
		else if (numero1 == numero2 || numero2 == numero3 || numero1 == numero3){
			System.out.println("É um triângulo isósceles");
		}
		else {
			System.out.println("É um triâgulo escaleno");
		}

	}
}