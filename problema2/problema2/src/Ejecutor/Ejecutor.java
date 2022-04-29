/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejecutor;

import EquivalenteHora.EquivalenteHora;

/**
 *
 * @author SALA I
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        EquivalenteHora eh = new EquivalenteHora();
        EquivalenteHora eh2 = new EquivalenteHora();
        
        int horas = 72;
        
        eh.establecerHoras(horas);
        eh.establecerMinutos();
        eh.establecerSegundos();
        eh.establecerDias();
        
        System.out.printf("Equivalencia:\n\nHoras ingresadas: %d\n"
                + "Equivalencia en Minutos: %d\nEquivalencia en Segundos: %d\n"
                + "Equivalencia en Días: %d\n", eh.obtenerHoras(), eh.obtenerMinutos(), eh.obtenerSegundos(), eh.obtenerDias());
        
        
        eh2.establecerHoras(24);
        eh2.establecerMinutos();
        eh2.establecerSegundos();
        eh2.establecerDias();
        
        System.out.printf("\nEquivalencia 2:\n\nHoras ingresadas: %d\n"
                + "Equivalencia en Minutos: %d\nEquivalencia en Segundos: %d\n"
                + "Equivalencia en Días: %d\n", eh2.obtenerHoras(), eh2.obtenerMinutos(), eh2.obtenerSegundos(), eh2.obtenerDias());
    }
    
}
