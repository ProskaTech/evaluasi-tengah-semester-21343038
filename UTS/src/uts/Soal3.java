/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts;

/**
 *
 * @author Bellevran
 */
import javax.swing.JOptionPane;
public class Soal3 {
    public static void main(String[] args) {
        String angka = "";
        angka = JOptionPane.showInputDialog("Silahkan masukkan sebuah angka: ");
        int bilangan = Integer.valueOf(angka).intValue();
        String hasil = "";
        if (bilangan >= 0){
            hasil += "Bilangan Positive";
        } else {
            hasil += "Bilangan Negative";
        }
        JOptionPane.showMessageDialog(null, hasil); 
    }
}
