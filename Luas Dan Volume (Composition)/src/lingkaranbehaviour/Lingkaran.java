package lingkaranbehaviour;

import bangundatar.BangunDatar;

public class Lingkaran implements BangunDatar {
    protected  double jarijari;
    private double hitungLuas;
    public final double PHI = 3.14;
    public Lingkaran(double jarijari) { //CONSTRUCTOR (Extends Model)
        this.jarijari = jarijari;
    }
    @Override //IMPLEMENTS METHOD BANGUN DATAR
    public double luas() {
        hitungLuas = PHI * Math.pow(jarijari,2);
        return hitungLuas;
    }
}
