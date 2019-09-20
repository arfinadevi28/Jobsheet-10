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

public class TugasPratikum02 {
    public static void main (String[] args) {
      int angka =0;
      int [] data =new int[]{83,76,45,90,85,80,78,74};
      System.out.println("Data pada array: ");
      for (int i=0;i<data.length;i++){
          System.out.print(data[i]+"\t");
      }
           double ratarata = 0;
           for(int i = 0; i<data.length; i++)ratarata+= data[i];
           ratarata /= data.length;
           System.out.println("\njadi ratarata nilai adalah :" + ratarata);
    
           for(int k = 0; k<data.length; k++){
               if(data[k]> ratarata){
                   System.out.println("Nilai yang diatas rata-rata adalah: "+ data[k] + "\t");
               }
           }
    
    
      }
              
              }

