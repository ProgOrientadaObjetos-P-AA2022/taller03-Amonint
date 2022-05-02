/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquetedos;

import terreno1.terreno;

/**
 *
 * @author reroes
 */
public class Ejecutor {
    public static void main(String[] args) {
        // Crear un objeto de tipo FacturaTelefono
        terreno ft = new terreno();
        // Valores de entrada
         double valorMetroCuadrado;
         double costo_terreno;
         double ancho;
         double largo;
         double area;
    
        // uso de los métodos establecer para darle valores a los 
        // atributos del objeto.
        ft.establecerValorMetroCuadrado(valorMetroCuadrado);
        ft.establecerCosto_terreno(costo_terreno);
        ft.establecerAncho(ancho);
        ft.establecerLargo(largo);
        ft.establecerArea(area);
        // hasta aquí el objeto ya tiene valores para sus atributos:
        // número de telefono, número de minutos consumidos en el mes, 
        // valor de cada minuto.
        // LLamo al método calcularValorFactura, no se envía parámetros,
        // pues trabaja con los valores de los atributos: número de minutos 
        // consumidos en el mes, valor de cada minuto; que ya los tiene el 
        // objeto.
        
        ft.calcularAreaTerreno();
        ft.calcularValorFactura();
        ft.costo_terreno();
        // Se hace uso de los métodos obtener para presentar en pantalla lo 
        // requerido
        System.out.printf("Factura de Teléfono\n\nNúmero de teléfono: %s\n"
                + "Minutos mensuales: %.2f\nValor por minuto: %.2f\n"
                + "Valor a cancelar: %.2f\n", ft.obtenerNumeroTelefono(),
                ft.obtenerMinutosMes(), ft.obtenerValorMinuto(),
                ft.obtenerValorFactura());
    }
}
