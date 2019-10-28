package lingkaranbehaviour;

import bangunruang.BangunRuang;
import lingkaranbehaviour.Kerucut;

public class KerucutTerpancung extends Kerucut implements BangunRuang { //Super Class adalah Kerucut
    private double jariJariKecil;
    private double volume;
    private double luasPermukaan;
    public KerucutTerpancung(double jariJariBesar, double jariJariKecil,double tinggi) { //CONSTRUCTOR (Extends Kerucut)
        super(jariJariBesar,tinggi);
        this.jariJariKecil = jariJariKecil;
    }
    @Override //IMPLEMENTS METHOD BANGUN RUANG
    public double volume() {
        double volumeKerucutKecil = ((0.33333) * super.PHI * (Math.pow(jariJariKecil, 2)) * super.tinggi);
        volume = super.volume() - volumeKerucutKecil;
        return volume;
    }
    @Override //IMPLEMENTS METHOD BANGUN RUANG
    public double luasPermukaan() {
        double alas = super.jariJari - jariJariKecil;
        double s = ((Math.sqrt(Math.pow(alas, 2)))+ (Math.pow(tinggi, 2)));
        luasPermukaan = ((super.PHI * s) *(super.jariJari + jariJariKecil));
        return luasPermukaan;
    }
 
}
