package set;

import java.util.HashSet;
import java.util.Iterator;

/* 
Toda classe que diretamente ou indiretamente implementa iterator, 
precisa implementar iterator, que � como percorre aquela estrutura.
*/

public class HashSetTeste {
	public static void main(String[] args) {
		HashSet x = new HashSet<>();
		x.add("gabi");
		tam(x);
	
	}
	public static void tam(HashSet x) {
		Iterator it = x.iterator();
		double soma = 0;
		while(it.hasNext()) {
			String S = (String) it.next();
			soma += S.length();
		}
		System.out.println(soma/x.size());
	}
}
/* 
List x = new ArrayList(); n�o faz diferen�a, mas se criar um m�todo e p�r no par�metro List x, tem, pois vai generalizar 
e se mudar a List da declara��o pra outra interface que tenha List, vai ser mais f�cil de manusear e n�o vai precisar criar v�rios
outros par�metros pra englobar as outras classes que n�o possuem a interface List 
*/
