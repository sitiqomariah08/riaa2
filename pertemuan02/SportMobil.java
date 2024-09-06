/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan02;

/**
 *
 * @author Lenovo
 */
public class SportMobil extends Mobil implements Fast, Powerfull, Sleek {

    @Override
    public void cepat() {
        System.out.println("Mobil sport memiliki kecepatan yang luar biasa");
    }

    @Override
    public void bertenaga() {
        System.out.println("Mobil sport sangat bertenaga, cocok untuk balapan");
    }

    @Override
    public void ramping() {
        System.out.println("Mobil sport memiliki desain yang ramping dan aerodinamis");
    }
    
}
