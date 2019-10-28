package persegibehaviour;
import bangunruang.BangunRuang;
import persegibehaviour.Persegi;
public class Kubus extends Persegi implements BangunRuang {
    private double volume;
    private double luasPermukaan;
    private double luasAlas;
    public Kubus(double sisi) { //CONSTRUCTOR (Extends Kubus)
        super(sisi);
    }
    @Override //IMPLEMENTS METHOD BANGUN RUANG
    public double volume() {
        volume = Math.pow(super.sisi,3);
        return volume;
    }
    @Override //IMPLEMENTS METHOD BANGUN RUANG
    public double luasPermukaan() {
        luasPermukaan = 6 * super.luas();
        return luasPermukaan;
    }

    

   
    
}
