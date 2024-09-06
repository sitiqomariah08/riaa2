/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan02;

/**
 *
 * @author Lenovo
 */
public class MiniMobil extends Mobil implements Affordable, Spacious, Maneuverable {
    
    public MiniMobil(){
        System.out.println("halo dari konstruktor mobil mini");
    }

    @Override
    public void terjangkau() {
        System.out.println("Mobil mini sangat terjangkau bagi banyak kalangan");
    }

    @Override
    public void lapang() {
        System.out.println("Mobil mini memiliki interior yang lapang");
    }

    @Override
    public void mudahDikendalikan() {
        System.out.println("Mobil mini sangat mudah dikendalikan di jalanan sempit");
    }
    
    public void jumlahPintu(){
        System.out.println("Jumlah pintu pada mobil mini hanya ada 2");
    }
    
    public void bahanBakar(){
        System.out.println("Bahan bakar yang digunakan pada mobil mini adalah pertalite");
    }
    
    public void cek(){
        super.jumlahPintu();
        this.jumlahPintu();
        super.bahanBakar();
        this.bahanBakar();
        
    }
}

   