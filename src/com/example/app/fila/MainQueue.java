package com.example.app.fila;

import java.util.LinkedList;
import java.util.Queue;

import com.example.app.model.Aluno;

public class MainQueue {
	
	private int x = 0;

	public static void main(String[] args) {
		
		teste();
		
		Integer x = 0;
		Integer y = 0;
		Integer aa = 1000;
		Integer b = 1000;
		
		System.out.println(Math.sqrt(-4));
		
		Queue<Aluno> fila = new LinkedList<>();
		
		fila.offer(new Aluno("Joao"));
		fila.offer(new Aluno("Maria"));
		fila.offer(new Aluno("Jose"));
		
		System.out.println("##########");
		for(Aluno a: fila) {
			System.out.println(a.toString());
		}
		
		fila.poll();
		
		System.out.println("##########");
		for(Aluno a: fila) {
			System.out.println(a.toString());
		}
	}
	
	private int f(int x) {
		return ++x;
	}
	
	private int g(int y) {
		return x++;
	}
	
	private static int teste() {
		return (true ? null:'0');
	}
}
