package persegipanjangbehaviour;

import bangundatar.BangunDatar;

public class PersegiPanjang implements BangunDatar {
     protected double panjang;
     protected double lebar;
     public double hitungLuas;
    public PersegiPanjang(double panjang, double lebar) { //CONSTRUCTOR (Extends Model)
        this.panjang = panjang;
        this.lebar = lebar;
    }

    @Override //IMPLEMENTS METHOD BANGUN DATAR
    public double luas() {
        hitungLuas = panjang * lebar;
        return hitungLuas;
    }   
}
