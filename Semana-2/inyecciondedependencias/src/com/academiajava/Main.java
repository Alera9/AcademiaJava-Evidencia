package com.academiajava;

public class Main {

	public static void main(String[] args) {
		Jugable dispositivo1 = new Pc("Dell");
		Jugable dispositivo2 = new Consola("PS4");
		
		Jugador jugador =  new Jugador("Dan", dispositivo2);
		jugador.jugar();
	}

}
