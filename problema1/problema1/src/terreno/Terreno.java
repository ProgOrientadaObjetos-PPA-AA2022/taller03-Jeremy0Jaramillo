/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package terreno;

/**
 *
 * @author SALA I
 */
public class Terreno {

        private double ancho;
        private double largo;
        private double area;
        private double valorMetroCuadrado;
        private double costo_terreno;
        
        public void establecerAncho(double n){
            ancho = n;
        }
        
         public void establecerLargo(double n){
         largo = n;   
        }
         
          public void establecerArea(){
            area = ancho * largo;
        }
          
           public void establecerValorMetroCuadrado(double n){
            valorMetroCuadrado = n;
        }
           
            public void establecerCostoTerreno(){
                costo_terreno = area * valorMetroCuadrado;
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
               
                public double obtenerValorMetroCuadrado(){
            return valorMetroCuadrado;
        }
                
                public double obtenerCostoTerreno(){
            return costo_terreno;
        }
    
}
