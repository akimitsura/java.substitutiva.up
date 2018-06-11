package Substitutiva;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		
		String info = "Informe o nome da disiciplina";
		String inf1 = "Informe a primeira nota";
		String inf2 = "Informe a segunda nota";
		String inf3 = "Informe a nota da substitutiva";
		String fim = "Lancamento concluido";
		String erro = "Opcao invalida";
		int op = 0;
		int opn = 0;
		Scanner sc = new Scanner (System.in);
		Disciplina[] disciplinas = new Disciplina[7];
		
		
		Disciplina d1 = new Disciplina();
		System.out.println(info);
		d1.nome = sc.nextLine();
		System.out.println(inf1);
		d1.nota1 = Double.parseDouble(sc.nextLine());
		System.out.println(inf2);
		d1.nota2 = Double.parseDouble(sc.nextLine());
		disciplinas[0] = d1;
		System.out.println("Realizou a substitutiva: ");
		System.out.println("1 -> Sim");
		System.out.println("2 -> Nao");
		op = Integer.parseInt(sc.nextLine());
		if(op == 1) {
			System.out.println(inf3);
			d1.notaSub = Double.parseDouble(sc.nextLine());
		}
		else if(op == 2) {
			System.out.println(fim);
		}
		else {
			System.out.println(erro);
		}		
		System.out.println("\n##############\n");

		Disciplina d2 = new Disciplina();
		System.out.println(info);
		d2.nome = sc.nextLine();
		System.out.println(inf1);
		d2.nota1 = Double.parseDouble(sc.nextLine());
		System.out.println(inf2);
		d2.nota2 = Double.parseDouble(sc.nextLine());
		disciplinas[1] = d2;
		System.out.println("Realizou a substitutiva: ");
		System.out.println("1 -> Sim");
		System.out.println("2 -> Nao");
		op = Integer.parseInt(sc.nextLine());
		if(op == 1) {
			System.out.println(inf3);
			d2.notaSub = Double.parseDouble(sc.nextLine());
		}
		else if(op == 2) {
			System.out.println(fim);
		}
		else {
			System.out.println(erro);
		}
		System.out.println("\n##############\n");
		
		Disciplina d3 = new Disciplina();
		System.out.println(info);
		d3.nome = sc.nextLine();
		System.out.println(inf1);
		d3.nota1 = Double.parseDouble(sc.nextLine());
		System.out.println(inf2);
		d3.nota2 = Double.parseDouble(sc.nextLine());
		disciplinas[2] = d3;
		System.out.println("Realizou a substitutiva: ");
		System.out.println("1 -> Sim");
		System.out.println("2 -> Nao");
		op = Integer.parseInt(sc.nextLine());
		if(op == 1) {
			System.out.println(inf3);
			d3.notaSub = Double.parseDouble(sc.nextLine());
		}
		else if(op == 2) {
			System.out.println(fim);
		}
		else {
			System.out.println(erro);
		}
		System.out.println("##############\n");
		
		Disciplina d4 = new Disciplina();
		System.out.println(info);
		d4.nome = sc.nextLine();
		System.out.println(inf1);
		d4.nota1 = Double.parseDouble(sc.nextLine());
		System.out.println(inf2);
		d4.nota2 = Double.parseDouble(sc.nextLine());
		disciplinas[3] = d4;
		System.out.println("Realizou a substitutiva: ");
		System.out.println("1 -> Sim");
		System.out.println("2 -> Nao");
		op = Integer.parseInt(sc.nextLine());
		if(op == 1) {
			System.out.println(inf3);
			d4.notaSub = Double.parseDouble(sc.nextLine());
		}
		else if(op == 2) {
			System.out.println(fim);
		}
		else {
			System.out.println(erro);
		}
		System.out.println("##############\n");
		
		Disciplina d5 = new Disciplina();
		System.out.println(info);
		d5.nome = sc.nextLine();
		System.out.println(inf1);
		d5.nota1 = Double.parseDouble(sc.nextLine());
		System.out.println(inf2);
		d5.nota2 = Double.parseDouble(sc.nextLine());
		disciplinas[4] = d5;
		System.out.println("Realizou a substitutiva: ");
		System.out.println("1 -> Sim");
		System.out.println("2 -> Nao");
		op = Integer.parseInt(sc.nextLine());
		if(op == 1) {
			System.out.println(inf3);
			d5.notaSub = Double.parseDouble(sc.nextLine());
		}
		else if(op == 2) {
			System.out.println(fim);
		}
		else {
			System.out.println(erro);
		}
		System.out.println("##############\n");
		
		Disciplina d6 = new Disciplina();
		System.out.println(info);
		d6.nome = sc.nextLine();
		System.out.println(inf1);
		d6.nota1 = Double.parseDouble(sc.nextLine());
		System.out.println(inf2);
		d6.nota2 = Double.parseDouble(sc.nextLine());
		disciplinas[5] = d6;
		System.out.println("Realizou a substitutiva: ");
		System.out.println("1 -> Sim");
		System.out.println("2 -> Nao");
		op = Integer.parseInt(sc.nextLine());
		if(op == 1) {
			System.out.println(inf3);
			d6.notaSub = Double.parseDouble(sc.nextLine());
		}
		else if(op == 2) {
			System.out.println(fim);
		}
		else {
			System.out.println(erro);
		}
		System.out.println("\n##############\n");
		
		Disciplina d7 = new Disciplina();
		System.out.println(info);
		d7.nome = sc.nextLine();
		System.out.println(inf1);
		d7.nota1 = Double.parseDouble(sc.nextLine());
		System.out.println(inf2);
		d7.nota2 = Double.parseDouble(sc.nextLine());
		disciplinas[6] = d7;
		System.out.println("Realizou a substitutiva: ");
		System.out.println("1 -> Sim");
		System.out.println("2 -> Nao");
		op = Integer.parseInt(sc.nextLine());
		if(op == 1) {
			System.out.println(inf3);
			d7.notaSub = Double.parseDouble(sc.nextLine());
		}
		else if(op == 2) {
			System.out.println(fim);
		}
		else {
			System.out.println(erro);
		}
		System.out.println("##############\n");
		
		for(int i = 0; i<7; i++) {
			System.out.println("Disciplina: "+disciplinas[i].nome);
			System.out.println("1o - Bimestre: "+disciplinas[i].nota1);
			System.out.println("2o - Bimestre: "+disciplinas[i].nota2);
			System.out.println("Substitutiva: "+disciplinas[i].notaSub);
			System.out.println("________________");
		}
		
		System.out.println("###############################\n\n\n");
		
		if(d1.notaSub > 0) {
			if (d1.nota1 <= d1.nota2) {
				d1.menorNota = d1.nota1;
				opn = 1;
			}
			if (d1.nota2 < d1.nota1) {
				d1.menorNota = d1.nota2;
				opn = 2;
			}
		//	d1.calcMenor(d1.nota1, d1.nota2);
			if((opn == 1) && (d1.nota1 < d1.notaSub)) {
				d1.nota1 = d1.notaSub;
			}
			if((opn == 2) && (d1.nota2 < d1.notaSub)){
				d1.nota2 = d1.notaSub;
			}
		}
		
		if(d2.notaSub > 0) {
			if(d2.nota1 <= d2.nota2) {
				d2.menorNota = d2.nota1;
				opn = 1;
			}
			if(d2.nota2 < d2.nota1) {
				d2.menorNota = d2.nota2;
				opn = 2;
			}
			if((opn == 1) && (d2.nota1 < d2.notaSub)) {
				d1.nota1 = d1.notaSub;
			}
			if((opn == 2) && (d2.nota2 < d2.notaSub)){
				d1.nota2 = d1.notaSub;
			}
		}
		
		if(d3.notaSub > 0) {
			if(d3.nota1 <= d3.nota2) {
				d3.menorNota = d3.nota1;
				opn = 1;
			}
			if(d3.nota2 < d3.nota1) {
				d3.menorNota = d3.nota2;
				opn = 2;
			}
			if((opn == 1) && (d3.nota1 < d3.notaSub)) {
				d3.nota1 = d3.notaSub;
			}
			if((opn == 2) && (d3.nota2 < d3.notaSub)){
				d3.nota2 = d3.notaSub;
			}
		}
		
		if(d4.notaSub > 0) {
			if(d4.nota1 <= d4.nota2) {
				d4.menorNota = d4.nota1;
				opn = 1;
			}
			if(d4.nota2 < d4.nota1) {
				d4.menorNota = d4.nota2;
				opn = 2;
			}
			if((opn == 1) && (d4.nota1 < d4.notaSub)) {
				d4.nota1 = d4.notaSub;
			}
			if((opn == 2) && (d4.nota2 < d4.notaSub)){
				d4.nota2 = d4.notaSub;
			}
		}
		
		
		if(d5.notaSub > 0) {
			if(d5.nota1 <= d5.nota2) {
				d5.menorNota = d5.nota1;
				opn = 1;
			}
			if(d5.nota2 < d5.nota1) {
				d5.menorNota = d5.nota2;
				opn = 2;
			}
			if((opn == 1) && (d5.nota1 < d5.notaSub)) {
				d5.nota1 = d5.notaSub;
			}
			if((opn == 2) && (d5.nota2 < d5.notaSub)){
				d5.nota2 = d5.notaSub;
			}
		}
		
		
		if(d6.notaSub > 0) {
			if(d6.nota1 <= d6.nota2) {
				d6.menorNota = d6.nota1;
				opn = 1;
			}
			if(d6.nota2 < d6.nota1) {
				d6.menorNota = d6.nota2;
				opn = 2;
			}
			if((opn == 1) && (d6.nota1 < d6.notaSub)) {
				d6.nota1 = d6.notaSub;
			}
			if((opn == 2) && (d6.nota2 < d6.notaSub)){
				d6.nota2 = d6.notaSub;
			}
		}
		
		
		if(d7.notaSub > 0) {
			if(d7.nota1 <= d7.nota2) {
				d7.menorNota = d7.nota1;
				opn = 1;
			}
			if(d7.nota2 < d7.nota1) {
				d7.menorNota = d7.nota2;
				opn = 2;
			}
			if((opn == 1) && (d7.nota1 < d7.notaSub)) {
				d7.nota1 = d7.notaSub;
			}
			if((opn == 2) && (d7.nota2 < d7.notaSub)){
				d7.nota2 = d7.notaSub;
			}
		}
		
		
		
		for(int i = 0; i<7; i++) {
			System.out.println("Disciplina: "+disciplinas[i].nome);
			System.out.println("1o - Bimestre: "+disciplinas[i].nota1);
			System.out.println("2o - Bimestre: "+disciplinas[i].nota2);
			System.out.println("Substitutiva: "+disciplinas[i].notaSub);
			System.out.println("________________");
		}
		
		
		sc.close();

	}

}
