package Collections;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MateriasPorProfesor {
    public static void main(String[] args) {
        Map<String, List<String>> materiasPorProfesor = new HashMap<>();

        //Agregar datos
        materiasPorProfesor.put("profesor Juan", Arrays.asList("Matematicas","Español"));
        materiasPorProfesor.put("profesor Roberto", Arrays.asList("Historia","Geografia"));
        materiasPorProfesor.put("profesora Mar", Arrays.asList("Programacion","Base de datos"));

        System.out.println("Mostar informacion de las materias por profesor");
        for(Map.Entry<String,List<String>> entry : materiasPorProfesor.entrySet() ) {
            String profesor = entry.getKey();
            List<String> materias = entry.getValue();
            System.out.println(profesor + " imparte: " + materias);
        }

        //Consulta de las materias de un profesor en especifico.
        String profesorABuscar = "profesor Juan";
        System.out.println("Materias de " + profesorABuscar + ":");
        List<String> materiasProfesor = materiasPorProfesor.get(profesorABuscar);
        for(String materia : materiasProfesor) {
            System.out.println(materia);
        }
    }
}
