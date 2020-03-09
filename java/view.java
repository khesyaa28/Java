/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miss.java;

/**
 *
 * @author TOSHIBA
 */
public class view {
    public String [] data ={"Nama","BIN","BIG","MAT","Predikat"};
    public void nilai(){
		 for (int i = 0; i < data.length; i++) {
				System.out.print(data[i]+"\t");
			}
			System.out.println();
		

	}
    
}
