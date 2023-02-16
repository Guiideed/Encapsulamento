package dadosAluno;

public class Aluno {
	private String nomeAluno;
	private int idadeAluno;
	private String aprovadoAluno;


public String getNomeAluno(){
	return nomeAluno;
}
public void setNomeAluno(String nomeAluno) {
	this.nomeAluno = nomeAluno;
}
public int getIdadeAluno(){
	return idadeAluno;
}
public void setIdadeAluno(int idadeAluno) {
	this.idadeAluno = idadeAluno;
}
public String getAprovadoAluno(){
	return aprovadoAluno;
}
public void setAprovadoAluno(String aprovadoAluno) {
	this.aprovadoAluno = aprovadoAluno;
}
public String toString() {
	return "O aluno " + getNomeAluno() + " de idade " + getIdadeAluno() + " anos foi "+ getAprovadoAluno();
}

}