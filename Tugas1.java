package tugas1;

import java.util.Scanner;

public class Tugas1 {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
     System.out.println("INI ADALAH TUGAS NOMOR 1");
     int jam,menit,detik,totdek;
     System.out.println("Masukkan Jam = ");
     jam=input.nextInt();
     
     System.out.println("Masukkan Menit = ");
     menit=input.nextInt();
     
     System.out.println("Masukkan Detik = ");
     detik=input.nextInt();
     
     totdek=jam*3600+menit*60+detik;
     System.out.println("Total Detik = " +totdek);
    }
    
}
