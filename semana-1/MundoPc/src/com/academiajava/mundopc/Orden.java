package com.academiajava.mundopc;

import java.util.Arrays;

public class Orden {
    private int idOrden;
    private Computadora[] computadoras;
    private int contadorComputadoras;

    private static int MAX_COMPUTADORAS = 10;
    private static int contadorOrdenes;

    public Orden() {
        this.idOrden = ++Orden.contadorOrdenes;
        this.computadoras = new Computadora[Orden.MAX_COMPUTADORAS];
    }
    public void agregarComputadora(Computadora computadora) {
        if(this.contadorComputadoras < Orden.MAX_COMPUTADORAS) {
            this.computadoras[contadorComputadoras++] = computadora;
        } else {
            System.out.println("Se alcanzo el maximo de computadoras");
        }
    }

    public void mostrarOrden() {
        StringBuilder builder = new StringBuilder();
        builder.append("Orden #: ");
        builder.append(this.idOrden);
        builder.append("Computadoras en la orden : ");
        builder.append(Arrays.toString(computadoras));
        System.out.println(builder.toString());
    }
}
