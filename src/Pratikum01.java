/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ARVINA
 */

import java.util.Scanner;

public class Pratikum01 {
    public static void main (String[] args) {
        int cari;
        boolean found = false;
        int[] data = new int[]{29,4,10,94,96};
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan data yang ingin dicari");
        cari = input.nextInt();
        for (int i = 0; i < data.length; i++) {
            if (cari == data[1]){
                found = true;
                break;
        }
    }
    
       if (found == true){
           System.out.println("Data ditemukkan!");
       }else{
           System.out.println("Data tidak ditemukkan!");
       }
       }
}

