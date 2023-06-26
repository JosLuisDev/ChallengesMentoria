package org.aluratienda;

import java.util.Arrays;
import java.util.List;

public class Main { // MyClass
    public static void main(String args[]) {
        String studentsNotes = getNotes();

        List<String> lineas = Arrays.stream(studentsNotes.split("\n")).toList();
        int contador = 1;
        for (String linea:
                lineas) {
            if(linea.startsWith("S")){
                String [] info = linea.split(", ");
                String result = String.format("Nombre: %s Grupo: %s - %s No. Lista: %s",info[4], info[1], info[2], info[3]);
                System.out.println(result);
                contador=1;
            }else {
                String [] info = linea.split(", ");
                String result = String.format("Materia %d: %s %s", contador, info[1], info[2]);
                System.out.println(result);
                contador++;
            }

        }

        //System.out.println(studentsNotes);
        // Nombre: David Grupo: 3 - A No. Lista: 24
        // Materia 1: Espaniol 75
        // Materia 2: Matematicas 43
    }

    public static String getNotes() {
        StringBuilder studentsNotes = new StringBuilder();

        /*
         * S = Student; Where the second value is the school grade,
         *       third is the group, fourth is the number list,
         *       and fifth is the student's name
         *
         * N = Note; Where the second value is the subject's name,
         *       and the third vaue is the final grade
         */
        studentsNotes.append("S, 3, A, 24, David\n");
        studentsNotes.append("N, Espaniol, 75\n");
        studentsNotes.append("N, Matematicas, 43\n");
        studentsNotes.append("S, 3, A, 22, Laura\n");
        studentsNotes.append("N, Espaniol, 96\n");
        studentsNotes.append("N, Matematicas, 75\n");
        studentsNotes.append("S, 3, B, 06, Jorge\n");
        studentsNotes.append("N, Espaniol, 55\n");
        studentsNotes.append("N, Matematicas, 67\n");
        studentsNotes.append("S, 4, A, 06, Maria\n");
        studentsNotes.append("N, Ciencias, 54\n");
        studentsNotes.append("N, Algebra, 72\n");

        return studentsNotes.toString();
    }
}