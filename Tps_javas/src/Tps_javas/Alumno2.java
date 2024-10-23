package Tps_javas;

public class Alumno2 {
	public static void main(String[] args) {
		Alumno alumno = new Alumno("Juan perez", "juan.peresQgmail.com", "45768976", "2023001");
		
		//agregar notas
		alumno.agregarNota(5);
		alumno.agregarNota(7);
		alumno.agregarNota(8);
		
		//mostrar datos
		System.out.println("Nombre: " + alumno.getNombre());
		System.out.println("Mail: " + alumno.getMail());
		System.out.println("Dni: " + alumno.getDni());
		System.out.println("Legajo: " + alumno.getLegajo());
		System.out.println("Promedio: " + alumno.calcularPromedio());
	}
}
