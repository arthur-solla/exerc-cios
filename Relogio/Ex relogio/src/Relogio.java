import java.util.Scanner;

public class Relogio {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("----------Relógio Feliz ----------");
		System.out.println("Número de horários: ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.println("Informe a Hora: ");
			int h = sc.nextInt();
			System.out.println("Infrome os Minutos: ");
			int m = sc.nextInt();
			conferir(h, m);
			
		}
		
		sc.close();
	}

	public static void conferir(int h, int m) {
		// Horas entre 1 e 3 / 9 e 12
		// Minutos entre 1 e 14 / 46 e 60

		if (h >=1 && h<=3 && m >= 46 && m <= 60) {
			System.out.println("O relógio sorri as " + h +"h " + m + "m");
		} else if(h >= 9 && h <= 12 && m >= 1 && m <=14) {
			System.out.println("O relógio sorri as " + h +"h " + m + "m");
		} else {
			System.out.println("O relógio não sorri as " + h + "h " + m + "m");
		}
		System.out.println("------------------------------");
	}
}
