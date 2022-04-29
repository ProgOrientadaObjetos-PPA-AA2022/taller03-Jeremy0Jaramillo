/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejecutor;

import terreno.Terreno;

/**
 *
 * @author SALA I
 */
public class Ejecutor {

    public static void main(String[] args) {

        Terreno tr = new Terreno();
        Terreno tr2 = new Terreno();

        double ancho = 30;
        double largo = 50;
        double valorMetroCuadrado = 15;

        
        tr.establecerAncho(ancho);
        tr.establecerLargo(largo);
        tr.establecerArea();
        
        tr.establecerValorMetroCuadrado(valorMetroCuadrado);
        
        tr.establecerCostoTerreno();
        
        
        System.out.printf("Información del Terreno:\n\nAncho del terreno: %.2f\n"
                + "Largo del Terreno: %.2f\nArea del Terrreno: %.2f\n"
                + "Valor del Metro Cuadrado: %.2f\nCosto del Terreno: %.2f\n", tr.obtenerAncho(),
                tr.obtenerLargo(), tr.obtenerArea(), tr.obtenerValorMetroCuadrado(), tr.obtenerCostoTerreno());
        
        
        
        
        
        tr2.establecerAncho(50);
        tr2.establecerLargo(120);
        tr2.establecerArea();
        
        tr2.establecerValorMetroCuadrado(20);
        
        tr2.establecerCostoTerreno();
        
        
        System.out.printf("\nInformación del Terreno 2:\n\nAncho del terreno: %.2f\n"
                + "Largo del Terreno: %.2f\nArea del Terrreno: %.2f\n"
                + "Valor del Metro Cuadrado: %.2f\nCosto del Terreno: %.2f\n", tr2.obtenerAncho(),
                tr2.obtenerLargo(), tr2.obtenerArea(), tr2.obtenerValorMetroCuadrado(), tr2.obtenerCostoTerreno());
        
    }

}
