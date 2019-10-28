package composition;

import bangundatar.BangunDatar;
import bangunruang.BangunRuang;

public class Composition2D {
    private BangunDatar bangunDatar;
    private BangunRuang bangunRuang;
    public Composition2D(BangunDatar bangunDatar){
        this.bangunDatar = bangunDatar;
    }
    public double luas(){
        return this.bangunDatar.luas();
    }

}
