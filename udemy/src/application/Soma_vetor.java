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
		
		for (int i=0;i<vet.length;i++) {
			soma += vet[i];
		}
		
		double avg = soma / n;
		
		for (int i=0; i<vet.length; i++) {
			System.out.println(vet[i]);
		}
		
		System.out.println(soma);
		System.out.println(avg);
		
		sc.close();
	}

}
