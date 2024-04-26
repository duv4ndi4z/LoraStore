package com.challenge.lorastore.modelos;

public class Producto implements Comparable<Producto>{
    private String nombreProducto;
    private double valorProducto;

    public double getValorProducto() {
        return valorProducto;
    }
    public Producto(String nombreProducto, double valorProducto) {
        this.nombreProducto = nombreProducto;
        this.valorProducto = valorProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }


    @Override
    public int compareTo(Producto producto) {
        return Double.valueOf(this.valorProducto).compareTo(Double.valueOf(producto.getValorProducto()));
    }
}
