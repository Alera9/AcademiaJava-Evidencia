class Base{
   public short getValue(){ return 1; } //1
}
/*class Base2 extends Base{
   public byte getValue(){ return 2; } //2
}*/
class TestClass1 implements I1, I2{
   public void m1() { System.out.println("Hello"); }
   public static void main(String[] args){
      TestClass tc = new TestClass();
      ( (I1) tc).m1();
   }
}
interface I1{
   int VALUE = 1;
   void m1();
}
interface I2{
   int VALUE = 2;
   void m1();
}


public class TestClass{
   public static void main(String args[ ] ){
      A o1 = new C( );
      B o2 = (B) o1;
      System.out.println(o1.m1( ) );
      System.out.println(o2.i );
   }
}
class A { int i = 10;  int m1( ) { return i; } }
class B extends A { int i = 20;  int m1() { return i; } }
class C extends B { int i = 30;  int m1() { return i; } }