package application;

import java.util.Locale;
import java.util.Scanner;

public class Soma_vetores {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[] vect = new int[n];
		int[] vect1 = new int[n];

		for (int i = 0; i<n; i++) {
			vect[i] = sc.nextInt();
		}

		for (int i = 0; i<n; i++) {
			vect1[i] = sc.nextInt();
		}

		int soma = 0;
		for (int i = 0; i<n; i++) {
			soma = vect[i] + vect1[i];
			System.out.println(soma);
		}
		sc.close();

	}


}
