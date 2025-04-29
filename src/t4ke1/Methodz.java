/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t4ke1;

import javax.swing.JOptionPane;

/**
 *
 * @author sitin
 */
public class Methodz {

    void luasLingkaran() {
        double jariJari = Double.parseDouble(JOptionPane.showInputDialog("Masukkan jari-jari lingkaran: "));
        double luas = 3.14 * jariJari * jariJari;
        JOptionPane.showMessageDialog(null, "Luas lingkaran adalah: " + luas);
    }

    public static void main(String[] args) {
        // Membuat objek dari class Methodz
        Methodz m2 = new Methodz();
        
        // Memanggil method luasLingkaran
        m2.luasLingkaran();
    }
}

