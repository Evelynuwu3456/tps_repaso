package Tps_javas;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class numero_determinado {

	public static void main(String[] args) {
		ArrayList<Integer>numeros = new ArrayList<>();
		Random random = new Random();
		for(int i=0;i<100;i++) {
			int numeroAleatorio = random.nextInt(99)+1;
			numeros.add(numeroAleatorio);
		}
		//System.out.println("Lista de 100 numeros aleatorios: " + numeros);
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introdusca un número entre 1 y 99 para buscar:  ");
		int numeroBuscado = scanner.nextInt();
	
		if(numeros.contains(numeroBuscado)) {
		System.out.println("El numero buscado: " + numeroBuscado + " fue encontrado en la lista");
		}
		else{
		System.out.println("El numero buscado: " + numeroBuscado + " no fue encontrado en la lista");
			}
		scanner.close();
		}
		
	}
	

