
package Inheritance_AmaliaBahari;


public class Overriding_AmaliaBahari {

    
    public static void main(String args[]) {
         
        BangunDatar_AmaliaBahari bangunDatar = new BangunDatar_AmaliaBahari ();
        
        Lingkaran_AmaliaBahari lingkaran = new Lingkaran_AmaliaBahari ();
        lingkaran.r =18;
        
        Persegi_AmaliaBahari persegi = new Persegi_AmaliaBahari ();
        persegi.sisi =30;
        
        PersegiPanjang_AmaliaBahari panjang = new PersegiPanjang_AmaliaBahari();
        panjang.panjang = 10;
        panjang.lebar=6;
        
        Segitiga_AmaliaBahari segitiga = new Segitiga_AmaliaBahari();
        segitiga.alas = 10;
        segitiga.tinggi=6;
        
        System.out.println("");
        bangunDatar.luas();
        bangunDatar.keliling();
        
        System.out.println("");
        
        System.out.println("-------------------------");
        System.out.println("Lingkaran");
        System.out.println("");
        persegi.luas();
        persegi.keliling();
        
        System.out.println("");
        
        System.out.println("-------------------------");
        System.out.println("Persegi");
        System.out.println("");
        persegi.luas();
        persegi.keliling();
        
        System.out.println("");
        
        System.out.println("-------------------------");
        System.out.println("Lingkaran");
        System.out.println("");
        persegi.luas();
        persegi.keliling();
        
        System.out.println("");
        
        System.out.println("-------------------------");
        System.out.println("Persegi");
        System.out.println("");
        persegi.luas();
        persegi.keliling();
        
        System.out.println("");
        
        System.out.println("-------------------------");
        System.out.println("Segitiga");
        System.out.println("");
        persegi.luas();
        persegi.keliling();
        
        System.out.println("");
    }
}
