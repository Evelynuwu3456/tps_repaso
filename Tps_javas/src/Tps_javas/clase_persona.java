package Tps_javas;

public class clase_persona {
	private String nombre;
	private String mail;
	private String dni;

	//constructor
	public clase_persona(String nombre, String mail, String dni) {
		this.nombre = nombre;
		this.mail = mail;
		this.dni = dni;
	
	}
	
	//Getter y Setters para nombre
	public String getNombre() {
		return nombre;
	}
	 public void setNombre(String nombre) {
		 this.nombre = nombre;
	 }
	 
	//Getter y Setter para mail
	 public String getMail() {
		 return mail;
	 }
	 public void setMail(String mail) {
		 this.mail = mail;
	 }
	 //Getter y Setter para dni
	 public String getDni() {
		 return dni;
	 }
	 public void setDni(String dni) {
		 this.dni = dni;
	 }
}
