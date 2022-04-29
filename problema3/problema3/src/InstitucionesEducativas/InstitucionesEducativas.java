/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InstitucionesEducativas;

/**
 *
 * @author SALA I
 */
public class InstitucionesEducativas {
    
    private String nombre;
    private String tipoInstitucion;
    private int numeroAlumnos;
    private int numeroDocentes;
    private int numeroSedes;
    private double gastosProyectados;
    private double presupuesto;
    
    public void establecerNombre(String n){
        nombre = n;
    }
    public void establecerTipoInstitucion(String n){
        tipoInstitucion = n;
    }
    public void establecerNumeroAlumnos(int n){
        numeroAlumnos = n;
    }
    public void establecerNumeroDocentes(int n){
        numeroDocentes = n;
    }
    public void establecerNumeroSedes(int n){
        numeroSedes = n;
    }
    public void establecerGastosProyectados(double n){
        gastosProyectados = n;
    }
    public void establecerPresupuestos(){
        presupuesto = numeroAlumnos * gastosProyectados;
    }
    
    public String obtenerNombre(){
        return nombre;
    }
    public String obtenerTipoInstitucion(){
        return tipoInstitucion;
    }
    public int obtenerNumeroAlumnos(){
        return numeroAlumnos;
    }
    public int obtenerNumeroDocentes(){
        return numeroDocentes;
    }
    public int obtenerNumeroSedes(){
        return numeroSedes;
    }
    public double obtenerGastosProyectados(){
        return gastosProyectados;
    }
    public double obtenerrPresupuestos(){
        return presupuesto;
    }
}
