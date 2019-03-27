
package tugas4;
import java.util.Scanner;
public class Tugas4 {

    public static void main(String[] args) {
      System.out.println("INI ADALAH TUGAS NOMOR 4");
      Scanner keyboard = new Scanner(System.in);
      
      String nama,alamat;
      int umur;
      
      System.out.println("Nama : ");
      nama = keyboard.next();
      
      System.out.println("Alamat : ");
      alamat = keyboard.next();
      
      System.out.println("Umur : ");
      umur = keyboard.nextInt();
      
      System.out.println("Saudara : " +nama);
      System.out.println("Alamat : " +alamat);
      System.out.println("Berumur : " +umur+ "Tahun");
      
    }
    
}
