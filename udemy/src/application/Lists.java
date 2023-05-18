package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lists {

	public static void main(String[] args) {


		List<String> list = new ArrayList<>();
		
		list.add("Silva");
		list.add("Elma Maria");
		list.add("Elimin Habba");
		
		list.add(2, "Jacinto");
		
		//list.remove(2);
		
		System.out.println(list.size());
		
		for (String x : list) {
			System.out.println(x);
		}
		
		System.out.println("---------------------------------------------------------");
		//list.removeIf(x -> x.charAt(0) == 'E');
		for (String x : list) {
			System.out.println(x);
		}
		
		System.out.println("--------------------------------------");
		System.out.println("Index do Silva: " + list.indexOf("Silva"));
		System.out.println("Index do Pedro: " + list.indexOf("Pedro"));
		
		System.out.println("-------------------------------------------");
		
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'S').collect(Collectors.toList());
		for (String x : result) {
			System.out.println(x);
		}
		System.out.println("-----------------------------");
		String nome = list.stream().filter(x -> x.charAt(0) == 'E').findFirst().orElse(null);
		System.out.println(nome);
		
	}

}