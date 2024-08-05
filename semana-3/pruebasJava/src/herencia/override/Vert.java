package herencia.override;

public class Vert extends Blip {
	/*
	 * Al hacer sobreescritura de métodos debemos respetar
	 * El mismo nombre
	 * El mismo tipo de retorno en el uso de primitivos
	 * El mismo tipo de parametros y el orden
	 * no podemos reducir el nivel de acceso 
	Ejemplos de sobre escritura correcta
	********************************
	@Override
	protected int blipvert(int z) {
		return 0;
	}
	
	********************************
	*
	@Override
	public int blipvert(int z) {
		return 0;
	}
	
	*/
	
	/*¿Qué pasa cuando usamos el mismo nombre del método pero lo adaptamos
	 * Bien, podemos tener un método con el mismo nombre, equivale a una sobrecarga
	 * 
	 * 
	 * En estos casos debemos preguntarnos como se ve impacatado el performance al 
	 * momento de invocar los métodos 
	 * */
	 protected int blipvert(long x) {
		 System.out.println("Metodo en Vert");
		 return 0; } 
	 
	//private int blipvert(long x) { return 0; } //Equivale a sobrecarga
			//protected int blipvert(long x) { return 0; } // Equivale a sobrecarga
			//protected long blipvert(int x, int y) { return 0; }//Equivale a sobrecarga
			//public int blipvert(int x) { return 0; } //Equivale a sobreescritura
			//private int blipvert(int x) { return 0; } //Sobreescritura no permitida
			//protected long blipvert(int x) { return 0; } 
	 /*En este caso no esta permitido por que equivale a una sobreescritura al momento de 
	  * llamar el método y no se podrá distinngir como en el caso de que cambie sus parametros
	  */
			//protected long blipvert(long x) { return 0; }
	

}
