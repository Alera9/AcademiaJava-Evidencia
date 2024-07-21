package com.academiajava.mundopc;

public class Monitor {
    private final int idMonitor;
    private String marca;
    private double tamanio;
    private static int contadorMonitores;

    private Monitor() {
        this.idMonitor = ++Monitor.contadorMonitores;
    }
    public Monitor(String marca, double tamanio) {
        this();
        this.marca = marca;
        this.tamanio = tamanio;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Monitor [");
        builder.append("idMonitor=");
        builder.append(this.idMonitor);
        builder.append(", marca=");
        builder.append(this.marca);
        builder.append(", tamanio=");
        builder.append(this.tamanio);
        builder.append("]");
        return builder.toString();
    }
    public int getIdMonitor() {
        return idMonitor;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public double getTamanio() {
        return tamanio;
    }
    public void settamanio(double tamanio) {
        this.tamanio = tamanio;
    }

}
