import java.util.Scanner;

public class Numeros {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos números vai converter: ");
		int q = sc.nextInt();

		int v[] = new int[q];
		int i;

		for (i = 0; i < q; i++) {
			System.out.printf("Informe %2do. valor de %d: ", (i + 1), q);
			v[i] = sc.nextInt();
		}

		for (i = 0; i < q; i++) {
			System.out.printf("%2d ", v[i]);
			converter(v[i]);

			System.out.println();

		}

		sc.close();

	}

	public static void converter(int n) {
		if (n > 0) {
			converter(n / 2);
			System.out.print(n % 2);
		}
	}
}
