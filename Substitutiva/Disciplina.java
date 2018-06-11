package Substitutiva;

public class Disciplina {

	String nome;
	double nota1;
	double nota2;
	double notaSub;
	double menorNota;
	
	public double calcMenor (double nota1, double nota2) {
		if(nota1 <= nota2) {
			menorNota = nota1;
		}
		else if(nota2 < nota1) {
			menorNota = nota2;
		}
		return menorNota;
	}
	

}
