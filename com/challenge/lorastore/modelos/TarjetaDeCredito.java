package com.challenge.lorastore.modelos;

import java.util.ArrayList;
import java.util.List;

public class TarjetaDeCredito {
    private double limite;
    private double saldo;

    private List<Producto> listaDeCompras;

    public TarjetaDeCredito(double limite) {
        this.limite = limite;
        this.saldo = limite;
        this.listaDeCompras = new ArrayList<>();
    }

    public boolean agregarCompra(Producto producto) {
        if (this.saldo > producto.getValorProducto()) {
            this.saldo -= producto.getValorProducto();
            this.listaDeCompras.add(producto);
            return true;
        }
        return false;
    }

    public double getLimite() {
        return limite;
    }

    public double getSaldo() {
        return saldo;
    }

    public List<Producto> getListaDeCompras() {
        return listaDeCompras;
    }
}
