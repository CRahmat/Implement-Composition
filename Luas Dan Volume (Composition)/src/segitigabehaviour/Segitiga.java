package segitigabehaviour;

import bangundatar.BangunDatar;

public class Segitiga implements BangunDatar {
     protected double alas;
     protected double tinggi;
     private double hitungLuas;
    public Segitiga(double alas, double tinggi) { //CONSTRUCTOR (Extends Model)
        this.alas = alas;
        this.tinggi = tinggi;
    }
    @Override //IMPLEMENTS METHOD BANGUN DATAR
    public double luas() {
        hitungLuas = 0.5 * alas * tinggi;
        return hitungLuas;
    }  
}
