package application;

import java.util.HashMap;
import java.util.Map;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		/*
		 * 	Map<K,V>
		 * 
		 * 	� � uma cole��o de pares chave/valor
		 * 		� N�o admite repeti��es do objeto chave
		 * 		� Os elementos s�o indexados pelo objeto chave (n�o possuem posi��o)
		 * 		� Acesso, inser��o e remo��o de elementos s�o r�pidos
		 * 
		 * 	� Uso comum: cookies, local storage, qualquer modelo chave-valor
		 * 
		 * 	� Principais implementa��es:
		 * 		� HashMap - mais r�pido (opera��es 0(1) em tabela hash) e n�o ordenado
		 * 		� TreeMap - mais lento (opera��es 0(log(n)) em �rvore rubro-negra) e
		 * 		  ordenado pelo compareTo do objeto (ou Comparator)
		 * 		� LinkedHashMap - velocidade intermedi�ria e elementos na ordem em que s�o adicionados
		 * 
		 * 	Alguns m�todos importantes
		 * 
		 * 	� put(key, value), remove(key), containsKey(key), get(key)
		 * 		� Baseado em equals e hashCode
		 * 		� Se equals e hashCode n�o existir, � usada compara��o de ponteiros
		 * 
		 * 	� clear()
		 * 	� size()
		 * 
		 * 	� keySet() - retorna um Set<K>
		 * 	� values() - retorna um Collection<V>
		 */
		
//		Map<String, String> cookies = new TreeMap<>();
//		
//		cookies.put("username", "Maria");
//		cookies.put("email", "maria@gmail.com");
//		cookies.put("phone", "40028922");
//		
//		cookies.remove("email");
//		cookies.put("phone", "90214030");
//		
//		System.out.println("Contains 'phone' key: " + cookies.containsKey("phone"));
//		System.out.println("Phone number: " + cookies.get("phone"));
//		System.out.println("Email: " + cookies.get("email"));
//		System.out.println("Size: " + cookies.size());
//		
//		System.out.println("ALL COOKIES:");
//		for (String key: cookies.keySet()) {
//			System.out.println(key + ": " + cookies.get(key));
//		}
		
		
		Map<Product, Double> stock = new HashMap<>();
		Product product1 = new Product("Tv", 900.0);
		Product product2 = new Product("Notebook", 1200.0);
		Product product3 = new Product("Tablet", 400.0);
		
		stock.put(product1, 10000.0);
		stock.put(product2, 20000.0);
		stock.put(product3, 15000.0);
		
		Product ps = new Product("Tv", 900.0);
		
		System.out.println("Contains 'ps' key: " + stock.containsKey(ps));

	}

}
