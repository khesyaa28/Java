/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miss.java;

import java.util.Scanner;

/**
 *
 * @author TOSHIBA
 */
public class R3 {
    public int [] nilai =new int[25];
        Scanner aku= new Scanner(System.in);
        
    public void nilai(){
        

        for(int a=0;a<=nilai.length;a++){
             System.out.print("Nilai Siswa "+(a+1)+":");
             nilai[a]=aku.nextInt();
           
             
             System.out.print("\n Tambah nilai lagi? ");
             String jawab=aku.next();
             if(! jawab.equalsIgnoreCase("y")){
                 break;
        }
             System.out.println("-------------------------");
       
        }
         for(int a=0;a<=nilai.length;a++){
                System.out.format("| %s | \t", nilai.length);
            }
            System.out.println("");
       
    }
    
}
