package persegibehaviour;
import bangunruang.BangunRuang;
import persegibehaviour.Persegi;
public class LimasPersegi extends Persegi implements BangunRuang {
    private double tinggi;
    private double tinggiSegitiga;
    private double volume;
    private double luasPermukaan;
    private double luasAlas;
    public LimasPersegi(double sisi,double tinggi) { //CONSTRUCTOR (Extends Persegi)
        super(sisi);
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
        tinggiSegitiga = Math.sqrt((Math.pow((super.sisi/2), 2)) + (Math.pow(tinggi, 2)));
        luasPermukaan = (((luasAlas)+(4*((0.5)*super.sisi*tinggiSegitiga))));
        return luasPermukaan;
    }

    


    

    
    
}
