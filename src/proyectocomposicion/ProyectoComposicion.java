/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectocomposicion;

import Modelo.Examen;
import Modelo.Fecha;

public class ProyectoComposicion {

    public static void main(String[] args) {
        Fecha fe = new Fecha(22, "Septiembre", "Tarde");
        Examen ex = new Examen("Ingles", "Parroquial Morón", fe);
        System.out.println("*****EXAMEN*****");
        System.out.println(ex);
        System.out.println("****************");

        System.out.println();
        Fecha fe1 = new Fecha(10, "Octubre", "Mañana");
        Examen ex1 = new Examen("Matemáticas", "Parroquial Morón", fe1);
        System.out.println("*****EXAMEN*****");
        System.out.println(ex1);
        System.out.println("****************");

        System.out.println();
        Fecha fe2 = new Fecha(20, "Octubre", "Tarde");
        Examen ex2 = new Examen("Historia", "Parroquial Morón", fe2);
        System.out.println("*****EXAMEN*****");
        System.out.println(ex2);
        System.out.println("****************");
    }

}
