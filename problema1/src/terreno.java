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
public class FacturaTelefono {
    private double valorMetroCuadrado;
    private double costo_terreno;
    private double ancho;
    private double largo;
    private double area;

    
    public void establecerValorMetroCuadrado(Double c){
        valorMetroCuadrado = c;
    }
    
    public void establecerCosto_terreno(double c){
        costo_terreno = c;
    }
    
    public void establecerAncho(double c){
        ancho = c;
    }
    public void establecerLargo(double c){
        largo = c;
    }
    public void establecerArea(double c){
        area = c;
    }
    
    /* -------------------------------------------------------------------------------------------------------------------------------------------- */
    
    public String obtenerValorMetroCuadrado(){
        return valorMetroCuadrado;
    }
    
    public double obtenerCosto_terreno(){
        return costo_terreno;
    }
    
    public double obtenerAncho(){
        return ancho;
    }
    public double obtenerLargo(){
        return largo;
    }
    public double obtenerArea(){
        return area;
    }
    
    public void calcularAreaTerreno(){
            area = ancho * largo;
    }
    public void valorMetroCuadrado(){
        valorMetroCuadrado = ancho * largo;
    }
    public void costo_terreno(){
        costo_terreno =  valorMetroCuadrado * area;
    }
    
    
    
}
