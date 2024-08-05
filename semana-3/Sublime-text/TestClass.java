
public class TestClass{
    static TestClass ref;    
    String[] arguments; 

    public static void main(String args[]){
        ref = new TestClass();       ref.func(args);
    }    
    public void func(String[] args){       
        ref.arguments = args;    
    } 
} 

class TestClass2{
    char c;
    public void m1(){
        char[ ] cA = { 'a' , 'b'};
        m2('m', cA);
        System.out.println( ( (int)c)  + "," + cA[1] );
    }
    public void m2(char c, char[ ] cA){
        c = 'b';
        cA[1] = cA[0] = 'm';
    }
    //public static void main(String args[]){
       // new TestClass().m1();
    //}
}