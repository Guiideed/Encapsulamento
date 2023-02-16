package programa;

import java.util.Locale;
import java.util.Scanner;
import dadosAluno.Aluno;
public class ProgramaPrinc {
	public static void main(String[]args) {
		
		Scanner leitor = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		Aluno aluno = new Aluno();
		
		System.out.println("Qual o nome do aluno?: ");
		aluno.setNomeAluno(leitor.next());
		
		System.out.println("Qual a idade do aluno: ");
		aluno.setIdadeAluno(leitor.nextInt());
		
		System.out.println("Resultado do aluno: ");
		aluno.setAprovadoAluno(leitor.next());
		
		System.out.println(aluno.toString());
		
		leitor.close();
	}

}
