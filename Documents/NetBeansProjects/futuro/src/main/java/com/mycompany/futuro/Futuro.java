/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.futuro;

/**
 *
 * @author Inés
 */

public class Futuro {
    private static void main (String[] args){
        
        System.out.print("Estudiante " + args[0] + " " + args[1] + ": ");
        
        System.out.print("Módulos matriculados: " + args[2] + ". ");
        
        if (args[2].equals(args[3])) {
        System.out.print("Bien. Pero una hora de estudio para cada módulo puede ser insuficiente.");
        }
        if (Integer.valueOf(args[2]) > Integer.valueOf(args[3])){
        System.out.print("Poco tiempo de estudio. Debes dedicar más tiempo.");
        } 
        if (Integer.valueOf(args[2]) < Integer.valueOf(args[3])){
        System.out.print("Ideal. Trabajas los contenidos en casa.");
        }
    }
}
