package Tps_javas;

import java.util.ArrayList;

public class Alumno extends clase_persona {
	private String legajo;
	private ArrayList<Integer> notas;

	//constructor
	public Alumno(String nombre, String mail, String dni, String legajo) {
		super(nombre, mail, dni);//llama al constructor de la clase padre sine sto no se puede usar la clase persona y muere todo jajajajaj
		this.legajo = legajo;
		this.notas = new ArrayList<>();
	}
	
	//getter y setters para legajo
	public String getLegajo(){
		return legajo;
	}
	public void setLegajo(String legajo) {
		this.legajo = legajo;
	}
	
	//metodo para agregar una nota
	public void agregarNota(int nota) {
		this.notas.add(nota);
	}
	
	//metodo para obtener las notas
	public ArrayList<Integer> getNotas(){
		return notas;
	}
	
	//metodo para calcular el promedio de las notas
	public double calcularPromedio() {
		if (notas.isEmpty()) return 0.0;
		
		int suma = 0;
		for (int nota : notas) {
			suma += nota;
		}
		return (double)suma / notas.size();
	}
}
