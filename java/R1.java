/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miss.java;
import java.util.*;
import java.lang.ArrayIndexOutOfBoundsException;
/**
 *
 * @author TOSHIBA
 */
public class R1 {
    Scanner aku= new Scanner(System.in);
    public String [][] nama =new String[10][10];
    public void nilai(){
        for(int a=0;a<=nama.length;a++){
             System.out.print("Nama Siswa "+a+":");
             nama[a][0]=aku.next();
             nama[a][0]=aku.nextLine();
             
             System.out.print("\n Tambah nama lagi(y/n)? ");
             String jawab=aku.next();
             if(! jawab.equalsIgnoreCase("y")){
                 break;
        }
             System.out.println("-------------------------");
       
        }
         
            System.out.println("");
       
    }
    
}
