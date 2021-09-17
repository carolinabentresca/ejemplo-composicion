/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

public class Examen {

    private String materia;
    private String instituto;
    private Fecha fecha;

    public Examen() {
        materia = "";
        instituto = "";
        fecha = new Fecha();
    }

    public Examen(String materia, String instituto, Fecha fecha) {
        this.materia = materia;
        this.instituto = instituto;
        this.fecha = fecha;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public String getInstituto() {
        return instituto;
    }

    public void setInstituto(String instituto) {
        this.instituto = instituto;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "MATERIA:  " + this.getMateria() + "\n" + "INSTITUTO: " + this.getInstituto() + "\n" + fecha.toString();
    }

}
