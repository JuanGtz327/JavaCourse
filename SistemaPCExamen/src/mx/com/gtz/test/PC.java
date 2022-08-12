package mx.com.gtz.test;

import mx.com.gtz.pc.Computadora;
import mx.com.gtz.pc.Monitor;
import mx.com.gtz.pc.Orden;
import mx.com.gtz.pc.Raton;
import mx.com.gtz.pc.Teclado;

public class PC {
    public static void main(String[] args) {
        Teclado tec = new Teclado("Mecanica", "Logitech");
        Teclado tec2 = new Teclado("Membrana", "Kiut");
        Raton rtn = new Raton("USB", "Dell");
        Raton rtn2 = new Raton("Inalambrica", "Yeyian");
        Monitor mtr = new Monitor("Yeyian", 40.0);
        Monitor mtr2 = new Monitor("Lenovo", 37.0);
        
        Computadora cpu = new Computadora("XtremePC", mtr, tec, rtn);
        Computadora cpu2 = new Computadora("XtremePC Version2", mtr2, tec2, rtn2);
        Computadora cpu3 = new Computadora("XtremePC Version3", mtr, tec2, rtn);
        
        Orden orden = new Orden();
        orden.agregarComputadoras(cpu);
        orden.agregarComputadoras(cpu2);
        orden.agregarComputadoras(cpu3);
        orden.mostrarOrden();
    }
}
