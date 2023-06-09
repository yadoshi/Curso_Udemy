package application;

import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[][] mat = new int[n][n];

		for (int i=0; i <mat.length; i++) {
			for (int j=0; j<mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		System.out.println("Diagonal principal:");
		for(int i=0;i<mat.length;i++) {
			System.out.print(mat[i][i] + " ");
		}
		System.out.println();

		int negNum = 0;

		for (int[] element : mat) {
			for (int j=0; j<element.length; j++) {
				if(element[j] < 0) {
					negNum ++;
				}
			}
		}
		System.out.print("Numeros negativos: " + negNum);



		sc.close();
	}

}
