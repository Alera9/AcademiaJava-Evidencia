import com.academiajava.ChocolateBoilerAsSingleton;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Academia Java!");
        ChocolateBoilerAsSingleton boiler1 =  ChocolateBoilerAsSingleton.getInstance();
        ChocolateBoilerAsSingleton boiler2 =  ChocolateBoilerAsSingleton.getInstance();
        ChocolateBoilerAsSingleton boiler3 =  ChocolateBoilerAsSingleton.getInstance();
        System.out.println(boiler1 == boiler3);//Apuntan al mismo objeto
        System.out.println(boiler1.equals(boiler2));
    }
}