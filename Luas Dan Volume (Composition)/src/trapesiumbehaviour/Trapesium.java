package trapesiumbehaviour;

import bangundatar.BangunDatar;

public class Trapesium  implements BangunDatar {
     protected double rusukPanjang;
     protected double rusukPendek;
     protected double tinggi;
     private double hitungLuas;
    public Trapesium(double rusukPanjang, double rusukPendek, double tinggi) { //CONSTRUCTOR (Extends Model)
        this.tinggi = tinggi;
        this.rusukPanjang = rusukPanjang;
        this.rusukPendek = rusukPendek;
    }

    @Override //IMPLEMENTS METHOD BANGUN DATAR
    public double luas() {
        hitungLuas = ((0.5)*(rusukPendek+rusukPanjang)*(tinggi));
        return hitungLuas;
    } 
}
