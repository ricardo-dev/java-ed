package com.example.app.pilha;

import java.util.Stack;

import com.example.app.model.Aluno;

public class MainStack {

	public static void main(String[] args) {
		
		Stack<Aluno> pilhaAluno = new Stack<>();

		pilhaAluno.push(new Aluno("Ricardo"));
		pilhaAluno.push(new Aluno("Keritty"));
		pilhaAluno.push(new Aluno("Aquiles"));
		pilhaAluno.push(new Aluno("Rafael"));
		
		for(Aluno a: pilhaAluno) {
			System.out.println(a.toString());
		}
		
		pilhaAluno.pop();
		
		for(Aluno a: pilhaAluno) {
			System.out.println(a.toString());
		}
	}

}
