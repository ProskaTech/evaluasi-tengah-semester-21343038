                                                /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts;

/**
 *  created by 21343038 AbelLevran
 * @author Bellevran
 */
import java.util.Scanner; 
public class Soal2 {
    public static void main(String[] args){
        Scanner in = new Scanner (System.in);
        int i, j, k;
        
        System.out.print("Masukkan jumlah baris : ");
        int x = in.nextInt();
        
        for(i = x; i >= 1; i--){
            for(j = x; j > i; j--){
                System.out.print(" ");
            }                
            for(k = 1; k <(2 * i); k++){
                System.out.print("#");
            }
            System.out.println();
        }
        for(i = 1; i <= x; i++){
            for(j = x; j > i; j--){
                System.out.print(" ");
            }
            for(k = 1; k < (2 * i); k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
