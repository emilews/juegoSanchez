/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package juegotabla;

import java.util.Scanner;

/**
 *
 * @author Alumnos
 */
public class validacionNumero {
    validacionNumero(){
    
    }
public boolean validar(String s){
  
    boolean val = false;
    
    for (int i = 0; i < s.length(); i++) {
        if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
            val = true;
           
        }
        else {
        val = false;
            System.out.println("TE EKIVOKASTE WEY");
        break;
        }
    }
    return val;
}
    
    
}
