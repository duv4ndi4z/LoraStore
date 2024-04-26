import com.challenge.lorastore.modelos.Producto;
import com.challenge.lorastore.modelos.TarjetaDeCredito;

import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n = 1;
        Scanner input = new Scanner(System.in);

        System.out.println("Bienvenido a LoraStore");
        System.out.println("\n Ingrese el limite de la tarjeta");
        double limite = input.nextDouble();
        TarjetaDeCredito tarjeta = new TarjetaDeCredito(limite);

        while (n != 0) {
            System.out.println("Ingrese la description de la compra:");
            String description = input.next();
            System.out.println("Escribe el valor de la compra: ");
            double valorProducto = input.nextDouble();
            Producto producto = new Producto(description, valorProducto);
            boolean compraRealizada = tarjeta.agregarCompra(producto);

            if (compraRealizada) {
                System.out.println("Compra realizada");
                System.out.println("Si desea salir Escriba 0 o 1 para continuar");
                n = input.nextInt();
            } else {
                System.out.println("Saldo insuficiente!");
                n = 0;
            }
        }
      //  tarjeta.getListaDeCompras().sort(Producto::getValorProducto);
        System.out.println("*******************");
        System.out.println("\n COMPRAS REALIZADAS:");
        Collections.sort(tarjeta.getListaDeCompras());
        for (Producto producto : tarjeta.getListaDeCompras()){
            System.out.println(" "+producto.getNombreProducto()+" - $"+producto.getValorProducto());
        }
        System.out.println("\n*****************");
        System.out.println("El saldo de la tarjeta es: $"+tarjeta.getSaldo());

    }
}
