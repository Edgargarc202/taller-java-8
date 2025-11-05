package Collections;

import java.util.HashMap;
import java.util.Map;

public class EjemploHashMap {
    public static void main(String[] args) {
        Map<Integer,String> empleados = new HashMap<>();
        empleados.put(101, "Ana");
        empleados.put(102, "Marco");
        empleados.put(103, "Alondra");
        empleados.put(104, "Jose");
        empleados.put(105, "Mario");
        for(Map.Entry<Integer,String> entry : empleados.entrySet() ) {
            System.out.println("idUsuario: " + entry.getKey() + " Nombre: " + entry.getValue());

        }

    }
}
