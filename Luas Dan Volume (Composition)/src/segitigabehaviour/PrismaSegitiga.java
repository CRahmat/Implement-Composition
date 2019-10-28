package segitigabehaviour;
import bangunruang.BangunRuang;

public class PrismaSegitiga extends Segitiga implements BangunRuang {
    private double tinggiPrisma;
    private double volume;
    private double luasPermukaan;
    private double luasAlas;
    public PrismaSegitiga(double alas, double tinggi,double tinggiPrisma) { //CONSTRUCTOR (Extends Segitiga)
        super(alas, tinggi);
        this.tinggiPrisma = tinggiPrisma;
        luasAlas = super.luas();
    }
    @Override //IMPLEMENTS METHOD BANGUN RUANG
    public double volume() {
        volume =  (luasAlas*tinggiPrisma);
        return volume;
    }
    @Override //IMPLEMENTS METHOD BANGUN RUANG
    public double luasPermukaan() {
        double luasBidangTegak=((0.5)*alas*tinggiPrisma);
        luasPermukaan = ((2*luasAlas)+(3*luasBidangTegak));
        return luasPermukaan;
    }
 
}
