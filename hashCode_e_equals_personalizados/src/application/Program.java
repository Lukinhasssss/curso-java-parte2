package application;

import entities.Client;

public class Program {

	public static void main(String[] args) {
		
		Client client1 = new Client("Maria", "maria@gmail.com");
		Client client2 = new Client("Maria", "maria@gmail.com");
		
		String s1 = "Test";
		String s2 = "Test";
		
		System.out.println(client1.hashCode());
		System.out.println(client2.hashCode());
		System.out.println(client1.equals(client1));
		System.out.println(client1 == client2);
		System.out.println(s1 == s2);

	}

}
