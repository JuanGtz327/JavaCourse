package mx.com.gtz.Interfaces;

public class TestInterfaz {
    public static void main(String[] args) {
        IEjemplo inter = new ImplementacionInterfaz();
        inter.conectar();
        inter.desconectar();
    }
}
