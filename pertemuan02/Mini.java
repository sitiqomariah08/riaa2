/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan02;

/**
 *
 * @author Lenovo
 */
public class Mini extends Motor implements Compact, Lightweight, Nimble {
    
    public void kompak() {
        System.out.println("Motor mini memiliki desain yang kompak");
    }

    @Override
    public void ringan() {
        System.out.println("Motor mini sangat ringan untuk dikendarai");
    }

    @Override
    public void gesit() {
        System.out.println("Motor mini sangat gesit di jalanan");
}
}
