
package Inheritance_AmaliaBahari;

public class Segitiga_AmaliaBahari extends BangunDatar_AmaliaBahari {
    float alas;
    float tinggi;
    
    float luas(){
        float luas = 1/2 * (alas*tinggi);
        System.out.println("Luas Segitiga" + luas);
        return luas;
        
    }
    }
