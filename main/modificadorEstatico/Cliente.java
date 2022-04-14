/*
  								UML
 CARDINALIDADE,quer dizer qual tipo de relacionamento eles t�m
 
 (1) Pessoa deve estar cadastrada OBRIGATORIAMENTE em 1 departamento.
 (0..1) Pessoa deve estar cadastrada OBRIGATORIAMENTE em 0 ou 1 departamentos.
 (1..*) Pessoa deve estar cadastrada OBRIGATORIAMENTE em 0 ou + departamentos.
 (*) Pessoa deve estar cadastrada OBRIGATORIAMENTE em 0 ou + departamentos; 
 
 */
package modificadorEstatico;

public class Cliente {
	// 0 - Bloco de inicializa��o est�tico � executado quando a JVM carregar a classe;
	// 1 - Alocado espa�o na mem�ria para o objeto que ser� criado;
	// 2 - Cada atributo de classe � criado e inicializado com seus valores default ou valores expl�citos;
	// 3 - Bloco de inicializa��o � exeecutado;
	// 4 - O construtor � executado.
	
	private static int[] parcelas; //vamos executar s� uma vez, por conta do static
	static {	// s� sera executado 1 vez
		parcelas = new int[100];
		System.out.println("Dentro do bloco de inicializacao estatico");
		for(int i=1;i<=100;i++) {
			parcelas[i-1] = i;
		}
	}
	public Cliente() {
		
	}
	public static int[] getParcelas() {
		return parcelas;
	}
	

}
