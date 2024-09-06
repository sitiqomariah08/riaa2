/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan02;

/**
 *
 * @author Lenovo
 */
public class Mobil extends KendaraanPribadi {
    private int jumlahPintu;
    private String bahanBakar;
    
    public Mobil(){
    System.out.println("halo dari konstruktor mobil");
    this.setJumlahPintu(4);
    this.setBahanBakar("Pertamax");
    super.setMerek("Toyota Yaris");
    super.setTahun(2023);
    }

    /**
     * @return the jumlahPintu
     */
    public int getJumlahPintu() {
        return jumlahPintu;
    }

    /**
     * @param jumlahPintu the jumlahPintu to set
     */
    public void setJumlahPintu(int jumlahPintu) {
        this.jumlahPintu = jumlahPintu;
    }

    /**
     * @return the bahanBakar
     */
    public String getBahanBakar() {
        return bahanBakar;
    }

    /**
     * @param bahanBakar the bahanBakar to set
     */
    public void setBahanBakar(String bahanBakar) {
        this.bahanBakar = bahanBakar;
    }
    
     public void jumlahPintu(){
        System.out.println("Jumlah pintu pada mobil ada 4");
    }
    
    public void bahanBakar(){
        System.out.println("Bahan bakar yang digunakan pada mobil adalah pertalite dan pertamax");
    }
}
