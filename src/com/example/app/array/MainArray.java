package com.example.app.array;

import java.util.ArrayList;

import com.example.app.model.Aluno;

public class MainArray {

	public static void main(String[] args) {
		
		// List<Aluno> lista = new ArrayList<>();
		ArrayList<Aluno> vetor = new ArrayList<Aluno>();
	
		vetor.add(new Aluno("Ricardo"));
		vetor.add(new Aluno("Keritty"));
		vetor.add(0, new Aluno("Aquiles"));
		
		int tamanho = vetor.size();
		
		for(Aluno a: vetor) {
			System.out.println(a.toString());
		}
		
		if(vetor.contains(new Aluno("Ricardo"))) {
			System.out.println("Achei");
		}
		
		vetor.remove(new Aluno("Ricardo")); // ou index
		vetor.remove(1);
		
		for(Aluno a: vetor) {
			System.out.println(a.toString());
		}
	}
}
