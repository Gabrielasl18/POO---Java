package associacao;

public class Seminario {
	private String titulo;
	private Alunos[] alunos;
	private Professor professor;
	private Local local;
	
	
	public Seminario(String titulo) {
		this.titulo = titulo;
	}
	public Seminario() {	
	}
	public void print() {
		System.out.println("-------------RELAT�RIO DE SEMIN�RIO-------------");
		System.out.println("T�tulo: " + this.titulo);
		System.out.println("Professor palestrante: " + this.professor.getNome());
		if(this.local != null) {
			System.out.println("Local, rua: " + this.local.getRua() + "Bairro: " + this.local.getBairro());
		}else {
			System.out.println("Nenhum local cadastrado para esse semin�rio");
		}
		if(alunos != null && alunos.length != 0) {
			System.out.println("--------------ALUNOS PARTICIPANTES--------------");
			for(Alunos alunos : alunos) {
				System.out.println(alunos.getNome());
			}
			return;
		}
		System.out.println("Nenhum aluno cadastrado.");
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public Alunos[] getAlunos() {
		return alunos;
	}
	public void setAlunos(Alunos[] alunos) {
		this.alunos = alunos;
	}
	public Professor getProfessor() {
		return professor;
	}
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	public Local getLocal() {
		return local;
	}
	public void setLocal(Local local) {
		this.local = local;
	}
	

	
}
