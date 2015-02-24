/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DistMethod;

/**
 *
 * @author luizaguiar
 */
public class CID {
    
    static double somaq;
    static double somac;
    
    static double[] q = {3,4,2,5,6};
    static double[] c = {4,7,8,9};
    static double max;
    static double min;
    static double cid;
    
    public static void main(String[] args) {
        
        for (int i = 1; i < q.length; i++){
            somaq += Math.pow(q[i-1] - q[i], 2);   
        
        }
        
        for (int i = 1; i < c.length; i++){
            somac += Math.pow(c[i-1] - c[i], 2);   
        
        }
         
        somaq = Math.sqrt(somaq);
        somac = Math.sqrt(somac);
        if (somaq > somac)
            cid = somaq/somac;
        else
            cid = somac / somaq;
            
        
        System.out.println(cid);

    }

    
}

