package application;

import java.util.Arrays;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		
		/*
		 * 		Generics são invariantes
		 * 
		 * 	List<Object> não é o supertipo de qualquer tipo de lista:
		 * 	 	List<Object> myObjs = new ArrayList<Object>();
		 * 	  	List<Integer> MyNumbers = new ArrayList<Integer>();
		 * 	  	myObjs = myNumbers; // erro de compilação
		 * 
		 * 	O supertipo de qualquer tipo de lista é List<?>. Este é um tipo curinga:
		 * 		List<?> myObjs = new ArrayList<Object>();
		 * 		List<Integer> MyNumbers = new ArrayList<Integer>();
		 * 		myObjs = myNumbers;
		 */
		
		List<Integer> myInts = Arrays.asList(5, 2, 10);
		printList(myInts);
		
		List<String> myStrs = Arrays.asList("Maria", "Alex", "Bob");
		printList(myStrs);
		
		/*
		 * 		OBSEVAÇÃO IMPORTANTE:
		 * 
		 * 	Não é possível adicionar dados a uma coleção de tipo curinga
		 */

	}
	
	public static void printList(List<?> list) {
		for (Object obj : list) {
			System.out.println(obj);
		}
	}

}
