package Tps_javas;

import java.util.ArrayList;
import java.util.Random;

public class Arraylist {
	public static void main (String[] args) {
		ArrayList<Integer> numeros = new ArrayList<>();
		Random random = new Random();
		for(int i=0;i<100;i++) {
			int numeroAleatorio = random.nextInt(99)+1;
			numeros.add(numeroAleatorio);
		}
		System.out.println("Lista de 100 numeros aleatorios: ");
		for(int numero : numeros) {
			System.out.println(numero);
		}
	}
}
