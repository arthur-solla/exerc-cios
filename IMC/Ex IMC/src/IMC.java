import java.util.Scanner;

public class IMC {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Qual sua altura?");
		double altura = sc.nextDouble();
		System.out.println("");

		System.out.println("Qual seu peso?");
		double peso = sc.nextDouble();
		System.out.println("");

		double imc = peso / (altura * altura);

		System.out.println("-------------------------------------");

		if (imc < 18.5) {
			System.out.printf("|    IMC= %.2f - Abaixo do peso     |", imc);
		} else if (imc > 18.5 && imc <= 24.9) {
			System.out.printf("|    IMC= %.2f - Peso normal        |", imc);
		} else if (imc > 25.0 && imc <= 29.9) {
			System.out.printf("|    IMC= %.2f - Pré-Obesidade      |", imc);
		} else if (imc > 30.0 && imc <= 34.9) {
			System.out.printf("|    IMC= %.2f - Obesidade Grau I   |", imc);
		} else if (imc > 35.0 && imc <= 39.9) {
			System.out.printf("|    IMC= %.2f - Obesidade Grau II  |", imc);
		} else if (imc >= 40) {
			System.out.printf("|    IMC= %.2f - Obesidade Grau III |", imc);
		}

		double pesoIdealMin = 18.5 * (altura * altura);
		double pesoIdealMax = 24.9 * (altura * altura);

		System.out.printf("\n| Peso adequado: entre %.2f e %.2f |", pesoIdealMin, pesoIdealMax);
		System.out.println("\n-------------------------------------");

		sc.close();
	}

}
