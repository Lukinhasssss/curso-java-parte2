package application;

import java.util.Scanner;

import services.PrintService;

public class Program {

	public static void main(String[] args) {
		
		/*
		 *	� Generics permitem que classes, interfaces e m�todos possam ser parametrizados
		 *	  por tipo. Seus benef�cios s�o:
		 *	    � Reuso
		 *	    � Type safety
		 *	    � Performance
		 *
		 *	� Uso comum: cole��es
		 *
		 *	  List<String> list = new ArrayList<>();
		 *	  list.add("Maria");
		 *	  String name = list.get(0);
		 */
		
		/*
		 * 	Exemplo utilizando generics
		 * 
		 * 	  Deseja-se fazer um programa que leia uma quantidade M, e depois N n�meros inteiros.
		 * 	Ao final, imprima esses n�meros de forma organizada. Em seguida, informar qual foi o
		 * 	primeiro valor informado.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		PrintService<Integer> printService = new PrintService<>();
		
		System.out.print("How many values? ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			int value = sc.nextInt();
			printService.addValue(value);
		}
		
		printService.print();
		Integer x = printService.first();
		System.out.println("First: " + x);
		
		sc.close();

	}

}
