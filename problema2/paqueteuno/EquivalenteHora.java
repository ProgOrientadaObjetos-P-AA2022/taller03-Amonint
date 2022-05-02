/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqueteuno;

/**
 *
 * @author reroes
 */
public class EquivalenteHora {
    private int horas;
    private int minutos;
    private int segundos;
    private int dias;
    private int valorMinuto;
    private int valorSegundos;
    private int valorHoras;

    public void establecerHoras(int c) {
        horas = c;
    }

    public void establecerMinutos(int c) {
        minutos = c;
    }

    public void establecerSegundos(int c) {
        segundos = c;
    }

    public void establecerDias(int c) {
        dias = c;
    }

    // public void establecerValorFactura(){
    public void horas() {
        valorHoras = horas;
    }

    public void calcularMinutos() {
        valorMinuto = horas * 60;
    }

    public void calcularSegundos() {
        valorSegundos = valorMinuto * 60;
    }

    public int obtenerHoras() {
        return valorHoras;
    }

    public int obtenerMinutos() {
        return valorMinuto;
    }

    public int obtenerSegundos() {
        return valorMinuto;
    }

    public int obtenerValorSegundos() {
        return valorSegundos;
    }

    public int obtenerValorMinutos() {
        return valorMinuto;
    }

}
