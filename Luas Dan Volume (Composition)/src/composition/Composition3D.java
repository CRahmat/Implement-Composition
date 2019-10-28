package composition;

import bangundatar.BangunDatar;
import bangunruang.BangunRuang;

public class Composition3D {
    private BangunRuang bangunRuang;
    public Composition3D(BangunRuang bangunRuang){
        this.bangunRuang = bangunRuang;
    }
    public double volume(){
        return this.bangunRuang.volume();
    }
    public double luasPermukaan(){
        return this.bangunRuang.luasPermukaan();
    }
}
