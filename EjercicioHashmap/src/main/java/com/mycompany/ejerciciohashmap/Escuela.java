package com.mycompany.ejerciciohashmap;

import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;

class Escuela {
    HashMap<String, Integer> estudiantes;
    
    public Escuela () {
        estudiantes = new HashMap<String, Integer>();
    }
    
    public void registrarEstudiantes () {
        String nombre = " ";
        int edad = 0;
        boolean ejecutando = true;
        do {
            nombre = JOptionPane.showInputDialog("Ingrese el nombre del estudiante");
            if (nombre.length() > 0) {
                edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese edad del estudiante "+nombre));
                registrarEstudiante(nombre, edad);
            } else {
                ejecutando = false;
            }
        } while (ejecutando);
    }
    
    public void registrarEstudiante(String nombre, int edad) {
        if (!estudiantes.containsKey(nombre)) {
            estudiantes.put(nombre, edad);
        }
    }
    
    public void consultarEstudiantes (String nombre) {
        System.out.println(nombre+ " tiene "+estudiantes.get(nombre)+" años");
    }
    
    public int sumaEdades() {
        int res = 0;
        for (Map.Entry<String,Integer>estudiante : estudiantes.entrySet()){
            res+=estudiante.getValue();
        }
        return res;
    }   
      
    public float promedioEdades () {
        float res = 0;
        for (Map.Entry<String,Integer>estudiante : estudiantes.entrySet()){
            res+=estudiante.getValue();
        }
        return res / estudiantes.size();
    }
    
    public void MostrarEstudiantes () {
        for (Map.Entry<String, Integer> estudiante : estudiantes.entrySet()) {
            consultarEstudiantes(estudiante.getKey());
        }
    }
    
    public void EstudiantesMayores (){
        for (Map.Entry<String, Integer> estudiante : estudiantes.entrySet()) {
            if (estudiante.getValue() >= 18)
                consultarEstudiantes(estudiante.getKey());
        }
    }
}
