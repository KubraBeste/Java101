import java.util.Scanner;

public class CalculationOfTaximeter {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        double openingFee = 10.0;
        double KMFee = 2.20;
        double minimumFee= 20.0;
        double totalKM,totalFee;

        System.out.print("Enter the total KM :");
        totalKM = inp.nextDouble();

        totalFee = openingFee + KMFee*totalKM;
        if(totalFee < minimumFee){
            totalFee = minimumFee;
            System.out.println("Taximeter is " +totalFee);
        }else{
            System.out.println("Taximeter is " +totalFee);
        }


    }
}
