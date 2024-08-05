package herencia.override;

public class TestBlip {
	public static void main(String[] args) {
		/*
		 * Voy a crear 1 instancia de Vert, y lo voy a asignar
		 * en dos variables diferentes*/
		
		Vert vertInVert  = new Vert();
		Blip vertInBlip = vertInVert;
		
		long num = 1;
		
		/* Vamos a analizar que pasa con el método Blipvert()*/
		System.out.println(vertInVert.blipvert(num));
		System.out.println(vertInBlip.blipvert(2));
		
	}
}
