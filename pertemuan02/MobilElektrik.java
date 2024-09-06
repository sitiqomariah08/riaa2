/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan02;

/**
 *
 * @author Lenovo
 */
public class MobilElektrik extends Mobil implements Silent, Efficient, Modern {

    @Override
    public void senyap() {
        System.out.println("Mobil elektrik beroperasi dengan sangat senyap");
    }

    @Override
    public void efisien() {
        System.out.println("Mobil elektrik sangat hemat dalam penggunaan energi");
    }

    @Override
    public void moidern() {
        System.out.println("Mobil elektrik memiliki teknologi yang sangat modern");
    }
}
