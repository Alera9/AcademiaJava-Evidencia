class ScopeTest{
	static int x = 5;
	public static void main(String[] args){
		int x = (ScopeTest.x=3) * 4;
		// int x = (x=3)*4; es lo mismo e imprime la x local
		int a = 1;
		int b = 1;
		a += (a=3);// equivale a: a = 1 +3;
		b = b + (b=3); // equivale a: b = 1 +3;
		//System.out.println(x);
		System.out.println(a);
		System.out.println(b);
	}
}