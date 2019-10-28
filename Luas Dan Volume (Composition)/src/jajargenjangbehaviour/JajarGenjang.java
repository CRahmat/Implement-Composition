package jajargenjangbehaviour;

import bangundatar.BangunDatar;

public class JajarGenjang implements BangunDatar {
    protected double alas;
    protected double tinggi;
    private double hitungLuas;
    public JajarGenjang(double alas, double tinggi) { //CONSTRUCTOR (Extends Model)
        this.alas = alas;
        this.tinggi = tinggi;
    }
    @Override //IMPLEMENTS METHOD BANGUN DATAR
    public double luas() {
        hitungLuas = alas * tinggi;
        return hitungLuas;
    }
}
