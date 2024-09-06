/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan02;

/**
 *
 * @author Lenovo
 */
public class Utama {
    public static void main(String[] args) {
        
        System.out.println("--constructor--");
        MiniMobil sedan = new MiniMobil();
        System.out.println("halo aku mobil sedan mini " + sedan.getMerek()+ ", aku memiliki jumlah pintu "+sedan.getJumlahPintu()+", dan aku berbahan bakar "+ sedan.getBahanBakar());
        System.out.println("");
        System.out.println("--casting--");
        KendaraanPribadi car = (KendaraanPribadi) sedan;
        System.out.println("halo aku car " + car.getMerek()+ " dan aku diproduksi pada tahun "+ car.getTahun());
        System.out.println("");
        System.out.println("--interface--");
        MiniMobil automobile = new MiniMobil();
        automobile.lapang();
        automobile.mudahDikendalikan();
        automobile.terjangkau();
        System.out.println("");
        System.out.println("--super and this--");
        automobile.cek();
        System.out.println("");
        
        System.out.println("--constructor--");
        Sport motorcycle = new Sport();
        System.out.println("halo aku sepeda motor "+ motorcycle.getMerek()+ ", aku memiliki tenaga sebesar "+ motorcycle.getCc()+
                ", dan aku juga memiliki standar ukuran yaitu "+ motorcycle.getStandarUkuran());
        System.out.println("");
        System.out.println("--casting--");
        KendaraanPribadi vespa = (KendaraanPribadi) motorcycle;
        System.out.println("hai aku vespa " + vespa.getMerek()+ " dan aku diproduksi pada tahun "+ vespa.getTahun());
        System.out.println("");
        System.out.println("--interface--");
        Sport supra = new Sport();
        supra.agresif();
        supra.aerodinamis();
        supra.kecepatanPuncak();
        System.out.println("");
        System.out.println("--super and this--");
        supra.cek_lagi();
        System.out.println("");
    }
}
