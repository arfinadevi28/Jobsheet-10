/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * 
 */
import java.util.Scanner;

public class TugasPratikum01 {
    public static void main (String[] args) {
        int cari;
        int find = 0;
        boolean found = false;
        int [] data= new int[]{74,98,72,74,72,90,81,72};
        Scanner input = new Scanner(System.in);
        System.out.println("Data pada array: ");
        for (int i=0;i<data.length;i++){
    System.out.println(data[i]+"\t");
 }   
        System.out.println("\nMasukkan data yang dicari :  ");
        
        cari = input.nextInt();
        for (int i = 0; i<data.length; i++){
            if(cari == data[i]){
                find++;
    }
        }System.out.println("Data ditemukan sebanyak "+ cari + " kali ");
    }
}
              
    

