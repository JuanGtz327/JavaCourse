package mx.com.gtz.ClasesAbstractas;

public class TestAbstracto {
    public static void main(String[] args) {
        ImplementacionAbstracta abs = new ImplementacionAbstracta("Este es mi texto");
        abs.sayHello();
        abs.saySomething();
        abs.sayGoodbye();
        abs.setText("Nuevo texto");
        abs.saySomething();
    }
}
