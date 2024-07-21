package com.academiajava.mundopc;

public class DispositivoDeEntrada {
    private String tipoEntrada;
    private String marca;

    public DispositivoDeEntrada(String tipoEntrada ,String marca) {
        this.tipoEntrada = tipoEntrada;
        this.marca =  marca;
    };

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("DispositivoEntrada [ ");
        stringBuilder.append("marca = ");
        stringBuilder.append(this.marca);
        stringBuilder.append(", tipoEntrada =");
        stringBuilder.append(this.tipoEntrada);
        stringBuilder.append(" ]");
        return stringBuilder.toString();
    }

    public String getTipoEntrada () {
        return this.tipoEntrada;
    }
    public String getMarca() {
        return this.marca;
    }
    public void setTipoEntrada(String tipoEntrada) {
        this.tipoEntrada = tipoEntrada;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
}
