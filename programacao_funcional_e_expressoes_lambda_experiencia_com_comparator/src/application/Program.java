package application;

import java.util.ArrayList;
import java.util.List;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		/*
		 * 		Problema
		 * 
		 * 	• Suponha uma classe Product com os atributos name e price.
		 * 
		 * 	• Podemos implementar a comparação de produtos por meio da
		 * 	  implementação da interface Comparable<Product>
		 * 
		 * 	• Entretanto, desta forma nossa classe não fica fechada para
		 * 	  alteração: se o critério de comparação mudar, precisaremos
		 * 	  alterar a classe Product.
		 * 
		 * 	• Podemos então usar o default method "sort" da interface List:
		 * 		default void sort(Comparator<? super E> c)
		 */
		
		List<Product> products = new ArrayList<>();
		
		products.add(new Product("TV", 900.00));
		products.add(new Product("Notebook", 1200.00));
		products.add(new Product("Tablet", 450.00));
		
		products.sort((product1, product2) -> product1.getName().toUpperCase().compareTo(product2.getName().toUpperCase()));
		
		for (Product product : products) {
			System.out.println(product);
		}

	}

}
