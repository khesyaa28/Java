
package miss.java;
import java.util.*;
import java.lang.ArrayIndexOutOfBoundsException;
/**
 *
 * @author TOSHIBA
 */
public class R2 {
    Scanner aku= new Scanner(System.in);
    public int [][] n =new int[25][25];
    public void nilai(){
        for(int a=0;a<=n.length;a++){
             System.out.print("Nilai Siswa "+a+":");
             n[a][0]=aku.nextInt();
             
             System.out.print("\n Tambah nilai lagi(y/n)? ");
             String jawab=aku.next();
             if(! jawab.equalsIgnoreCase("y")){
                 break;
        }
             System.out.println("-------------------------");
       
        }
    }
    
    public void tampil(){
        for (int i = 0; i < n.length; i++) {
			for (int j = 0; j < n[i].length; j++) {
				System.out.print(n[i][j]+"\t");
			}
			System.out.println();
		}
    }
    
}

