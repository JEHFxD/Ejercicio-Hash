/*
     
Haga un sistema que permita solicitar el nombre
y la edad de n estudiantes, e imprima:
Nombre de todos los estudiantes registrados
Lista de todos los estudiantes con sus edades
Suma de todas las edades
Promedio de edades de estudiantes.
Indique cuantos estudiantes son mayores de 18
años mostrando el nombre y edad
Permita consultar un estudiante por nombre
*/
package com.mycompany.ejerciciohashmap;

import java.util.HashMap;
import javax.swing.JOptionPane;
import java.util.Map;

public class EjercicioHashmap {
    public static void main (String[] args) {
        HashMap<String, Integer> estudiantes = new HashMap<String, Integer>();
        Escuela es = new Escuela();
        es.registrarEstudiantes();
        int opt = 0;
        do {
            opt = Integer.parseInt(JOptionPane.showInputDialog("1. Lista estudiantes\n2. Sumar edades\n3. Promedio edades\n4. Estudiantes mayores de edad\n5. Consultar estudiante por nombre\n6. Salir"));
            switch (opt) {
                case 1:
                    es.MostrarEstudiantes();
                    break;
                case 2:
                    System.out.println("Suma de edades: "+es.sumaEdades());
                    break;
                case 3:
                    System.out.println("Promedio edades: "+es.promedioEdades());
                    break;
                case 4:
                     es.EstudiantesMayores();
                    break;
                case 5:
                    es.consultarEstudiantes(JOptionPane.showInputDialog("Ingrese el nombre del estudiante"));
                    break;
                case 6:
                    JOptionPane.showMessageDialog(null, "Saliendo");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción invalida");
            }
        } while (opt != 6);
    }
}