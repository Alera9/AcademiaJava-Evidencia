public class TestMatrices {
	public static void main(String[] args) {
		int edades[][]= new int[3][];//3ren x 2 col
		edades[0][0] = 5;
		edades[0][1] = 7;
		edades[1][0] = 8;
		edades[1][1] = 4;
		System.out.println("edades = "+edades);
		
		for (int ren = 0; ren < edades.length; ren++) {
			for (int col = 0; col < edades[ren].length; col++) {
				System.out.print(edades[ren][col] +" ");
				
			}
			System.out.println();
			
		}
		
		String frutas[][] = {{"Naranja", "Limon"},{"Fresa","Zarzamora"},{"Manzana"}};
		for (int ren = 0; ren < frutas.length; ren++) {
			for (int col = 0; col < frutas[ren].length; col++) {
				System.out.print(frutas[ren][col] +"\t ");
				
			}
			System.out.println();
		}
	}

}
