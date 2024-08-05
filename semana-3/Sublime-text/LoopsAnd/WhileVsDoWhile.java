public class WhileVsDoWhile{
	public static final void main(String [] args){
		int x = 0;
		System.out.println("INICIO ");
		do{			
			if(x % 3 == 0){
				System.out.print(" continue ");
				x++;
				continue;//continue sirve para continuar con la siguiente iteración
				//break;//Rompe con el ciclo
			} 
			System.out.print(x++ +" ");
			
		}while(x<20);

		System.out.println(" FIN");
		x = 0;
		System.out.println("INICIO ");
		while(x<20){			
			if(x % 3 == 0){
				System.out.print(" continue ");
				x++;
				continue;//continue sirve para continuar con la siguiente iteración
				//break;//Rompe con el ciclo
			} 
			System.out.print(x++ +" ");			
		};
		System.out.print(" FIN");

	} 
}