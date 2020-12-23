package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Product;
import services.CalculationService;

public class Program {

	public static void main(String[] args) {
		
		/*
		 * 		Problema exemplo
		 * 
		 * 		Uma empresa de consultoria deseja avaliar a performance de produtos, funcionários,
		 * 	dentre outras coisas. Um dos cálculos que ela precisa é encontrar o maior dentre um
		 * 	conjunto de elementos. Fazer um programa que leia um conjunto de produtos a partir
		 * 	de um arquivo e depois mostre o mais caro deles.
		 * 
		 * 	Nota: Java possui Collections.max(list) que encontra o maior elemento de uma lista
		 */
		
		Locale.setDefault(Locale.US);
		
		List<Product> products = new ArrayList<>();
		
		String path = "C:\\Users\\lukas\\Desktop\\in.txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = br.readLine();
			
			while (line != null) {
				String[] fields = line.split(","); // Para separar os elementos com base na vírgula
				products.add(new Product(fields[0], Double.parseDouble(fields[1])));
				line = br.readLine();
			}
			
			Product x = CalculationService.max(products);
			System.out.print("Most expensive: ");
			System.out.println(x);
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

	}

}
