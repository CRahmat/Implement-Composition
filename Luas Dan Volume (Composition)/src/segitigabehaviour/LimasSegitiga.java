package segitigabehaviour;
import bangunruang.BangunRuang;

public class LimasSegitiga extends Segitiga implements BangunRuang {
    private double  tinggiLimas;
    private double volume;
    private double luasPermukaan;
    private double luasAlas;
    public LimasSegitiga(double alas, double tinggiAlas, double tinggiLimas) { //CONSTRUCTOR (Extends Segitiga)
        super(alas, tinggiAlas);
        this.tinggiLimas = tinggiLimas;
        luasAlas = super.luas();
    }
    @Override //IMPLEMENTS METHOD BANGUN RUANG
    public double volume() {
        volume = (1/3*(luasAlas*tinggiLimas));
        return volume;
    }
    @Override //IMPLEMENTS METHOD BANGUN RUANG
    public double luasPermukaan() {
        luasPermukaan = (luasAlas)+(3 * tinggiLimas * alas * 0.5);
        return luasPermukaan;
    }
}
