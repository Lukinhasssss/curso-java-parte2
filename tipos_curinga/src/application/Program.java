package application;

import java.util.Arrays;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		
		/*
		 * 		Generics s�o invariantes
		 * 
		 * 	List<Object> n�o � o supertipo de qualquer tipo de lista:
		 * 	 	List<Object> myObjs = new ArrayList<Object>();
		 * 	  	List<Integer> MyNumbers = new ArrayList<Integer>();
		 * 	  	myObjs = myNumbers; // erro de compila��o
		 * 
		 * 	O supertipo de qualquer tipo de lista � List<?>. Este � um tipo curinga:
		 * 		List<?> myObjs = new ArrayList<Object>();
		 * 		List<Integer> MyNumbers = new ArrayList<Integer>();
		 * 		myObjs = myNumbers;
		 */
		
		List<Integer> myInts = Arrays.asList(5, 2, 10);
		printList(myInts);
		
		List<String> myStrs = Arrays.asList("Maria", "Alex", "Bob");
		printList(myStrs);
		
		/*
		 * 		OBSEVA��O IMPORTANTE:
		 * 
		 * 	N�o � poss�vel adicionar dados a uma cole��o de tipo curinga
		 */

	}
	
	public static void printList(List<?> list) {
		for (Object obj : list) {
			System.out.println(obj);
		}
	}

}
