/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EquipoCelulares;

/**
 *
 * @author SALA I
 */
public class EquipoCelulares {
    
    private String sistemaOperativo;
    private String direccionMAC;
    private int informacionIMEI;
    private double tamañoPantalla;
    private double costo;
    private double iva;
    private double ivaInicial;
    private double costoFinal;
    
    public void establecerSistemaOperativo(String n){
        sistemaOperativo = n;
    }
    public void establecerDireccionMAC(String n){
        direccionMAC = n;
    }
    public void establecerInformacionIMEI(int n){
        informacionIMEI = n;
    }
    public void establecerTamañoPantalla(double n){
        tamañoPantalla = n;
    }
    public void establecerCosto(double n){
        costo = n;
    }
    public void establecerIva(double n){
        iva = n;
    }
    public void establecerIvaInicial(){
        ivaInicial = costo * (iva/100);
    }
    public void establecerCostoFInal(){
        costoFinal = costo + ivaInicial;
    }
    
    public String obtenerSistemaOperativo(){
        return sistemaOperativo;
    }
    public String obtenerDireccionMAC(){
        return direccionMAC;
    }
    public int obtenerInformacionIMEI(){
        return informacionIMEI;
    }
    public double obtenerTamañoPantalla(){
        return tamañoPantalla;
    }
    public double obtenerCosto(){
        return costo;
    }
    public double obtenerIva(){
        return iva;
    }
    public double obtenerIvaInicial(){
        return ivaInicial;
    }
    public double obtenerCostoFInal(){
        return costoFinal;
    }
    
    
    
    
    
}
