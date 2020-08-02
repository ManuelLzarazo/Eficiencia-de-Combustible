/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Eficiencia;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class eficiencia {
   
public static void main(String[] args) {
        Scanner entrada =new Scanner (System.in);
        double Numero1 =0;
        double LPK =0;
              
        
        System.out.println("Bienvenido al programa que le permite convertit MPG a LPK ");
        
        System.out.println("DIGUITE LA CABTIDAD DE MPG");
        Numero1=entrada.nextDouble();
        
        LPK =235.215/Numero1;
                                        
        
        System.out.print("SUS MPG EQUIVALEN A:"+LPK);
        System.out.println("LPK");
        
        //TODO code aplication logig here
    }
}   

