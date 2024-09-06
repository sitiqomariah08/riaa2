/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan02;

/**
 *
 * @author Lenovo
 */
public class Motor extends KendaraanPribadi {

    private int cc;
    private int standarUkuran;

    public Motor() {
        System.out.println("halo dari konstruktor motor");
        this.setCc(150);
        this.setStandarUkuran(2056);
        super.setMerek("Honda");
        super.setTahun(2018);
    }

    /**
     * @return the cc
     */
    public int getCc() {
        return cc;
    }

    /**
     * @param cc the cc to set
     */
    public void setCc(int cc) {
        this.cc = cc;
    }

    /**
     * @return the standarUkuran
     */
    public int getStandarUkuran() {
        return standarUkuran;
    }

    /**
     * @param standarUkuran the standarUkuran to set
     */
    public void setStandarUkuran(int standarUkuran) {
        this.standarUkuran = standarUkuran;
    }
    
     public void cc(){
        System.out.println("Motor pada umumnya memiliki batas maksimal kecepatan yaitu 125 cc");
    }
    
    public void standarUkuran(){
        System.out.println("Motor pada umumnya memiliki standar ukuran yaitu 1,5 meter");
    }
}
