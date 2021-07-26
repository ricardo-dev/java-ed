package com.example.app.linkedlist;

import java.util.LinkedList;

import com.example.app.model.Aluno;

public class MainLinkedList {

	public static void main(String[] args) {
		
		LinkedList<Aluno> lista = new LinkedList<>();
		
		lista.add(new Aluno("Rafael"));
		lista.add(new Aluno("João"));
		lista.add(new Aluno("Ana"));
		
		print(lista);
		
		lista.addFirst(new Aluno("Marcio"));
		lista.addLast(new Aluno("Regina"));
		
		print(lista);
		
		lista.removeFirst();
		lista.removeLast();
		
		print(lista);
		
		lista.add(2, new Aluno("Mara"));
		
		print(lista);
		
		lista.remove(new Aluno("Mara"));
		lista.remove(1);
		
		print(lista);
	}
	
	public static void print(LinkedList<Aluno> L) {
		System.out.println("\n############");
		for(Aluno a:L) {
			System.out.println(a.toString());
		}
	}
}
