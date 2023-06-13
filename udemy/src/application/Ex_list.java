package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Funcionarios_ex_list;

public class Ex_list {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Funcionarios_ex_list> list = new ArrayList<>();

		System.out.print("Quantos funcionários serão registrados? ");
		int N = sc.nextInt();

		for (int i = 0; i<N; i++) {

			System.out.println();
			System.out.println("Funcionário #" + (i + 1) + ":");
			System.out.print("Id: ");
			Integer id = sc.nextInt();
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Salario: ");
			Double salario = sc.nextDouble();

			Funcionarios_ex_list func = new Funcionarios_ex_list(id, nome, salario);

			list.add(func);
		}

		System.out.print("Digite o id do funcionario que tera o salario aumentado: ");
		int idSalario = sc.nextInt();
		Integer pos = posicaoId(list, idSalario);
		if (pos == null) {
			System.out.println("Esse id não existe!");
		}
		else {
			System.out.print("Digite a porcentagem: ");
			double porcentagem = sc.nextDouble();
			list.get(pos).aumentarSalario(porcentagem);
		}

		System.out.println();
		System.out.println("Lista de funcionários:");

		for (Funcionarios_ex_list func : list) {
			System.out.println(func);
		}


		sc.close();
	}

	public static Integer posicaoId(List<Funcionarios_ex_list> list, int id) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId() == id) {
				return i;
			}
 		}
		return null;
	}
}
