/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan02;

/**
 *
 * @author Lenovo
 */
public class Sport extends Motor implements TopSpeed, Aerodynamic, Aggresive {

    public Sport(){
        System.out.println("halo dari konstruktor motor sport");
    }
    
    @Override
    public void kecepatanPuncak() {
        System.out.println("motor sport memiliki kecepatan puncak yaitu 249 mph");
    }

    @Override
    public void aerodinamis() {
        System.out.println("Desain motor sport sangat aerodinamis");
    }

    @Override
    public void agresif() {
        System.out.println("Motor sport memiliki gaya berkendara yang agresif");
    }
    
    public void cc(){
        System.out.println("Motor sport memiliki batas maksimal kecepatan yaitu 250 cc");
    }
    
    public void standarUkuran(){
        System.out.println("Motor sport memiliki standar ukuran yaitu 2 meter");
    }
    
    public void cek_lagi(){
        super.standarUkuran();
        this.standarUkuran();
        super.cc();
        this.cc();
    }
}
