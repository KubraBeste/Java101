import java.util.Scanner;

public class KDV {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double odenecekTutar;
        double KDVsizFiyat;
        int KDV;

        System.out.print("KDV'siz Fiyat: ");
        KDVsizFiyat = inp.nextDouble();

        if(KDVsizFiyat <= 1000 && KDVsizFiyat > 0 ){
            KDV = 18;
            odenecekTutar = (KDVsizFiyat * 18 )/100 + KDVsizFiyat;

            System.out.println("KDVsiz Fiyat : " + KDVsizFiyat );
            System.out.println("KDV : % " + KDV );
            System.out.println("Ödenecek Tutar : " +odenecekTutar);
        }else if(KDVsizFiyat>1000){
            KDV = 8;
            odenecekTutar = (KDVsizFiyat * 8 )/100 + KDVsizFiyat;

            System.out.println("KDVsiz Fiyat : " + KDVsizFiyat );
            System.out.println("KDV : % " + KDV );
            System.out.println("Ödenecek Tutar : " +odenecekTutar);
        }

    }
}
