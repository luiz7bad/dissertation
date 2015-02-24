/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DistMethod;

import com.sun.org.apache.xerces.internal.xs.XSConstants;

/**
 * Classe que imlementa a distancia euclidiana
 * @author luizaguiar
 */
public class DE {
    
    static double[] x = {1, 1};
    static double [] y = { 10, 1,8,5,6};
    static double[] z = {0,0};
    static double[]  somax = new double [10];
    static double[] somay =  new double [10];
    static double[] somaz =  new double [10];
    static double[] somat = new double [10];
    
    public static void main (String [] args){
        
       for (int i = 0; i < x.length; i++){
           somax[i] = Math.pow(x[0] - x[i], 2);
       }
       
       for (int i = 0; i < y.length; i++){
           somay[i] = Math.pow(y[0] -  y[i], 2.0);            

           
       }
       
       for (int i=0; i<z.length; i++){
           somaz[i] = Math.pow(z[0] - z[i], 2.0);
       
       }
       for (int i = 1; i < x.length; i++){
       
           somat [i] = Math.sqrt(somax[i] + somay[i] + somaz[i]);
           System.out.println(somat[i]);
       }

    
    }
    
}
