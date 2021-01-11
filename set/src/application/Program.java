package application;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Program {

	public static void main(String[] args) {
		
		/*
		 * 		Set<T>
		 * 
		 * 	• Representa um conjunto de elementos (similar ao da Álgebra)
		 * 	  	• Não admite repetições
		 * 		• Elementos não possuem posição
		 * 		• Acesso, inserção e remoção de eçementos são rápidos
		 * 		• Oferece operações eficientes de conjunto: interseção, união, diferença.
		 * 		• Principais implementações:
		 * 			• HashSet - mais rápido (operações O(1) em tabela hash) e não ordenado
		 * 			• TreeSet - mais lento (operações O(log(n)) em árvore rubro-negra) e ordenado
		 * 			  pelo compareTo do objeto (ou Comparator)
		 * 			• LinkedHashSet - velocidade intermediária e elementos na ordem em que são adicionados
		 * 
		 * 		Alguns métodos importantes
		 * 
		 * 	• add(obj), remove(obj), contains(obj)
		 * 		• Baseado em equals e hashCode
		 *		• Se equals e hashCode não existir, é usada comparação de ponteiros
		 *
		 *	• clear()
		 *	• size()
		 *	• removeIf(predicate)
		 *
		 *	• addAll(other) - união: adiciona no conjunto os elementos do outro conjunto, sem repetição
		 *	• retainAll(other) - interseção: remove do conjunto os elementos não contitos em other
		 *	• removeAll(other) - diferença: remove do conjunto os elementos contidos em other
		 *
		 */
		
		// EXEMPLO 1
		
		Set<String> products1 = new HashSet<>(); // O HashSet não garante o ordem
		Set<String> products2 = new TreeSet<>(); // O TreeSet ordena os itens
		Set<String> products3 = new LinkedHashSet<>(); // Mantém a ordem que os elementos foram inseridos
		
		products1.add("Notebook");
		products1.add("Tv");
		products1.add("Tablet");
		
		products1.remove("Tablet");
		
		products2.add("Notebook");
		products2.add("Tv");
		products2.add("Tablet");
		
		products2.removeIf(product -> product.length() >= 3); // Remove todo produto tal que o produto seja maior ou igual a 3
		
		products3.add("Notebook");
		products3.add("Tv");
		products3.add("Tablet");
		
		System.out.println(products1.contains("Notebook"));
		
		for (String product : products1) {
			System.out.println(product); // O HashSet não garante o ordem
		}
		
		System.out.println("------------------------------------");
		
		for (String product : products2) {
			System.out.println(product); // O TreeSet ordena os itens
		}
		
		System.out.println("------------------------------------");
		
		for (String product : products3) {
			System.out.println(product); // O TreeSet ordena os itens
		}
		
		System.out.println();
		System.out.println("------------------------------------");
		System.out.println();
		
		
		// EXEMPLO 2
		
		Set<Integer> a = new TreeSet<>(Arrays.asList(0,2,4,5,6,8,10));
		Set<Integer> b = new TreeSet<>(Arrays.asList(5,6,7,8,9,10));
		
		//union --> Une todos os elementos
		Set<Integer> c = new TreeSet<>(a);
		c.addAll(b);
		System.out.println(c);
		
		//intersection --> Retorna os elementos em comum
		Set<Integer> d = new TreeSet<>(a);
		d.retainAll(b);
		System.out.println(d);
		
		//difference --> Retorna os elementos direfentes
		Set<Integer> e = new TreeSet<>(a);
		e.removeAll(b);
		System.out.println(e);

	}

}
