/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan02;

/**
 *
 * @author Lenovo
 */
public class Elektrik extends Motor implements Quiet, Efficient, Eco_friendly {

    @Override
    public void hening() {
        System.out.println("Motor elektrik berjalan dengan sangat hening");
    }

    @Override
    public void efisien() {
        System.out.println("Motor elektrik sangat efisien dalam penggunaan energi");
    }

    @Override
    public void ramahlingkungan() {
        System.out.println("Motor elektrik sangat ramah lingkungan karena tidak menghasilkan emisi");
    }
    
}
