package mx.com.gtz.Generics;

import java.util.ArrayList;
import java.util.List;

public class TestGenerico {
    public static void main(String[] args) {
        ClaseGenerica<String> elemento = new ClaseGenerica("Juanito Banana");
        elemento.tipoVariable();
        
        ClaseGenerica<Integer> elemento2 = new ClaseGenerica(15);
        elemento2.tipoVariable();
        
        //Los generics tambien pueden aplicar en colleciones de modo que nos limita a usar un tipo de Objeto
        List<Integer> miListaEnteros = new ArrayList<>();
        miListaEnteros.add(211101);
        miListaEnteros.add(150703);
        miListaEnteros.add(210977);
        miListaEnteros.add(41178);
        
        for(Integer fecha:miListaEnteros){
            System.out.println("Fecha de Nacimiento "+fecha);
        }
    }
}
