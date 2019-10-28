package belahketupatbehaviour;

import bangundatar.BangunDatar;

public class LayangLayang implements BangunDatar {
     protected double diagonal1;
     protected double diagonal2;
     private double hitungLuas;
    public LayangLayang(double diagonal1, double diagonal2) { //CONSTRUCTOR (Extends Model)
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
    }

    @Override //IMPLEMENTS METHOD BANGUN DATAR
    public double luas() {
        hitungLuas = ((0.5)*diagonal1*diagonal2);
        return hitungLuas;
    }  
} 
