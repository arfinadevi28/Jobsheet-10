
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ARVINA
 */
public class LatihanPratikum1 {
     public static void main (String[] args) {
        String cari;
        boolean found = false;
        String[] data = {"amy","necha","sofia","raras","tata","rensi"};
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan data yang ingin dicari: ");
        cari = input.nextLine();
        for (int i = 0; i < data.length; i++){
            if (cari == data[i]) {
                found = true;
                break;
            }
        }
        if (found == true) {
            System.out.println("Data ditemukan!");
        } else {
            System.out.println("Data tidak ditemukan!");
        }
    }
}

