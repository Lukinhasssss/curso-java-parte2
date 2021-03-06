package application;

public class Program {

	public static void main(String[] args) {
		
		/*
		 * 		hashCode and equals
		 * 
		 * 	� S�o opera��es da classe Object utilizadas para comparar se um objeto � igual a outro
		 * 
		 * 	� equals: lento, resposta 100%
		 *  � hashCode: r�pido, por�m resposta positiva n�o � 100%
		 *  
		 *  � Tipos comuns (String, Date, Integer, Double, etc.) j� possuem implementa��o para essas
		 *    opera��es. Classes personalizadas precisam sobrep�-las.
		 *  
		 */
		
		// equals --> M�todo que compara se o objeto � igual a outro, retornando true ou false.
		
		String a = "Maria";
		String b = "Jo�o";
		
		System.out.println(a.equals(b));
		
		// hashCode --> M�todo que retorna um n�mero inteiro representando um c�digo gerado a partir das informa��es do objeto
		
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		
		/*
		 *  Regra de oudo do hashCode
		 *  
		 *  	� Se o hashCode de dois objetos for diferente, ent�o os dois objetos s�o diferentes
		 *  	� Se o c�digo de dois objetos for igual, muito provavelmente os objetos s�o iguais (pode haver colis�o)
		 */

	}

}
