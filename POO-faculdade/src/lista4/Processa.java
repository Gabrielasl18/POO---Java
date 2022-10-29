package lista4;


/* Corrigido - erro ao chamar um m�todo n�o est�tico sem inst�nciar a classe
 * 
 * solu��o - instanciar um objeto ou passar o m�todo chamado para est�tico
 * 
 * met�dos est�ticos geralmente utilizados visando o compartilhamento de informa��es entre os objetos
 * e para acesso direto aos atributos da classe, sem necessidade de existir algum objeto instanciado na classe
 * 
 * */
public class Processa {
	public static void main(String[] args) {
		System.out.println(calcula(2,3));
	}
	public static double calcula(double a, double b) {
		return (a+b) * (a*0.1) + (b*0.9);
	}
}
