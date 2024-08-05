package pruebasJava;

public class Gamma  extends Beta{

	String getType(){ return "gamma";}
	public static void main(String[] args){
		//Beta g1 = (Beta) new Alpha();
		/*Exception in thread "main" java.lang.ClassCastException: class pruebasJava.Alpha cannot be cast to class pruebasJava.Beta (pruebasJava.Alpha and pruebasJava.Beta are in unnamed module of loader 'app')
		at pruebasJava.Gamma.main(Gamma.java:7)*/
		Alpha a1 = new Gamma();
		Gamma g2 = (Gamma) a1;

		//Gamma g2 = new Beta();
		//System.out.print(g1.getType());
	}
}
