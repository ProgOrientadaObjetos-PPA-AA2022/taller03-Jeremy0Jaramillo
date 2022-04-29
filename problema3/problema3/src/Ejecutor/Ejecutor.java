/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejecutor;

import InstitucionesEducativas.InstitucionesEducativas;

/**
 *
 * @author SALA I
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        InstitucionesEducativas ie = new InstitucionesEducativas();
        InstitucionesEducativas ie2 = new InstitucionesEducativas();
        
        ie.establecerNombre("Eugenio Espejo");
        ie.establecerTipoInstitucion("Particular");
        ie.establecerNumeroAlumnos(1200);
        ie.establecerNumeroDocentes(150);
        ie.establecerNumeroSedes(14);
        ie.establecerGastosProyectados(156.30);
        ie.establecerPresupuestos();
        
        System.out.printf("Institución:\n\nNombre de Institución: %s\n"
                + "Tipo de Institución: %s\nNúmero de Alumnos: %d\n"
                + "Número de Docentes: %d\nNúmero de Sedes: %d\n"
                + "Gastos Proyectados: %.2f\nPresupuesto:%.2f\n", ie.obtenerNombre(),
                ie.obtenerTipoInstitucion(), ie.obtenerNumeroAlumnos(), ie.obtenerNumeroDocentes(),
                ie.obtenerNumeroSedes(), ie.obtenerGastosProyectados(), ie.obtenerrPresupuestos());
        
        
        ie2.establecerNombre("Antonio Peña Celi");
        ie2.establecerTipoInstitucion("Particular");
        ie2.establecerNumeroAlumnos(1300);
        ie2.establecerNumeroDocentes(175);
        ie2.establecerNumeroSedes(23);
        ie2.establecerGastosProyectados(120.55);
        ie2.establecerPresupuestos();
        
        System.out.printf("\nInstitución:\n\nNombre de Institución: %s\n"
                + "Tipo de Institución: %s\nNúmero de Alumnos: %d\n"
                + "Número de Docentes: %d\nNúmero de Sedes: %d\n"
                + "Gastos Proyectados: %.2f\nPresupuesto:%.2f\n", ie2.obtenerNombre(),
                ie2.obtenerTipoInstitucion(), ie2.obtenerNumeroAlumnos(), ie2.obtenerNumeroDocentes(),
                ie2.obtenerNumeroSedes(), ie2.obtenerGastosProyectados(), ie2.obtenerrPresupuestos());
    }
    
}
