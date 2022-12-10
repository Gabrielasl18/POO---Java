package lista5;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
	
		try (Scanner sc = new Scanner(System.in)) {
			Set<String> x =	 new HashSet<String>();
			List<Aluno> aluno = new ArrayList<Aluno>();
			String stringHashtag;
			
			System.out.println("entre com as string no formato id#nome#nota#tipo.\n");
			/*Adicionando stringss*/
			for(int i=0; i<5; i++) {
				stringHashtag = sc.next();
				x.add(stringHashtag);
			}
			
			System.out.println("\n criando alunos.\n");
			/*Pegando apenas o retorno values(Aluno) de um map no m�todo Utils e adicionando num list aluno*/
			aluno.addAll(Utils.retornaDados(x).values());
			
			System.out.println("\n exibindo alunos com nomes ordenados em ordem alfab�tica.\n");
			/*M�todo que ordena um list de alunos*/
			Utils.ordena(aluno);
			
			/*Exibe cada aluno com nomes ordenados em ordem alfab�tica e suas respectivas notas*/
			for(int i=0; i<aluno.size();i++) {				
				System.out.println("nome-> " + aluno.get(i).getNome() + " nota:: " + aluno.get(i).getNota());
			}
		}
	}
}
