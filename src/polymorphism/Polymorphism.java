/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphism;

/**
 *
 * @author ASUS
 */
public class Polymorphism {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Binatang binatang = new Binatang();
        
        Harimau harimau = new Harimau();
        Babi babi = new Babi();
        Jerapah jerapah = new Jerapah();
        
        binatang.MakananBinatang();
        harimau.MakananBinatang();
        babi.MakananBinatang();
        jerapah.MakananBinatang();
                    
       
}
}