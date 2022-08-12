package mx.com.gtz.Excepciones;

public class TestExcepciones {
    public static void main(String[] args){
        Operaciones o = new Operaciones(10, 0);
        try {
            o.division();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Este bloque siempre se ejecuta en un try catch");
        }
    }
}
