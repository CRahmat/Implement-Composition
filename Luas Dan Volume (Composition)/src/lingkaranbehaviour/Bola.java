package lingkaranbehaviour;
import bangunruang.BangunRuang;
import lingkaranbehaviour.Lingkaran;
public class Bola extends Lingkaran implements BangunRuang {
    private double jariJari;
    private double luasLingkaran;
    private double volume;
    private double luasPermukaan;
    public Bola(double jariJari) { //CONSTRUCTOR (Extends Lingkaran)
        super(jariJari);
        this.jariJari = jariJari;
        luasLingkaran = super.luas();
    }
    @Override //IMPLEMENTS METHOD BANGUN RUANG
    public double volume() {
        volume = (4/3)*luasLingkaran * jariJari;
        return volume;
    }
    @Override //IMPLEMENTS METHOD BANGUN RUANG
    public double luasPermukaan() {
        luasPermukaan = 4 * super.PHI * luasLingkaran;
        return luasPermukaan;
    }  
}
