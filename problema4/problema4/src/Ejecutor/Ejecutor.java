/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejecutor;

import EquipoCelulares.EquipoCelulares;

/**
 *
 * @author SALA I
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EquipoCelulares ec = new EquipoCelulares();
        EquipoCelulares ec2 = new EquipoCelulares();
        
        String sistemaOperativo = "Samsung";
        String direccionMAC = "0921ab003cx022";
        int informacionIMEI = 2001987313;
        double tamañoPantalla = 20.3;
        double costo = 200;
        int iva = 12;
        
        ec.establecerSistemaOperativo(sistemaOperativo);
        ec.establecerDireccionMAC(direccionMAC);
        ec.establecerInformacionIMEI(informacionIMEI);
        ec.establecerCosto(costo);
        ec.establecerIva(iva);
        ec.establecerIvaInicial();
        ec.establecerCostoFInal();
        
        System.out.printf("Equipo Celular:\n\nSistema Operativo: %s\n"
                + "Direccion MAC: %s\nInformación IMEI: %d\n"
                + "Costo: %.2f\nIva: %d%\nIva del Costo Inicial: %.2f\nCosto Final: %.2f\n",
                ec.obtenerSistemaOperativo(), ec.obtenerDireccionMAC(), ec.obtenerInformacionIMEI(),
                ec.obtenerCosto(), ec.obtenerIvaInicial(), ec.obtenerCostoFInal());
        
        
         ec2.establecerSistemaOperativo("IPhone");
        ec2.establecerDireccionMAC("20c00cx20303");
        ec2.establecerInformacionIMEI(920239);
        ec2.establecerCosto(170.20);
        ec2.establecerIva(12);
        ec2.establecerIvaInicial();
        ec2.establecerCostoFInal();
        
        System.out.printf("\nEquipo Celular:\n\nSistema Operativo: %s\n"
                + "Direccion MAC: %s\nInformación IMEI: %s\n"
                + "Costo: %.2f\nIva: %d%\nIva del Costo Inicial: %.2f\nCosto Final: %.2f\n",
                ec2.obtenerSistemaOperativo(), ec2.obtenerDireccionMAC(), ec2.obtenerInformacionIMEI(),
                ec2.obtenerCosto(), ec2.obtenerIvaInicial(), ec2.obtenerCostoFInal());
    }
    
}
