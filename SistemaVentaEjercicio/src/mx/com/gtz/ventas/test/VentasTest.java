package mx.com.gtz.ventas.test;

import mx.com.gtz.ventas.*;

public class VentasTest {
    public static void main(String[] args) {
        Producto p = new Producto("Helado", 15.99);
        Producto p2 = new Producto("Computadora", 15000.00);
        Producto p3 = new Producto("Limones", 8.50);
        
        Orden orden = new Orden();
        orden.agregarProducto(p);
        orden.agregarProducto(p);
        orden.agregarProducto(p2);
        orden.agregarProducto(p2);
        orden.agregarProducto(p3);
        
        orden.mostrarOrden();
    }
}
