package br.com.lojacefet.main;
import br.com.lojacefet.informatica.*;


public class Teste {
	public static void main(String[] args) {
		Teclado c1 = new Teclado();
		/* Chegando na classe do teclado (instrumento) usando o nome totalmente qualificado 
		 * para n�o confundir com o teclado inform�tica */
		br.com.lojacefet.instrumentos.Teclado c2 = new br.com.lojacefet.instrumentos.Teclado();
		c1.setCor("preto");
		c1.setNumeroTeclas(42);
		c1.setPreco(232);
		System.out.println(c1.getNumeroTeclas());
		System.out.println(c2.getNumeroSons());
		Mouse m1 = new Mouse();
	}
}
