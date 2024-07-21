import com.academiajava.mundopc.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Academia Java!");
        //Dispositivos de entrada
        Raton raton = new Raton("USB", "Bloodbat");
        Teclado teclado = new Teclado("Bluetooth", "Logi");
        //Monitor
        Monitor monitor = new Monitor("Benq", 20.0);
        Computadora computadoraHP = new Computadora("HP", monitor,  teclado, raton);
        Computadora computadoraGamer = new Computadora("Gamer", monitor,  teclado, raton);
        Computadora computadoraDell = new Computadora("Dell", monitor,  teclado, raton);
        Computadora computadoraCompaq = new Computadora("Compaq", monitor,  teclado, raton);

        Orden orden_uno = new Orden();
        orden_uno.agregarComputadora(computadoraHP);
        orden_uno.agregarComputadora(computadoraGamer);
        orden_uno.agregarComputadora(computadoraDell);
        orden_uno.agregarComputadora(computadoraCompaq);

        orden_uno.mostrarOrden();

    }
}