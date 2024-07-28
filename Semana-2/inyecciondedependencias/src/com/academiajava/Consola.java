package com.academiajava;

public class Consola implements Jugable{
	private String modelo;

	public Consola(String modelo) {
		this.modelo = modelo;
	}

	@Override
	public void jugar() {
		System.out.println("Estoy jugando con la consola: "+modelo);
	}

}
