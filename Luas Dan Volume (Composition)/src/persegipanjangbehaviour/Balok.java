package persegipanjangbehaviour;
import bangunruang.BangunRuang;
import persegipanjangbehaviour.PersegiPanjang;
public class Balok extends PersegiPanjang implements BangunRuang {
       private double tinggi;
       private double luasAlas;
       private double volume;
       private double luasPermukaan;
    public Balok(double panjang, double lebar,double tinggi) { //CONSTRUCTOR (Extends Persegi Panjang)
        super(panjang, lebar);
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
        luasPermukaan = (2 *luasAlas) + (2 * panjang * tinggi) + (2 * lebar * tinggi);
        return luasPermukaan;
    }
    
    
}
