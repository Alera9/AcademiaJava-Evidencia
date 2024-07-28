package com.academiajava;

public class Pc implements Jugable{
	private String modelo;

	public Pc(String modelo) {
		this.modelo = modelo;
	}

	@Override
	public void jugar() {
		System.out.println("Estoy jugando con la PC: "+modelo);
	}

}
