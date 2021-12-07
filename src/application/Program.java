package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.Matricula;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Set<Matricula> matriculas = new HashSet<>();
		
		System.out.print("How many students for course A? ");
		int cursoA = sc.nextInt();
		for (int i=0; i<cursoA; i++) {
			int codigo = sc.nextInt();
			matriculas.add(new Matricula(codigo, 'A'));
		}
		System.out.print("How many students for course B? ");
		int cursoB = sc.nextInt();
		for (int i=0; i<cursoB; i++) {
			int codigo = sc.nextInt();
			matriculas.add(new Matricula(codigo, 'B'));
		}
		System.out.print("How many students for course C? ");
		int cursoC = sc.nextInt();
		for (int i=0; i<cursoC; i++) {
			int codigo = sc.nextInt();
			matriculas.add(new Matricula(codigo, 'C'));
		}
		
		System.out.println("Total students: " + matriculas.size());
		
		sc.close();
	}

}
