/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan02;

/**
 *
 * @author Lenovo
 */
public class KendaraanPribadi {
    private String merek;
    private int tahun;
    
        public KendaraanPribadi(){
        System.out.println("halo dari konstruktor kendaraan pribadi");
        }

    /**
     * @return the merek
     */
    public String getMerek() {
        return merek;
    }

    /**
     * @param merek the merek to set
     */
    public void setMerek(String merek) {
        this.merek = merek;
    }

    /**
     * @return the tahun
     */
    public int getTahun() {
        return tahun;
    }

    /**
     * @param tahun the tahun to set
     */
    public void setTahun(int tahun) {
        this.tahun = tahun;
    }
}
