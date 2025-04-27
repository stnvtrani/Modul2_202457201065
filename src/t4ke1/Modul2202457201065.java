/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t4ke1;

import javax.swing.JOptionPane;

/**
 *
 * @author sitin
 */
public class Modul2202457201065 {
 void luasSegetiga(){
   double alas = Double.parseDouble(JOptionPane.showInputDialog("Masukkan alas segitiga : "));
   double tinggi = Double.parseDouble(JOptionPane.showInputDialog("Masukkan tinggi segitiga : "));
        double luas = 0.5 * alas * tinggi;
        JOptionPane.showInputDialog(null, "Masukkan Luas Segitiga : " + luas);
 }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Modul2202457201065 m2 = new Modul2202457201065();
        m2.luasSegetiga();
        
        

    }
    
}
