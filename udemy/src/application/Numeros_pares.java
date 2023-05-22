package application;

import java.util.Locale;
import java.util.Scanner;

public class Numeros_pares {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] vect = new int[n];
		
		for (int i = 0; i<n; i++) {
			vect[i] = sc.nextInt();
		}
		
		int qtdpares = 0;
		for (int i = 0; i<n; i++) {
			if (vect[i] % 2 == 0) {
				System.out.println(vect[i]);
				qtdpares++;
			}
		}
		System.out.println(qtdpares);
		sc.close();
	}

}
