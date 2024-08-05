package herencia.contructores;

public class TestPersonas {

	public static void main(String[] args) {
		Persona est =  new Estudiante("Mazy");
		Persona emp = new Empleado();
		est.dormir();
		emp.dormir();

	}

}
