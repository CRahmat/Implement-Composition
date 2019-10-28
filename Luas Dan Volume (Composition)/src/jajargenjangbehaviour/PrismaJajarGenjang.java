package jajargenjangbehaviour;
import bangunruang.BangunRuang;
import jajargenjangbehaviour.JajarGenjang;
public class PrismaJajarGenjang extends JajarGenjang implements BangunRuang {
    private double tinggiPrisma, sisiMiring;
    private double volume;
    private double luasPermukaan;
    private double luasAlas;
    public PrismaJajarGenjang(double alas, double tinggi,double tinggiPrisma,double sisiMiring) { //CONSTRUCTOR (Extends Jajar Genjang)
        super(alas, tinggi);
        this.sisiMiring = sisiMiring;
        this.tinggiPrisma = tinggiPrisma;
        luasAlas = super.luas();
    }
    @Override //IMPLEMENTS METHOD BANGUN RUANG
    public double volume() {
        volume = luasAlas * tinggiPrisma;
        return volume;
        
    }
    @Override //IMPLEMENTS METHOD BANGUN RUANG
    public double luasPermukaan() {
        luasPermukaan = ((2*luasAlas)+(2*sisiMiring*tinggiPrisma)+(2*alas*tinggiPrisma));
        return luasPermukaan;
    }

 
    
    
    
}
