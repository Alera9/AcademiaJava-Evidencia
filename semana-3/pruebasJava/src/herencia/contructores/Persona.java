package herencia.contructores;

public class Persona {
	private String nombre;
	private String  fechaDeNacimiento;
	
	
	public Persona(String nombre, String fechaDeNacimiento) {
		this.nombre = nombre;
		this.fechaDeNacimiento = fechaDeNacimiento;
	}
	public Persona(String nombre) {
		this.nombre = nombre;
	}
	void dormir() {
		System.out.println("Soy " + nombre + " y Estoy durmiendo");
	}
	void respirar() {
		System.out.println("Soy " + nombre + " Estoy respirando");
	}
	void comer() {
		System.out.println("Soy " + nombre +  " Estoy comiendo");
	}

}
