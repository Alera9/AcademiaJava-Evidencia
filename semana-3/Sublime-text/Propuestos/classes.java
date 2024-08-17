class Test {
	public static void main(String[] args) {
		int b = 4;
		b--;
		System.out.println(--b);
		System.out.println(b);
	}
}
class Sheep {
	public static void main(String[] args) {
		int ov = 999;
		ov--;
		System.out.println(--ov);
		System.out.println(ov);
	}
} 



class Y{
	public static void main(String[] args) throws IOException {
		try {
			doSomething();
		}catch (RuntimeException exception){
			System.out.println(exception);
		}
	}
	static void doSomething() throws IOException {
		if (Math.random() > 0.5){

		}
		throw new RuntimeException();
	}
}

class Manager implements Interviewer{
	int interviewConducted() {
		return 0;
	}
}
interface Interviewer {
	abstract int interviewConducted();
}


public class Main {
	public static void main(String[] args) {
		try (Connection con = DriverManager.getConnection(url, uname,
				pwd)){
			Statement stmt =con.createStatement();
			System.out.print(stmt.exeuteUpdate("INSERT INTO User VALUES (500, 'Ramesh')"));
		}
	}
}


class App {
	public static void main(String[] args) {
		String[] fruits = {"banana", "apple", "pears", "grapes"};
		// Ordenar el arreglo de frutas utilizando compareTo
		Arrays.sort(fruits, (a, b) -> a.compareTo(b));
		// Imprimir el arreglo de frutas ordenado
		for (String s : fruits) {
			System.out.println(""+s);
		}
	}
}

class Circuit {
	public static void main(String[] args) {
		runlap();
		int c1=c2;
		int c2 = v;
	}
	static void runlap(){
		System.out.println(v);
	}
	static int v;
}



public class Shop{
	public static void main(String[] args) {
		new Shop().go("welcome",1);
		new Shop().go("welcome", "to", 2);
	}
	public void go (String... y, int x){
		System.out.print(y[y.length-1]+"");
	}
}


class Plant {
	Plant() {
		System.out.println("plant");
	}
}
class Tree extends Plant {
	Tree(String type) {
		System.out.println(type);
	}
}
class Forest extends Tree {
	Forest() {
		super("leaves");
		new Tree("leaves");
	}
	public static void main(String[] args) {
		new Forest();
	}
}

class Test {
	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = new String ("hello");
		s2=s2.intern(); 
		System.out.println(s1==s2);
	}
} 


public class Main extends count {
	public static void main(String[] args) {
		int a = 7;
		System.out.println(count(a,6));
	}
}
class count {
	int count(int x, int y){return x+y;}
}



public class Main{
	public static void main(String[] args) {
		List<E> p =new ArrayList<>();
		p.add(2);
		p.add(1);
		p.add(7);
		p.add(4);
	}
} 

public class Car{
	private void accelerate(){
		System.out.println("car acelerating");
	}
	private void break(){
		System.out.println("car breaking");
	}
	public void control (boolean faster){
		if(faster==true)
			accelerate();
		else
			break();
	}
	public static void main (String [] args){
		Car car = new Car();

		car.control(false);
	}
} 


class App {
	App(){
		System.out.println("1");
	}
	App(int num){
		System.out.println("2");
	}
	App(Integer num){
		System.out.println("3");
	}
	App(Object num){
		System.out.println("4");
	}
	public static void main(String[] args) {
		String[]sa = {"333.6789","234.111"};
		NumberFormat inf= NumberFormat.getInstance();
		inf.setMaximumFractionDigits(2);
		for(String s:sa){
			System.out.println(inf.parse(s));
		}
	}

} 


class Y{
	public static void main(String[] args) {
		String s1 = "OCAJP";
		String s2 = "OCAJP" + "";
		System.out.println(s1 == s2);
	}
} 

class Y{
	public static void main(String[] args) {
		int score = 60;
		switch (score) {
		default:
			System.out.println("Not a valid score");
		case score < 70:
			System.out.println("Failed");
		break;
		case score >= 70:
			System.out.println("Passed");
		break;
		}
	}
}


class Y{
	public static void main(String[] args) {
		int a = 100;
		System.out.println(-a++);
	}
} 


// salida -100


class Y{
	public static void main(String[] args) {
		byte var = 100;
		switch(var) {
		case 100:
			System.out.println("var is 100");
			break;
		case 200:
			System.out.println("var is 200");
			break;
		default:
			System.out.println("In default");
		}
	}
}


class Y{
	public static void main(String[] args) {
		A obj1 = new A();
		B obj2 = (B)obj1;
		obj2.print();
	}
}
class A {
	public void print(){
		System.out.println("A");
	}
}
class B extends A {
	public void print(){
		System.out.println("B");
	}
}

