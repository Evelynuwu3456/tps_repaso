package Tps_javas;

public class clase_persona2 {
		public static void main(String[] args) {
			clase_persona persona = new clase_persona("Juan perez", "juan.peresQgmail.com", "45768976");
			//mostrar el nombre
			System.out.println("Nombre: " + persona.getNombre());
			
			//cambiar el mail
			persona.setMail("julian.alvares@gmail.com");
			System.out.println("Mail: " + persona.getMail());
		}
	}


