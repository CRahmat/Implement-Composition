package lingkaranbehaviour;
import bangunruang.BangunRuang;
import lingkaranbehaviour.Lingkaran;
public class Kerucut extends Lingkaran implements BangunRuang {
    protected double tinggi;
    private double luasLingkaran;
    private double volume;
    private double luasPermukaan;
    private double garispelukis;
    protected double jariJari;
    public Kerucut(double jariJari, double tinggi) { //CONSTRUCTOR (Extends Lingkaran)
        super(jariJari);
        this.jariJari = jariJari;//Agar Lebih mudah dipahami saat menggunakan extends
        this.tinggi = tinggi;
        luasLingkaran = super.luas();
    }
    @Override //IMPLEMENTS METHOD BANGUN RUANG
    public double volume() {
        volume = 0.3333 * luasLingkaran * tinggi;
        return volume;
    }
    @Override //IMPLEMENTS METHOD BANGUN RUANG
    public double luasPermukaan(){
        garispelukis = (luas() + Math.pow(tinggi, 2));
        luasPermukaan = luasLingkaran + jarijari * garispelukis;
        return luasPermukaan;
    }

}
