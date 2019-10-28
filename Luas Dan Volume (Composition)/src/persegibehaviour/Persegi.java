package persegibehaviour;

import bangundatar.BangunDatar;

public class Persegi implements BangunDatar {
    protected double sisi;
    private double hitungLuas;
    public Persegi(double sisi) { //CONSTRUCTOR (Extends Model)
        this.sisi = sisi;
    }
     //IMPLEMENTS METHOD BANGUN DATAR
    @Override
    public double luas() {
        hitungLuas = sisi*sisi;
        return hitungLuas;
    }
}
