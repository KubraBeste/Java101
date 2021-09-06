package Giris;
import java.util.Scanner;

public class Baslangic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int fizik, matematik, kimya  , tarih , muzik;
        int turkce ;
        int result ;
        double average;
        System.out.print("Fizik: ");
        fizik = input.nextInt();
        System.out.print("Matematik: ");
        matematik = input.nextInt();
        System.out.print("Kimya: ");
        kimya = input.nextInt();
        System.out.print("Türkce: ");
        turkce = input.nextInt();
        System.out.print("Tarih: ");
        tarih = input.nextInt();
        System.out.print("Müzik: ");
        muzik = input.nextInt();

        result = (fizik + matematik + kimya + tarih + tarih + muzik);
        average = result / 6;
        System.out.print("Average: " + average);

        boolean kosul = result >=50;
        System.out.println("\nDurum : " + (kosul == true ? "Geçti" : "Kaldı"));



    }
}
