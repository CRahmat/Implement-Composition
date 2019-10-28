package lingkaranbehaviour;
import bangunruang.BangunRuang;
import lingkaranbehaviour.Lingkaran;
public class Tabung extends Lingkaran implements BangunRuang {
    private double tinggi;
    private double volume;
    private double luasPermukaan;
    private double luasAlas;
    public Tabung(double jariJari, double tinggi) { //CONSTRUCTOR (Extends Tabung)
        super(jariJari);
        this.tinggi = tinggi;
        luasAlas = super.luas();
    }
    @Override //IMPLEMENTS METHOD BANGUN RUANG
    public double volume() {
        volume = luasAlas * tinggi;
        return volume;
    }
    @Override //IMPLEMENTS METHOD BANGUN RUANG
    public double luasPermukaan() {
        luasPermukaan = (super.PHI * (2 *super.jarijari)*(super.jarijari + tinggi));
        return luasPermukaan;
    }  
}
