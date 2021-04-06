
package Inheritance_AmaliaBahari;


public class Overloading_AmaliaBahari {

    
    public static void main(String args[]) {
        BangunDatar_AmaliaBahari bangunDatar = new BangunDatar_AmaliaBahari ();
        
        Persegi_AmaliaBahari persegi = new Persegi_AmaliaBahari ();
        
        Segitiga_AmaliaBahari segitiga = new Segitiga_AmaliaBahari ();
        
        Lingkaran_AmaliaBahari lingkaran = new Lingkaran_AmaliaBahari ();
        
        PersegiPanjang_AmaliaBahari panjang = new PersegiPanjang_AmaliaBahari ();
        
        System.out.println("");
        bangunDatar.luas();
        bangunDatar.keliling();
        
        System.out.println("");
        
        System.out.println("-------------------------");
        System.out.println("Lingkaran");
        System.out.println("");
        System.out.println("Luas Lingkaran :" + lingkaran.luas());
        System.out.println("Keliling Lingkaran :" + lingkaran.keliling());
        
        
        System.out.println("");
        
        System.out.println("-------------------------");
        System.out.println("Persegi");
        System.out.println("");
        System.out.println("Luas Persegi :" + persegi.luas());
        System.out.println("Keliling Persegi :" + persegi.keliling());
        
        
        System.out.println("");
        
        System.out.println("-------------------------");
        System.out.println("Segitiga");
        System.out.println("");
        System.out.println("Luas Segitiga :" + segitiga.luas());
       
        System.out.println("");
        
        System.out.println("-------------------------");
        System.out.println("PersegiPanjang");
        System.out.println("");
        System.out.println("Luas Persegi Panjang :" + panjang.luas());
        System.out.println("Keliling Persegi Panjang:" + panjang.keliling());
        
        System.out.println("");
        
    }
}
