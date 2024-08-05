public class EjemploDoWhile{
	public static final void main(String [] args){
		int x = 1;
		System.out.println("INICIO ");
		do{			
			if(x % 3 == 0){
				System.out.print(" continue ");
				x++;
				//continue;//continue sirve para continuar con la siguiente iteración
				break;//Rompe con el ciclo
			} 
			System.out.print(x+" ");
			x++;
			
		}while(x<=18);
		System.out.print(" FIN");

	} 
	
}