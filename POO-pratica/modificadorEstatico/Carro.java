package modificadorEstatico;

public class Carro {
//velocidade limite deve ser 240km/h
	private String nome;
	private double velocidadeMaxima;
	//public static double velocidadeLimite = 240;//atributo est�tico, se voc� alterar, todos os objetos ser�o alterados, pois os objetos s�o pertencentes a classe;
	private static double velocidadeLimite = 240;
	
	public Carro(String nome, double velocidadeMaxima) {
		this.nome = nome;
		this.velocidadeMaxima = velocidadeMaxima;
	} 
	public void print() {
		System.out.println("--------------------------- ");
		System.out.println("Nome " + this.nome);//t� acessando um atributo de classe,ou seja, n�o podemos usar publid static void,caso precise acessar, deve mudar o objeto para est�tico
		System.out.println("Velocidade Maxima " + velocidadeMaxima);
		System.out.println("Velocidade Limite " + velocidadeLimite);/* n�o existe mais o this porque apesar dele acessar o valor do objeto,mas atributos est�ticos 
		n�o fazem parte do objeto e sim da classe, ent�o foi removido*/
	}
	public Carro() {	 
	}
	public static void setVelocidadeLimite(double velocidadeLimite) {
		Carro.velocidadeLimite = velocidadeLimite; //usar a Classe para ter o acesso, usar isso no lugar do this, pois est� associado a uma classe e n�o a um objeto
		
	}
	public static double getVelocidadeLimite() {
		return velocidadeLimite;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getVelocidadeMaxima() {
		return velocidadeMaxima;
	}
	public void setVelocidadeMaxima(double velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}
}