package application;

import java.util.Locale;
import java.util.Scanner;

public class Soma_vetor {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);


		int n = sc.nextInt();
		double[] vet = new double[n];

		for (int i=0; i<vet.length; i++) {
			vet[i] = sc.nextDouble();
		}

		double soma = 0.0;

		for (double element : vet) {
			soma += element;
		}

		double avg = soma / n;

		for (double element : vet) {
			System.out.println(element);
		}

		System.out.println(soma);
		System.out.println(avg);

		sc.close();
	}

}
