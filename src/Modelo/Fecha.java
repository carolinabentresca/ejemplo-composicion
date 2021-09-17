/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

public class Fecha {

    private int dia;
    private String mes;
    private String turno;

    public Fecha() {
    }

    public Fecha(int dia, String mes, String turno) {
        this.dia = dia;
        this.mes = mes;
        this.turno = turno;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    @Override
    public String toString() {
        return "DIA: " + this.getDia() + "\n" + "MES: " + this.getMes() + "\n" + "TURNO: " + this.getTurno() + "\n";
    }
}
