
package Inheritance_AmaliaBahari;

public class Lingkaran_AmaliaBahari extends BangunDatar_AmaliaBahari {
    float r;
    
    float luas(){
        float luas = (float) (Math.PI * r * r);
        System.out.println("Luas Lingkaran"+ luas);
        return luas;
    }
    float keliling(){
        float keliling = (float) (Math.PI * r );
        System.out.println("Keliling Lingkaran"+ keliling);
        return keliling;
    }
}
