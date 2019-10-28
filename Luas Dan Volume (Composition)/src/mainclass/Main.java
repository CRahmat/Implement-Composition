package mainclass;

import belahketupatbehaviour.BelahKetupat;
import belahketupatbehaviour.LayangLayang;
import composition.Composition2D;
import composition.Composition3D;
import lingkaranbehaviour.Lingkaran;
import persegibehaviour.Persegi;
import persegipanjangbehaviour.PersegiPanjang;
import segitigabehaviour.Segitiga;
import persegipanjangbehaviour.Balok;
import lingkaranbehaviour.Bola;
import lingkaranbehaviour.Kerucut;
import lingkaranbehaviour.KerucutTerpancung;
import persegibehaviour.Kubus;
import persegibehaviour.LimasPersegi;
import segitigabehaviour.LimasSegitiga;
import jajargenjangbehaviour.PrismaJajarGenjang;
import segitigabehaviour.PrismaSegitiga;
import lingkaranbehaviour.Tabung;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        String menu, pilihan;
        int mainMenu = 0, choice = 0;
        boolean exception = false;
        do {
            System.out.println("+==================================+");
            System.out.println("|            KALKULATOR            |");
            System.out.println("|   BANGUN RUANG DAN BANGUN DATAR  |");
            System.out.println("+==================================+");
            System.out.println("|1. Bangun Datar                   |");
            System.out.println("|2. Bangun Ruang                   |");
            System.out.println("+==================================+");
            System.out.print(" Pilih[1-2] : ");
            //EXCEPTION (Pengecekan Input Berupa Angka atau Huruf)
            try {
                menu = input.nextLine();
                mainMenu = input.nextByte();//Convert String to Int (Try Error in Integer)
                switch (mainMenu) {
                    case 1: {
                        System.out.println("+==================================+");
                        System.out.println("|      KALKULATOR BANGUN DATAR     |");
                        System.out.println("+==================================+");
                        System.out.println("|1. Persegi                        |");
                        System.out.println("|2. Persegi Panjang                |");
                        System.out.println("|3. Segitiga                       |");
                        System.out.println("|4. Lingkaran                      |");
                        System.out.println("|5. Belah Ketupat                  |");
                        System.out.println("|6. Layang-layang                  |");
                        System.out.println("+==================================+");
                        System.out.print(" Pilih[1-6] : ");
                        //EXCEPTION (Pengecekan Input Berupa Angka atau Huruf)
                        try {
                            pilihan = input.nextLine();
                            choice = Integer.parseInt(pilihan);//Convert String to Int (Try Error in Integer)
                            switch (choice) {
                                case 1: {
                                    double sisi;
                                    System.out.println("+==================================+");
                                    System.out.println("|     KALKULATOR BANGUN PERSEGI    |");
                                    System.out.println("+==================================+");
                                    System.out.print(" Masukkan Sisi   : ");
                                    sisi = input.nextDouble();
                                    Composition2D persegi = new Composition2D(new Persegi(sisi)); //PHOLIMORFISME
                                    System.out.println("Luas Persegi Panjang  : "+persegi.luas());
                                }
                                break;
                                case 2: {

                                    double panjang;
                                    double lebar;
                                    System.out.println("+==================================+");
                                    System.out.println("|     KALKULATOR BANGUN PANJANG    |");
                                    System.out.println("+==================================+");
                                    System.out.print(" Masukan Panjang       : ");
                                    panjang = input.nextDouble();
                                    System.out.print(" Masukkan Lebar        : ");
                                    lebar = input.nextDouble();
                                    Composition2D persegiPanjang = new Composition2D(new PersegiPanjang(panjang, lebar)); //PHOLIMORFISME
                                    System.out.println("Luas Persegi Panjang  : " + persegiPanjang.luas());
                                }
                                break;
                                case 3: {
                                    double alas;
                                    double tinggi;
                                    System.out.println("+==================================+");
                                    System.out.println("|     KALKULATOR BANGUN SEGITIGA   |");
                                    System.out.println("+==================================+");
                                    System.out.print(" Masukkan Alas   : ");
                                    alas = input.nextDouble();
                                    System.out.print(" Masukkan Tinggi : ");
                                    tinggi = input.nextDouble();
                                    Composition2D segitiga = new Composition2D(new Segitiga(alas, tinggi)) ; //PHOLIMORFISME
                                    System.out.println("Luas Segitiga    : " + segitiga.luas());
                                }
                                break;
                                case 4: {
                                    double jariJari;
                                    System.out.println("+==================================+");
                                    System.out.println("|    KALKULATOR BANGUN LINGKARAN   |");
                                    System.out.println("+==================================+");
                                    System.out.print(" Masukkan jari-jari : ");
                                    jariJari = input.nextDouble();
                                    Composition2D lingkaran = new Composition2D(new Lingkaran(jariJari)); //PHOLIMORFISME
                                    System.out.println(" Luas Lingkaran      : " + lingkaran.luas());
                                }
                                break;
                                case 5: {
                                    double d1, d2;
                                    System.out.println("+==================================+");
                                    System.out.println("| KALKULATOR BANGUN BELAH KETUPAT  |");
                                    System.out.println("+==================================+");
                                    System.out.print(" Masukkan Diagonal 1 : ");
                                    d1 = input.nextDouble();
                                    System.out.print(" Masukkan Diagonal 2 : ");
                                    d2 = input.nextDouble();
                                    Composition2D belahKetupat = new Composition2D(new BelahKetupat(d1, d2)); //PHOLIMORFISME
                                    System.out.println(" Luas Belah Ketupat   : " + belahKetupat.luas());

                                }
                                break;
                                case 6: {
                                    double d1, d2;
                                    System.out.println("+==================================+");
                                    System.out.println("| KALKULATOR BANGUN LAYANG LAYANG  |");
                                    System.out.println("+==================================+");
                                    System.out.print(" Masukkan Diagonal 1 : ");
                                    d1 = input.nextDouble();
                                    System.out.print(" Masukkan Diagonal 2 : ");
                                    d2 = input.nextDouble();
                                    Composition2D layangLayang = new Composition2D(new LayangLayang(d1, d2)); //PHOLIMORFISME
                                    System.out.println(" Luas Layang Layang  : " + layangLayang.luas());
                                }
                                break;
                            }
                        } catch (NumberFormatException exe) {
                            System.err.println("Anda Memassukan Selain Angka, Silahkan Massukan Lagi!!!");
                            exception = true;
                        }

                    }
                    break;
                    case 2: {
                        System.out.println("+==================================+");
                        System.out.println("|      KALKULATOR BANGUN RUANG     |");
                        System.out.println("+==================================+");
                        System.out.println("|1. Balok                          |");
                        System.out.println("|2. Kubus                          |");
                        System.out.println("|3. Tabung                         |");
                        System.out.println("|4. Kerucut                        |");
                        System.out.println("|5. Bola                           |");
                        System.out.println("|6. Limas Segitiga                 |");
                        System.out.println("|7. Limas persegi                  |");
                        System.out.println("|8. Prisma Segitiga                |");
                        System.out.println("|9. Prisma Jajar Genjang           |");
                        System.out.println("|10. Kerucut Terpancung            |");
                        System.out.println("+==================================+");
                        System.out.print(" Pilih[1-10] : ");
                        //EXCEPTION (Pengecekan Input Berupa Angka atau Huruf)
                        try {
                            pilihan = input.nextLine();
                            choice = Integer.parseInt(pilihan);//Convert String to Int (Try Error in Integer)
                            switch (choice) {
                                case 1: {
                                    double panjang;
                                    double lebar;
                                    double tinggi;
                                    System.out.println("+==================================+");
                                    System.out.println("|      KALKULATOR BANGUN BALOK     |");
                                    System.out.println("+==================================+");
                                    System.out.print(" Masukkan Panjang     : ");
                                    panjang = input.nextDouble();
                                    System.out.print(" Masukkan Lebar       : ");
                                    lebar = input.nextDouble();
                                    System.out.print(" Masukkan Tinggi      : ");
                                    tinggi = input.nextDouble();
                                    Composition3D balok = new Composition3D(new Balok(panjang, lebar, tinggi)); //PHOLIMORFISME
                                    System.out.println(" Luas Permukaan Balok : " + balok.luasPermukaan());
                                    System.out.println(" Volume Balok         : " + balok.volume());
                                }
                                break;
                                case 2: {
                                    double sisi;
                                    System.out.println("+==================================+");
                                    System.out.println("|      KALKULATOR BANGUN KUBUS     |");
                                    System.out.println("+==================================+");
                                    System.out.print(" Masukkan Sisi        : ");
                                    sisi = input.nextDouble();
                                    Composition3D kubus = new Composition3D(new Kubus(sisi)); //PHOLIMORFISME
                                    System.out.println(" Luas Permukaan Kubus : " + kubus.luasPermukaan());
                                    System.out.println(" Volume Kubus         : " + kubus.volume());
                                }
                                break;
                                case 3: {
                                    double jariJari;
                                    double tinggi;
                                    System.out.println("+==================================+");
                                    System.out.println("|     KALKULATOR BANGUN TABUNG     |");
                                    System.out.println("+==================================+");
                                    System.out.print(" Masukkan Jari-Jari Tabung : ");
                                    jariJari = input.nextDouble();
                                    System.out.print(" Masukkan Tinggi Tabung    : ");
                                    tinggi = input.nextDouble();
                                    Composition3D tabung = new Composition3D(new Tabung(jariJari, tinggi)) ; //PHOLIMORFISME
                                    System.out.println(" Luas Permukaan Tabung     : " + tabung.luasPermukaan());
                                    System.out.println(" Volume Tabung = " + tabung.volume());
                                }
                                break;

                                case 4: {
                                    double jariJari;
                                    double tinggi;
                                    System.out.println("+==================================+");
                                    System.out.println("|     KALKULATOR BANGUN KERUCUT    |");
                                    System.out.println("+==================================+");
                                    System.out.print(" Masukkan Jari-Jari Kerucut : ");
                                    jariJari = input.nextDouble();
                                    System.out.print(" Masukkan Tinggi Tabung     : ");
                                    tinggi = input.nextDouble();
                                    Composition3D kerucut = new Composition3D(new Kerucut(jariJari, tinggi)); //PHOLIMORFISME
                                    System.out.println(" Luas Permukaan Kerucut     : " + kerucut.luasPermukaan());
                                    System.out.println(" Volume Kerucut             : " + kerucut.volume());
                                }
                                break;
                                case 5: {
                                    double jariJari;
                                    System.out.println("+==================================+");
                                    System.out.println("|       KALKULATOR BANGUN BOLA     |");
                                    System.out.println("+==================================+");
                                    System.out.print(" Masukkan Jari-Jari Bola : ");
                                    jariJari = input.nextDouble();
                                    Composition3D bola = new Composition3D(new Bola(jariJari)); //PHOLIMORFISME
                                    System.out.println(" Luas Permukaan Bola     : " + bola.luasPermukaan());
                                    System.out.println(" Volume Bola             : " + bola.volume());
                                }
                                break;
                                case 6: {
                                    double alas;
                                    double tinggiLimas;
                                    double tinggiAlas;
                                    System.out.println("+==================================+");
                                    System.out.println("| KALKULATOR BANGUN LIMAS SEGITIGA |");
                                    System.out.println("+==================================+");
                                    System.out.println(" Masukkan Sisi Alas    : ");
                                    alas = input.nextDouble();
                                    System.out.println(" Masukkan Tinggi Alas  : ");
                                    tinggiAlas = input.nextDouble();
                                    System.out.println(" Masukkan Tinggi Limas : ");
                                    tinggiLimas = input.nextDouble();
                                    Composition3D limasSegitiga = new Composition3D(new LimasSegitiga(alas, tinggiAlas, tinggiLimas)); //PHOLIMORFISME
                                    System.out.println(" Luas Permukaan Limas Seigita : " + limasSegitiga.luasPermukaan());
                                    System.out.println(" Volume Limas Segitiga        : " + limasSegitiga.volume());
                                }
                                break;
                                case 7: {
                                    double sisi;
                                    double tinggi;
                                    System.out.println("+==================================+");
                                    System.out.println("| KALKULATOR BANGUN LIMAS PERSEGI  |");
                                    System.out.println("+==================================+");
                                    System.out.println(" Masukkan Sisi Alas    : ");
                                    sisi = input.nextDouble();
                                    System.out.println(" Masukkan Tinggi Limas : ");
                                    tinggi = input.nextDouble();
                                    Composition3D limasPersegi = new Composition3D(new LimasPersegi(sisi, tinggi)); //PHOLIMORFISME
                                    System.out.println(" Luas Permukaan Limas Persegi : " + limasPersegi.luasPermukaan());
                                    System.out.println(" Volume LImas Persegi         : " + limasPersegi.volume());
                                }
                                break;
                                case 8: {
                                    double alas;
                                    double tinggiPrisma;
                                    double tinggiAlas;
                                    System.out.println("+==================================+");
                                    System.out.println("|KALKULATOR BANGUN PRISMA SEGITIGA |");
                                    System.out.println("+==================================+");
                                    System.out.println(" Masukkan Sisi Alas    : ");
                                    alas = input.nextDouble();
                                    System.out.println(" Masukkan Tinggi Alas  : ");
                                    tinggiAlas = input.nextDouble();
                                    System.out.println(" Masukkan Tinggi Limas : ");
                                    tinggiPrisma = input.nextDouble();
                                    Composition3D prismaSegitiga = new Composition3D(new PrismaSegitiga(alas, tinggiAlas, tinggiPrisma)); //PHOLIMORFISME
                                    System.out.println(" Luas Permukaan Prisma Segitiga : " + prismaSegitiga.luasPermukaan());
                                    System.out.println(" Volume Prisma Segitiga         : " + prismaSegitiga.volume());
                                }
                                break;
                                case 9: {
                                    double alas;
                                    double tinggiPrisma;
                                    double tinggiAlas;
                                    double sisiMiring;
                                    System.out.println("+==================================+");
                                    System.out.println("| KALKULATOR  PRISMA JAJAR GENJANG |");
                                    System.out.println("+==================================+");
                                    System.out.println(" Masukkan Sisi Alas    : ");
                                    alas = input.nextDouble();
                                    System.out.println(" Masukkan Tinggi Alas  : ");
                                    tinggiAlas = input.nextDouble();
                                    System.out.println(" Masukkan Tinggi Limas : ");
                                    tinggiPrisma = input.nextDouble();
                                    System.out.println(" Masukan Sisi Miring   : ");
                                    sisiMiring = input.nextDouble();
                                    Composition3D prismaJajarGenjang = new Composition3D(new PrismaJajarGenjang(alas, tinggiAlas, tinggiPrisma, sisiMiring)); //PHOLIMORFISME
                                    System.out.println(" Luas Permukaan Prisma jajar Genjang : " + prismaJajarGenjang.luasPermukaan());
                                    System.out.println(" Volume Prisma Jajar Genjang         : " + prismaJajarGenjang.volume());
                                }
                                break;
                                case 10: {
                                    double jariJari;
                                    double jariJari2;
                                    double tinggi;
                                    System.out.println("+==================================+");
                                    System.out.println("|  KALKULATOR KERUCUT TERPANCUNG   |");
                                    System.out.println("+==================================+");
                                    System.out.print(" Masukkan Jari-Jari Besar : ");
                                    jariJari2 = input.nextDouble();
                                    System.out.print(" Masukan Jari-Jari Kecil  : ");
                                    jariJari = input.nextDouble();
                                    System.out.print(" Masukkan Tinggi Benda    : ");
                                    tinggi = input.nextDouble();
                                    Composition3D kerucutTerpancung = new Composition3D(new KerucutTerpancung(jariJari, jariJari2, tinggi)); //PHOLIMORFISME
                                    System.out.println("Luas Permukaan            : " + kerucutTerpancung.luasPermukaan());
                                    System.out.println("Volume Kerucut Terpancung : " + kerucutTerpancung.volume());
                                }
                                break;
                            }
                        } catch (NumberFormatException exe) {
                            System.err.println("Anda Memassukan Selain Angka, Silahkan Massukan Lagi!!!");
                            exception = true;
                        }
                    }
                    break;

                }
            } catch (InputMismatchException exe) {
                System.err.println("Anda Memassukan Selain Angka, Silahkan Massukan Lagi!!!");
                exception = true;
            }
        } while (mainMenu < 3 && mainMenu > 0 || exception == true);
    }
}
