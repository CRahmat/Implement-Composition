package belahketupatbehaviour;

import bangundatar.BangunDatar;

public class BelahKetupat implements BangunDatar {
    protected final double diagonal1;
    protected  final double diagonal2;
    private double hitungLuas;
    public BelahKetupat(double diagonal1, double diagonal2) { //CONSTRUCTOR (Extends Model)
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
    }
    @Override //IMPLEMENTS METHOD BANGUN DATAR
    public double luas() {
        hitungLuas = ((0.5) * diagonal1 * diagonal2);
        return hitungLuas;
    }
}
