package com.academiajava;

public class Jugador {
	private String nombre;
	private Jugable dispositivoDeJuego;
	
	public Jugador(String nombre, Jugable dispositivoDeJuego) {
		this.nombre = nombre;
		this.dispositivoDeJuego = dispositivoDeJuego;
	}
	
	public void jugar() {
		this.dispositivoDeJuego.jugar();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
