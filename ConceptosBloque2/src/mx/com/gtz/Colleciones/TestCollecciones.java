package mx.com.gtz.Colleciones;

import java.util.*;

/*Dentro de las colecciones, tenemos de 2 interfaces Collection y Map de donde Colection usa 
List(ArrayList y Vector) y Set(HashSet) y Map usa HashMap */

public class TestCollecciones {
    public static void main(String[] args) {
        List lista = new ArrayList();
        lista.add("Lunes");
        lista.add("Martes");
        lista.add("Miercoles");
        
        Set set = new HashSet();
        set.add("Jueves");
        set.add("Viernes");
        set.add("Sabado");
        
        obtenDatos(lista);//Garantiza orden
        obtenDatos(set);//No garantiza el orden la collecion set
        
        Map m = new HashMap();
        m.put("Valor 1", "Juan");
        m.put("Valor 2", "Liz");
        m.put("Valor 3", "Yadira");
        m.put("Valor 4", "Oswaldo");
        
        System.out.println(m.get("Valor 3"));
        obtenDatos(m.keySet());
        obtenDatos(m.values());
    }
    
    public static void obtenDatos(Collection c){
        for(Object l:c){
            System.out.println(l);
        }
    }
}
